import javax.imageio.IIOException;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class ReadThread extends Thread{
    Socket s;
    public ReadThread(Socket s){
        this.s=s;
    }

    @Override
    public void run() {
        try{
            InputStream inputStream=s.getInputStream();
            DataInputStream dataInputStream=new DataInputStream(inputStream);
            while (true){
                String string=dataInputStream.readUTF();
                System.out.println("从对方接受到信息："+string);
            }

        } catch (IOException e){
            e.printStackTrace();
        }
    }


}
