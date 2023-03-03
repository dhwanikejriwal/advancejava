import javax.swing.*;
import java.awt.*;

public class BorderLayoutExample2 {
    public static void main (String args[]){
        JFrame f=new JFrame();
        JButton b1=new JButton("North");
        JButton b2=new JButton("South");
        JButton b3=new JButton("West");
        JButton b4=new JButton("East");
        JButton b5=new JButton("Centre");

        f.setLayout(new BorderLayout(20,15));
        f.add(b1, BorderLayout.NORTH);
        f.add(b2,BorderLayout.SOUTH);
        f.add(b3,BorderLayout.WEST);
        f.add(b4,BorderLayout.EAST);
        f.add(b5,BorderLayout.CENTER);

        f.setSize(400,400);
        f.setVisible(true);




    }
}
