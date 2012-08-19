import javax.swing.JFrame;

public class ServerTest {
   public static void main(String[] args) {
      Server obje = new Server();
      obje.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      obje.startRunning();
   }
}