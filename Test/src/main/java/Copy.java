import java.io.File;
import java.io.FilenameFilter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * @author ☞ 🏀 huqingfeng
 * @date 2019-09-03
 */
public class Copy {
    public static void main(String[] args) throws Exception{

        System.setProperty("cp.from","/Users/huqingfeng/Downloads/apache-shardingsphere-incubating-4.0.0-RC2-src-release/Test/src/main/resources/a");
        System.setProperty("cp.to","/Users/huqingfeng/Downloads/apache-shardingsphere-incubating-4.0.0-RC2-src-release/Test/src/main/resources/b");
        System.setProperty("cp.symbol","java");

        String from = null;
        String to = null;
        String symbol = null;
        if (args.length > 2){
            from = args[0];
            to = args[1];
            symbol = args[2];
        }
        from = System.getProperty("cp.from",from);
        to = System.getProperty("cp.to",to);
        symbol = System.getProperty("cp.symbol",symbol);
        File file = new File(from);

        // for lambda
        String finalSymbol = symbol;
        cp(file,to,symbol == null ? null :
                (f, name)->
                        name.lastIndexOf(finalSymbol) + finalSymbol.length() == name.length());

    }

    private static void cp(File file, String to, FilenameFilter filenameFilter) throws Exception {
        if (!file.isDirectory()) {
            String name = file.getName();
            if (filenameFilter.accept(file,name)) {
                Files.copy(file.toPath(), Paths.get(to + "/" + name),
                        StandardCopyOption.REPLACE_EXISTING);
            }
            return;
        }
        copy(file.listFiles(),to,filenameFilter);
    }

    private static void copy(File[] files, String to, FilenameFilter filenameFilter) throws Exception {
        if (files == null)return;
        for (File file : files) {
            cp(file,to,filenameFilter);
        }
    }
}
