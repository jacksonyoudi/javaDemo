import java.io.*;
import java.util.zip.GZIPOutputStream;

public class Z {
    public static void main(String[] args) {

    }

    public static void gzip(String fileName) throws IOException {
        InputStream in = null;
        String gzipFileName = fileName + ".gz";
        OutputStream out = null;

        try {
            in = new BufferedInputStream(new FileInputStream(fileName));
            out = new GZIPOutputStream(new BufferedOutputStream(new FileOutputStream(gzipFileName)));
//            copy(in, out);

        } finally {
            if (out != null) {
                out.close();
            }
            if (in != null) {
                in.close();
            }
        }
    }
}
