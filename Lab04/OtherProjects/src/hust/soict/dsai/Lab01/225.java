import javax.swing.JOptionPane;
public class 225{
    public static void main(String[] args){
        String strnum1, strnum2;
        strnum1 = JOptionPane.showInputDialog("Dien so thu nhat");
        strnum2 = JOptionPane.showInputDialog("Dien so thu hai");
        double num1 = Double.parseDouble(strnum1); 
        double num2 = Double.parseDouble(strnum2); 
        double sum = num1 + num2;
        double diff = num1 - num2;
        double prod = num1 * num2;
        double quot;
        if (num2 != 0) {
            quot = num1/num2;
        } else {
            JOptionPane.showMessageDialog(null, "Khong the chia cho 0");
            quot = Double.NaN;
        }
        JOptionPane.showMessageDialog(null,"Tong: " + sum);
        JOptionPane.showMessageDialog(null,"Hieu: " + diff);
        JOptionPane.showMessageDialog(null,"Tich: " + prod);

        
        
        if (!Double.isNaN(quot)) {
            JOptionPane.showMessageDialog(null,"Thuong: " + quot);
        
        }
        System.exit(0);
    }
}
