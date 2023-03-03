import javax.swing.*;
public class Swing1 {
    public static void main(String args[]){
        JFrame f=new JFrame();
        JButton b = new JButton("Click me");
        b.setBounds(30,80,80,30);
        f.add(b);

        f.setSize(400,400);
        f.setVisible(true);
        f.setLayout(null);
    }
}
