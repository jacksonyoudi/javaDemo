import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class RAF {
    public static void main(String[] args) {
        try {
            RandomAccessFile fe = new RandomAccessFile("abc.dat", "rw");
            MappedByteBuffer buf = fe.getChannel().map(FileChannel.MapMode.READ_WRITE, 0, fe.length());
            fe.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {

        }


    }
}
