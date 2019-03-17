package networking;
import java.net.*;
import java.io.*;
import java.util.Scanner;
public class TcpPaliClient {
    public static void main(String[] args) {
        try{
            Scanner s1 = new Scanner(System.in);
            Socket s = new Socket("127.0.0.1",6666);
            System.out.print("Enter String: ");
            String str=s1.nextLine();
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            dout.writeUTF(str);
            dout.flush();
            DataInputStream dis = new DataInputStream(s.getInputStream());
            String ans = (String)dis.readUTF();
            System.out.println(ans);
            dout.close();
            s.close();
            dis.close();
        }
        catch(Exception e){System.out.println(e);}
    }
}
