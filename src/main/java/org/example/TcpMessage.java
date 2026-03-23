package org.example;

import javax.imageio.IIOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpMessage {
    public static void main(String args[]) throws Exception{
        ServerSocket server = new ServerSocket(5000);
        System.out.println("Server started ");

        Socket socket = server.accept();

        OutputStream printWriter = socket.getOutputStream();
        printWriter.write("Hello from server".getBytes());

        socket.close();
        server.close();
    }
}
