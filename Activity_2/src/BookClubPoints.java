// Emma Jordan
import javax.swing.JOptionPane;

public class BookClubPoints {
    public static void main(String[] args){
        int books; //variable 1
        int points; //variable 2

        books = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of books purchased: "));
        if(books == 1) {
            points = 5;
        }else if(books == 2) {
            points = 15;
        }else if(books == 3) {
            points = 30;
        }else if(books >= 4) {
            points = 60;
        }else{
            points = 0;
        }

        JOptionPane.showMessageDialog(null, String.format("You have earned " + points + " points."));
        System.exit(0);

        }
    }
