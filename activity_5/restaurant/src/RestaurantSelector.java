//Emma Jordan
import javax.swing.JOptionPane;
public class RestaurantSelector {
    public static void main(String[] args) {
        String vegan;
        String vegetarian;
        String gluten;
        String no = "no";
        String yes = "yes";

        vegetarian = JOptionPane.showInputDialog("Is anyone in your party vegetarian?");
        vegan = JOptionPane.showInputDialog("Is anyone in your party vegan?");
        gluten = JOptionPane.showInputDialog("Is anyone in your party gluten-free?");

        if ((yes.equals(vegetarian) || no.equals(vegetarian)) && yes.equals(vegan) && (yes.equals(gluten) || no.equals(gluten))) {
            JOptionPane.showMessageDialog(null, "Here are your restaurant choices: \n The Chef's Kitchen \n Corner Cafe");
        } else if ((yes.equals(vegetarian) || no.equals(vegetarian)) && no.equals(vegan) && yes.equals(gluten)) {
            JOptionPane.showMessageDialog(null, "Here are your restaurant choices: \n Main Street Pizza Company \n The Chef's Kitchen \n Corner Cafe");
        } else if (yes.equals(vegetarian) && no.equals(vegan) && no.equals(gluten)) {
            JOptionPane.showMessageDialog(null, "Here are your restaurant choices: \n Mama's Fine Italian \n Main Street Pizza Company \n The Chef's Kitchen \n Corner Cafe");
        } else {
            JOptionPane.showMessageDialog(null, "Here are your restaurant choices: \n Joe's Gourmet Burgers \n Mama's Fine Italian \n Main Street Pizza Company \n The Chef's Kitchen \n Corner Cafe");

            System.exit(0);


        }
    }
}
