// Emma Jordan
import javax.swing.JOptionPane;
import java.lang.*;

public class FirstNameTask {
    public static void main (String[] args)
    {
        String name;

        name = JOptionPane.showInputDialog("Enter your name: ");
        String str = name;
        StringBuffer sbr = new StringBuffer(str);

        JOptionPane.showMessageDialog(null, name);
        JOptionPane.showMessageDialog(null, name.toUpperCase());
        JOptionPane.showMessageDialog(null, name.toLowerCase());
        sbr.reverse();
        JOptionPane.showMessageDialog(null, sbr);
        System.exit(0);

    }
}