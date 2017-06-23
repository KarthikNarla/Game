 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author karthik-pc
 */
import javax.swing.*;

public class JavaTest {

    public static void main(String[] args) {
        String n1 = JOptionPane.showInputDialog("Please Enter Your Name");
        if (n1.equals("Karthik")) {
            JOptionPane.showMessageDialog(null, "GOOD");
        } else {
            JOptionPane.showMessageDialog(null, "Bad");
        }

        int x = JOptionPane.showConfirmDialog(null, "you want to exit");
        System.exit(0);

        if (x == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "pressed no");
        } else {
            JOptionPane.showMessageDialog(null, "pressed cancel");
        }

    }
}
