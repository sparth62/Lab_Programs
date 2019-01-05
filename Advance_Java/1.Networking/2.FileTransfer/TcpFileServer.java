package networking;
import java.io.*;
import java.net.*;

public class TcpFileServer {
    public static void main(String[] args) {
        try{
            ServerSocket ss = new ServerSocket(6666);
            System.out.println("Waiting for connection request...");
            Socket s = ss.accept();
            System.out.println("Connection request is accepted...");
            FileInputStream fr = new FileInputStream("E:\\input.txt");
            byte b[]= new byte[100];
            fr.read(b,0,b.length);
            OutputStream os = s.getOutputStream();
            os.write(b,0,b.length);
            os.close();
            fr.close();
            s.close();
            ss.close();
        }
        catch(Exception e){System.out.println(e);}
    }
}
