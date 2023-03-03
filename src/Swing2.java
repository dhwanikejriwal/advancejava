import javax.swing.*;
public class Swing2 extends JFrame{
    JFrame f;
    Swing2(){
        JButton b = new JButton("Click me");
        b.setBounds(50,100,90,30);
        add(b);
        setSize(1600,1600);
        setVisible(true);
        setLayout(null);

    }
    public static void main (String args[]){
        new Swing2();
    }
}
