/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author karthik-pc
 */
import javax.swing.JOptionPane;

public class JOptionTest2 {
    static final int ACCEPT_ACTION=0;
    static final int REJECT_OPTION=1;

    public static void main(String[] args) {

        String name = null;
        while (name == null) {
            name = JOptionPane.showInputDialog(null, "Enter your name", System.getenv("USERNAME"));

        }

        String city = (String) JOptionPane.showInputDialog(null, "Enter your city", "Your City", JOptionPane.QUESTION_MESSAGE,
                null, new Object[]{"Mumbai", "Hyderabad", "Kamareddy"}, "Hyderabad");
        int i = -1;
        while (i == -1) {

            i = JOptionPane.showOptionDialog(null, "Are u sure info z crct", "Confirm ur info", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE, null, new String[]{"Accept", "Reject"}, null);
        }

        System.out.println(i);
        if(i==JOptionTest2.ACCEPT_ACTION)
        {
            JOptionPane.showMessageDialog(null, "Thank you "+ name+" from "+city);
        }
        else if(i==JOptionTest2.REJECT_OPTION)
        {
            JOptionPane.showMessageDialog(null, String.format("This is %s from %s",name,city));
        }
    }
}
