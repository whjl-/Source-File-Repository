import javax.swing.JFrame;
import javax.swing.JOptionPane; 

public class ClientTest {
   public static void main(String[] args) {
      String ipaddress;
      ipaddress = JOptionPane.showInputDialog ( "Enter IP:" ); 
      Client objec;
      objec = new Client(ipaddress);
      objec.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      objec.startRunning();
   }
}
