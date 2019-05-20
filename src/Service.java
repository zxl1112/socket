import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Service {
    public static void main(String[] args){
        try{
            ServerSocket serverSocket=new ServerSocket(2222);
            Socket s=serverSocket.accept();
            SendThread sendThread=new SendThread(s);
            sendThread.start();
            ReadThread readThread=new ReadThread(s);
            readThread.start();
        }catch (IOException e){
            e.printStackTrace();
        }




    }
}
