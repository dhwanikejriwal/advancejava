import java.awt.*;
import java.awt.event.*;
public class AEvent3 extends Frame{
    TextField tf;
    AEvent3(){
        TextField tf = new TextField();
        Button b= new Button("Click me");
        b.setBounds(20,30,100,20);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText("WElcome ");

            }
        });
        add(b); add(tf);

        setSize(500,500);
        setVisible(true);
        setLayout(null);
    }
    public static void main (String args[])
    {
        new AEvent3();
    }

}
