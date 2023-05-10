package JavaCollectionClass;
import java.io.*;
import java.net.UnknownHostException;
import java.util.*;
import java.net.Socket;

public class Client_sock {
    public static void main (String args[]) throws IOException {
        PrintStream pr = null;
        try {
            Socket sock = new Socket("localhost", 9999);
            pr = new PrintStream(sock.getOutputStream());
            System.out.println("Enter something");
            InputStreamReader rd = new InputStreamReader(System.in);
            BufferedReader ed = new BufferedReader(rd);
        } catch (Exception ex) {
            InputStreamReader rd = new InputStreamReader(System.in);
            BufferedReader ed = new BufferedReader(rd);
            String temp = ed.readLine();
            pr.println(temp);

        }

    }
}
