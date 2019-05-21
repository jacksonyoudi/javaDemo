import java.io.FileInputStream;
import java.io.InputStream;

public class ByteArray {

    public static void main(String[] args) {
        try {
            InputStream input = new FileInputStream("hello.txt");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
