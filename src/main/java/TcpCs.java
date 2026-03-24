import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.Buffer;

public class TcpCs {
    public static void main(String args[]) throws Exception {
        ServerSocket socket = new ServerSocket(8000);
        System.out.println("Server started ");

        Socket so = socket.accept();
        System.out.println("Client connected ");

        BufferedReader in = new BufferedReader(
                new InputStreamReader(
                        socket.accept().getInputStream()));

        PrintWriter out = new PrintWriter(so.getOutputStream(), true);
        String message;
        while (message = in.readLine()) !== null {
        }if (message == null){
            System.out.println("Client disconnected suddenly");
        }
        System.out.println("recived " + message);
    }
}