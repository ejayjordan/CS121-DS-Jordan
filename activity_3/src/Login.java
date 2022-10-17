//Emma Jordan
import javax.swing.JOptionPane;
public class Login {
    public static void main(String[] args){
        String userName = "LD";
        String password = "secret";
        String name;
        String pw;
        String message;

        name = JOptionPane.showInputDialog("Enter userName: ");
        pw = JOptionPane.showInputDialog("Enter Password: ");
        if(userName.equals(name) && password.equals(pw)) {
            message = "Welcome to CS121!";
        }else if(userName.equals(name) && !password.equals(pw)) {
            message = "Password is incorrect.";
        }else if(!userName.equals(name) && password.equals(pw)) {
            message = "userName is incorrect.";
        }else {
            message = "userName and Password are incorrect.";
        }
        JOptionPane.showMessageDialog(null, message);
        }

    }
