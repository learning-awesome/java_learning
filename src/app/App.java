package app;
import net.coobird.thumbnailator.Thumbnails;
import java.io.File;

public class App { 

    private static void compressImage(String filepath) throws Exception  {
        String root = System.getProperty("user.dir");
        String fromFilename = root + "/" + filepath;
        File fromFile = new File(fromFilename);
        String filename = fromFile.getName();
        System.out.println(fromFilename + " size: " + fromFile.length()/1024 + "KB");
        //尺寸不变，修改文件大小
        for(int i=9;i>5; i--) {
            String toFilepath = root + "/dist/" + i + "_" + filename;
            Thumbnails.of(fromFile).scale(1).outputQuality(i/10.0).toFile(toFilepath);
            File toFile = new File(toFilepath);
            long l = toFile.length();
            System.out.println(toFilepath + " size: " + l/1024 + "KB");
        }
        System.out.println("\r\n");
    }
    public static void main(String[] args) throws Exception {
        compressImage("resource/high.jpg");
        compressImage("resource/wzry.png");
    }
}