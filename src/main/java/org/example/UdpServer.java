package org.example;
import java.net.DatagramPacket;
import java.net.DatagramSocket;


public class UdpServer {
    public static void main(String[] args)throws Exception{
        DatagramSocket datagramSocket = new DatagramSocket(6000);
        byte[] buffer = new byte[1024];

        DatagramPacket packet = new DatagramPacket(buffer ,buffer.length);
        datagramSocket.receive(packet);

        String message = new String(packet.getData(),0,packet.getLength());
        System.out.println("Hello Udp Server " +message);

        datagramSocket.close();

    }

}
