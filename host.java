import java.net.*;
import java.io.*;
import java.util.*;
class host{
    
    public static void main(String args[])
    {
        try
        {
            String remote = "google.com";
            InetAddress not_local = InetAddress.getByName(remote);
            InetAddress local = InetAddress.getLocalHost();
            
            System.out.println("Local Address: "+local.getHostAddress());
            System.out.println("Local HostName: "+local.getHostName());
            System.out.println("Remote Address: "+not_local.getHostAddress());
            System.out.println("Remote HostName: "+not_local.getHostName());
            //System.out.println("Error:");

            boolean isAvailable = local.isReachable(6000);
            System.out.println(isAvailable);

        }
        catch(Exception e)
        {
            System.out.println("Error:"+ e.getMessage());
        }
    }
}