import javax.swing.JOptionPane;
public class Triangles {
    public static void main(String[] args){
        int s1;
        int s2;
        int s3;
        String triangle;

        s1 = Integer.parseInt(JOptionPane.showInputDialog("Length of side 1: "));
        s2 = Integer.parseInt(JOptionPane.showInputDialog("Length of side 2: "));
        s3 = Integer.parseInt(JOptionPane.showInputDialog("Length of side 3: "));
        if(s1 == s2 && s1 == s3 && s2 == s3) {
            triangle = "Equilateral.";
        }else if(s1 != s2 && s1 != s3 && s2 != s3) {
            triangle = "Scalene.";
        }else if(s1 == s2 || s1 == s3 || s2 == s3) {
            triangle = "Isosceles.";
        }else{
            triangle = "Not a triangle.";
        }
        JOptionPane.showMessageDialog(null, String.format("The" + "triangle is: " + triangle));
        System.exit(0);
    }
}
