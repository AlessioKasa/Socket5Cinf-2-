 public class GestoreServer {
public static void main(String[] args) {
Server srv = new Server(2000);
  srv.inAscolto();
  srv.scrivi("Ciao client");
}
}