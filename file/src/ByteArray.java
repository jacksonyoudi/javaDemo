import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

public class ByteArray {

    public static void main(String[] args) {
        try {
            InputStream input = new FileInputStream("hello.txt");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


//        try {
//            DataInputStream out = new DataOutputStream(
//                    new FileOutputStream("test.data");
//            )
//        } catch () {
//
//        }


    }


}
