package org.example;

import java.net.InetAddress;
import java.net.ServerSocket;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[]args)throws Exception{

        InetAddress address = InetAddress.getLocalHost();
        System.out.println("Ip Address" + address);

        address = InetAddress.getByName("www.adress.ge");
        System.out.println(address);

        ServerSocket serverSocket = new ServerSocket(5000);
        System.out.println("Server started ");




    }
}
