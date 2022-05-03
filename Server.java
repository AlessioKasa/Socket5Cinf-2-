import java.net.Socket;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Server{
ServerSocket ss;
Socket so;
BufferedReader br;
BufferedWriter bw;
Public Server(int porta){
try {
  ss = new ServerSocket(porta);
    System.out.println("OK sono in ascolto ! ");
}
catch(IOException ex) {
  Logger.getLogger(Server.class.getName()).
}
}
public void inAscolto{
  try {
  so = ss.accept();
  System.out.println("Connessione stabilita ! ");
}
catch(IOException ex) {
  Logger.getLogger(Server.class.getName()).
}
}
  public void scrivi(String messaggio){
    try{
      
    bw = new BufferedWriter(new OutputStreamWriter(so.getOutputStream))));
  bw.write(messaggio+"\n");
  bw.flush();
} catch (IOExcpetion ex){
      Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
}

}
}