import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args){
        try{
            Socket s=new Socket("127.0.0.1",2222);
            ReadThread readThread=new ReadThread(s);
            readThread.start();
            SendThread sendThread=new SendThread(s);
            sendThread.start();
        }catch (UnknownHostException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
