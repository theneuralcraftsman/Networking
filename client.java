import java.io.*;
import java.net.*;

public class client {
    public static void main(String args[]) throws Exception
    {
        String inputString,outputString;
        Socket client=new Socket("192.168.29.180",4000);
        BufferedReader inFromUser=new BufferedReader(new InputStreamReader(System.in));
        DataOutputStream outToServer=new DataOutputStream(client.getOutputStream());
        BufferedReader inFromServer=new BufferedReader(new InputStreamReader(client.getInputStream()));
        inputString=inFromUser.readLine();
        outToServer.writeBytes(inputString+"\n");
        outputString=inFromServer.readLine();
        System.out.println("FROM SERVER:"+outputString);
        client.close();
    }
}
