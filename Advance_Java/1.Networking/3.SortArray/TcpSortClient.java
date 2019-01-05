package networking;
import java.net.*;
import java.io.*;
import java.util.Scanner;
public class TcpSortClient {
    public static void main(String[] args) {
        try{
            Scanner s1 = new Scanner(System.in);
            Socket s = new Socket("127.0.0.1",6666);
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            int a[] = new int[5];
            dout.write(a.length);
            System.out.println("Enter 5 number: ");
            for(int i=0;i<5;i++)
            {
                a[i] = s1.nextInt();
                dout.write(a[i]);
            }
            DataInputStream dis = new DataInputStream(s.getInputStream());
            System.out.print("Sorted Array:");
            for(int i=0;i<a.length;i++)
            {
                a[i] = dis.read();
                System.out.print(a[i]+" ");
            }
            s.close();
            dis.close();
            dout.close();
        }
        catch(Exception e){System.out.println(e);}
    }
}
