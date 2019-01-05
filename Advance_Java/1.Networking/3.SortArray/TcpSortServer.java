package networking;
import java.net.*;
import java.io.*;
import java.util.Arrays;
public class TcpSortServer {
    public static void main(String[] args) {
        try{
            ServerSocket ss = new ServerSocket(6666);
            System.out.println("Waiting for connection");
            Socket s = ss.accept();
            System.out.println("Connection Established");
            DataInputStream dis = new DataInputStream(s.getInputStream());
            int n = dis.read();
            int a[] = new int[n];
            for(int i=0;i<n;i++)
                a[i] = dis.read();
            Arrays.sort(a);
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            for(int i=0;i<n;i++)
                dout.write(a[i]);
            ss.close();
            s.close();
            dout.close();
            dis.close();
        }
        catch(Exception e){System.out.println(e);}
    }
}
