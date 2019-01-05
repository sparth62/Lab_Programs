package networking;
import java.io.*;
import java.net.*;
public class TcpFileClient {
    public static void main(String[] args) {
        try{
            Socket s = new Socket("127.0.0.1",6666);
            byte b[] = new byte[100];
            InputStream is = s.getInputStream();
            FileOutputStream fr = new FileOutputStream("F:\\output.txt");
            is.read(b,0,b.length);
            fr.write(b, 0, b.length);
            s.close();
            is.close();
            fr.close();
        }
        catch(Exception e){System.out.println(e);}
    }
}
