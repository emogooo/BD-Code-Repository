package sunucu;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Sunucu {

    public static void main(String[] args) {
        
        try {
            int port = 6060;
            ServerSocket sunucu = new ServerSocket(port);
            System.out.println("Sunucu dinlemeye başladı");
            while (true) {                
                Socket soket = sunucu.accept();
                System.out.println("Bağlantı isteği geldi.");
                InputStream ins = soket.getInputStream();
                DataInputStream dis = new DataInputStream(ins);
                String sunucuyaGelen = dis.readUTF();
                System.out.println("İstemciden gelen: "+sunucuyaGelen);
                String buyumusHali = sunucuyaGelen.toUpperCase();
                DataOutputStream dos = new DataOutputStream(soket.getOutputStream());
                dos.writeUTF(buyumusHali);
                dos.flush();
                dis.close();
                dos.close();
                soket.close();
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
