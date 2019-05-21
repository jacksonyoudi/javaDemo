import java.io.*;
import java.nio.charset.Charset;

public class File {

    public static void main(String[] args) {
        try {
            OutputStream output = new FileOutputStream("/Users/zego/1.go");
            try {
                String data = "hello, 123, youdi";
                byte[] bytes = data.getBytes(Charset.forName("UTF-8"));
                output.write(bytes);
                output.close();
                output.flush();
            } catch (IOException m) {
                System.out.println(m.getMessage());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            System.exit(2);
        }

        try {
            InputStream input = new FileInputStream("hello.txt");
            byte[] buf = new byte[1024];
            try {
                int bytesRead = input.read(buf);
                String data = new String(buf, 0, bytesRead, "UTF-8");
                System.out.println(data);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }

            int b = -1;
            int bytesRead = 0;
//            while ((b = input.read()) != -1) {
//                buf[bytesRead++] = (byte) b;
//            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
