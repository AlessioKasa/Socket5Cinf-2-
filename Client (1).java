import java.net.InetAddress;
import java.net.Socket;
import java.io.BuffereadReader;
import java.io.BufferedWiter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Client{
  Socket so;
  BufferedReader br;
  BufferedWriter bw;
  public Client(InetAddress ip, int porta){
    try {
  so = new Socket(ip, porta);
  br = new BufferedReader(new InputStreamReader(so.getInputStream()));
      
}
catch(IOException ex) {
  Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
}
    
  }
  public String leggi(){
    String msg = "";
    try{
      msg = br.readLine();
    } catch (IOException){
      Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
    }
  return msg;
}