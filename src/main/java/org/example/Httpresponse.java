package org.example;
import java.net.HttpURLConnection;
import java.net.URL;

public class Httpresponse {
    public static void main (String [] args )throws Exception{
        URL hp = new URL("http://www.google.com");
        HttpURLConnection hpConn = (HttpURLConnection) hp.openConnection();

        System.out.println("მოთხოვნის მეთოდი" + hpConn.getRequestMethod());
        System.out.println("პასუხის კოდი " +hpConn.getResponseMessage());
    }
}
