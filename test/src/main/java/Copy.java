import java.io.File;
import java.io.FilenameFilter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.*;

/**
 * @author ☞ 🏀 huqingfeng
 * @date 2019-09-03
 */
public class Copy {
    public static void main(String[] args) throws Exception {

        System.setProperty("cp.from", "/Users/huqingfeng/Documents/Middleware/jdbc-route");
        System.setProperty("cp.to", "/Users/huqingfeng/Documents/Middleware/jdbc-route/src/jars");
        System.setProperty("cp.symbol", ".jar");
        System.setProperty("cp.excludes",
                "sharding-transaction-base-seata-at-4.0.0-RC2.jar," +
                        "sharding-transaction-xa-bitronix-manager-4.0.0-RC2.jar," +
                        "sharding-transaction-xa-narayana-manager-4.0.0-RC2.jar," +
                        "sharding-transaction-xa-atomikos-manager-4.0.0-RC2.jar," +
                        "sharding-transaction-xa-core-4.0.0-RC2.jar," +
                        "sharding-transaction-xa-spi-4.0.0-RC2.jar");

        String from , to , symbol , excludes;

        from = System.getProperty("cp.from");
        to = System.getProperty("cp.to");
        symbol = System.getProperty("cp.symbol");
        excludes = System.getProperty("cp.excludes");

        if (args.length == 4) {
            from = args[0];
            to = args[1];
            symbol = args[2];
            excludes = args[3];
        }

        File file = new File(from);

        // for lambda
        String finalSymbol = symbol;
        Set<String> finalExclude = new HashSet<>();
        if (excludes != null) {
            finalExclude.addAll(Arrays.asList(excludes.split(",")));
        }
        cp(file, to, symbol == null ? null :
                (f, name) ->
                        !finalExclude.contains(name)
                                &&
                                name.lastIndexOf(finalSymbol) + finalSymbol.length() == name.length());

    }

    private static void cp(File file, String to, FilenameFilter filenameFilter) throws Exception {
        if (!file.isDirectory()) {
            String name = file.getName();
            if (filenameFilter.accept(file, name)) {
                Files.copy(file.toPath(), Paths.get(to + "/" + name),
                        StandardCopyOption.REPLACE_EXISTING);
            }
            return;
        }
        copy(file.listFiles(), to, filenameFilter);
    }

    private static void copy(File[] files, String to, FilenameFilter filenameFilter) throws Exception {
        if (files == null) return;
        for (File file : files) {
            cp(file, to, filenameFilter);
        }
    }
}
