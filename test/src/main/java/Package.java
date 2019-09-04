import java.io.File;

/**
 * @author ☞ 🏀 huqingfeng
 * @date 2019-09-04
 */
public class Package {
    public static void main(String[] args) throws Exception{
        String fileName = "/Users/huqingfeng/Documents/Middleware/jdbc-route/src/jars";
        File file = new File(fileName);
        File[] files = file.listFiles();
        if (files!=null){
            for (File f : files) {
                f.delete();
                System.out.println(" delete file : "+f.getName());
            }
        }

        Copy.main(args);
    }
}
