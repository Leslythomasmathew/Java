
package Module;
import javax.swing.*;
import java.awt.*;

public class modDemo {
public static void main(String [] args) {
JFrame mainFrame = new JFrame ();
mainFrame.setSize(100,100);

mainFrame.setTitle("My first GUI");



JPanel panel = new JPanel();
panel.setLayout(new GridLayout(3,2,10,10));


JLabel userLabel = new JLabel("User Name");
JTextField userField = new JTextField();

JLabel PwdLabel= new JLabel("Password");
JPasswordField pwdField=new JPasswordField();


JButton loginBtn=new JButton("Login");


panel.add(userLabel);
panel.add(userField);
panel.add(PwdLabel);
panel.add(pwdField);
panel.add(new JLabel(""));
panel.add(loginBtn);

mainFrame.add(panel);
mainFrame.setLocationRelativeTo(null);

mainFrame.setVisible(true);
}
}