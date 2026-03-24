package org.example;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


public class UdpClient {
    public static void main (String [] args )throws Exception{

        DatagramSocket socket = new DatagramSocket();
        byte[] data = "Hello Udp Server ".getBytes();

        InetAddress inetAddress = InetAddress.getByName("Local host");
        DatagramPacket datagramPacket = new DatagramPacket(data, data.length,inetAddress,6000);

        socket.send(datagramPacket);
    }
}
