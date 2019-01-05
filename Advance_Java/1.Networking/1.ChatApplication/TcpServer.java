package networking;
import java.io.*;
import java.net.*;
public class TcpServer {
    public static void main(String[] args) {
        try{
            ServerSocket ss = new ServerSocket(6666);
            System.out.println("Waiting for connection request...");
            Socket s = ss.accept();
            System.out.println("Connection request is accepted...");
            DataInputStream dis = new DataInputStream(s.getInputStream());
            String str = (String)dis.readUTF();
            System.out.println("message : " + str);
            ss.close();
            s.close();
            dis.close();
        }
        catch(Exception e){System.out.println(e);}
    }
}
