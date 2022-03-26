import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("src/text.txt");
        System.out.println(file.exists());
        file.createNewFile();
        file.renameTo(new File("src/text2.txt"));


        byte[] bytes = {123, 15, 15, 17, 125};


        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes); // пригодится, если буду работать с графикой или с файловой системой напрямую
        byte b = 0;
        while (b!=-1){
            b=(byte) byteArrayInputStream.read();
            System.out.println(b);
        }

    }
}
