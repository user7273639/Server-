package org.example;
import java.net.MalformedURLException;
import java.net.URL;


public class MyURL {
    public static void main (String[] args)throws MalformedURLException{
        URL url = new URL("http://www.itvet.ge/index.html");

        System.out.println("პროტოკოლი" + url.getProtocol());
        System.out.println("ჰოსტი" + url.getHost());
        System.out.println("ფაილი" + url.getFile());
    }
}
