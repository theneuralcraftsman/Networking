import java.io.*;
import java.net.*;

public class udpProtClient{
    public static void main(String args[]) throws Exception
    {
        DatagramSocket client = new DatagramSocket();
        InetAddress add = InetAddress.getByName("localhost");

        String str = "Hello World";

        byte[] buf = str.getBytes();
        DatagramPacket p = new DatagramPacket(buf, buf.length, add, 4160);

        client.send(p);

        client.close();


    }

    // sudo javac udpProtClient.java && java udpProtClient
}