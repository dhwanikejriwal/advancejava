import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class DisplayIconImage {
    public static void main (String args[]){
        JFrame f = new JFrame("Display icon image");
        JButton b = new JButton(new ImageIcon("D://dhwani.jpeg"));
        b.setBounds(30,80,100,30);
        f.add(b);
        f.setSize(400,400);
        f.setVisible(true);
        f.setLayout(null);

    }
}
