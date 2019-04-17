package app;
import net.coobird.thumbnailator.Thumbnails;
import java.io.File;

public class App { 
    public static void main(String[] args) throws Exception {
        String root = System.getProperty("user.dir");
        String img = root + "/resource/high.jpg";
        File fromFile = new File(img);
        //尺寸不变，修改文件大小
        Thumbnails.of(fromFile).scale(1).toFile(root + "/dist/high_compress.jpg");
        Thumbnails.of(fromFile).scale(1).outputQuality(0.9f).toFile(root + "/dist/high_compress_9.jpg");
        Thumbnails.of(fromFile).scale(1).outputQuality(0.8f).toFile(root + "/dist/high_compress_8.jpg");
        Thumbnails.of(fromFile).scale(1).outputQuality(0.7f).toFile(root + "/dist/high_compress_7.jpg");
        Thumbnails.of(fromFile).scale(1).outputQuality(0.6f).toFile(root + "/dist/high_compress_6.jpg");
        Thumbnails.of(fromFile).scale(1).outputQuality(0.5f).toFile(root + "/dist/high_compress_5.jpg");
    }
}