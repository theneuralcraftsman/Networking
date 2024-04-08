import java.io.*;
import java.net.*;
import java.util.Locale;

class server{
        public static void main(String args[]) throws Exception{
                String clientMsg,outputMsg;
                ServerSocket socket=new ServerSocket(4000);
                while(true){
                        Socket connectionSocket=socket.accept();
                        BufferedReader inFromClient=new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
                        DataOutputStream outToClient=new DataOutputStream(connectionSocket.getOutputStream());
                        clientMsg=inFromClient.readLine();
                        outputMsg=clientMsg.toUpperCase()+'\n';
                        outToClient.writeBytes(outputMsg);
                }

        }
}