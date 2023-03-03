// JButton with abstract class Action Listener
import javax.swing.*;
import java.awt.event.*;

public class JbuttonExample {
    public static void main(String args[]){
        JFrame f = new JFrame("Button Action Listener");
        final JTextField tf= new JTextField();
        tf.setBounds(50,50,150,20);
        JButton b=new JButton("Click me");
        b.setBounds(50,100,95,30);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText("Welcome to Dhwani's WOrld");
            }
        });
        f.add(tf);
        f.add(b);

        f.setSize(400,400);
        f.setVisible(true);
        f.setLayout(null);
    }
}
