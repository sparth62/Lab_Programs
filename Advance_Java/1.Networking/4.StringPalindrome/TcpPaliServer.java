package networking;
import java.net.*;
import java.io.*;
public class TcpPaliServer {
    public static void main(String[] args) {
        try{
            ServerSocket ss = new ServerSocket(6666);
            System.out.println("Waiting for connection");
            Socket s = ss.accept();
            System.out.println("Connection Established");
            DataInputStream dis = new DataInputStream(s.getInputStream());
            String str = (String)dis.readUTF();
            int length = str.length();
            String rev = "",ans="";
            for ( int i = length - 1; i >= 0; i-- )
                rev = rev + str.charAt(i);
            if (str.equals(rev))
                ans = str+" is a palindrome";
            else
                ans = str+" is not a palindrome";
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            dout.writeUTF(ans);
            ss.close();
            s.close();
            dout.close();
            dis.close();
        }
        catch(Exception e){System.out.println(e);}
    }
}
