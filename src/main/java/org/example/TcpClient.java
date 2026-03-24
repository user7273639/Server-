package org.example;
import java.io.InputStream;
import java.net.Socket;

public class TcpClient {
    public static void main(String[] args)throws Exception{
        Socket socket = new Socket("LocalHost", 5000);
        InputStream in = socket.getInputStream();
        int data;

        while ((data = in.read())!= -1){
            System.out.print((char)data);
        }
        socket.close();
    }
}
