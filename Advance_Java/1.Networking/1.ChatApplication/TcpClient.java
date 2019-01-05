package networking;
import java.net.*;
import java.io.*;
import java.util.Scanner;
public class TcpClient {
    public static void main(String[] args) {
        try{
            Scanner s1 = new Scanner(System.in);
            Socket s = new Socket("127.0.0.1",6666);
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            System.out.print("Enter Message: ");
            String msg=s1.nextLine();
            dout.writeUTF(msg);
            dout.flush();
            dout.close();
            s.close();
        }
        catch(Exception e){System.out.println(e);}
    }
}
