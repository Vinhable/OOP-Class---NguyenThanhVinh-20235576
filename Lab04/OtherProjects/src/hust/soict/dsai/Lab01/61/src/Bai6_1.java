import javax.swing.JOptionPane;
public class Bai6_1 {
    public static void main(String[] args) {
        int option = JOptionPane.showConfirmDialog(null, "Do you want to change to the first ticket?");
        JOptionPane.showMessageDialog(null, "You've chosen: " + (option==JOptionPane.YES_OPTION? "Yes" : "No"));
        System.exit(0);    
    }
    
}