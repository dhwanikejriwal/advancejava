import java.awt.*;
import java.awt.event.*;

class Aevent extends Frame implements ActionListener{
    TextField tf;
    Aevent(){
        tf = new TextField();
        tf.setBounds(30,30,100,30);
        Button b = new Button("CLick Me!");
        b.setBounds(100,120,100,30);

        b.addActionListener(this);
        add(tf);
        add(b);

        setSize(500,500);
        setVisible(true);
        setLayout(null);
    }
    public void actionPerformed(ActionEvent e) {
        tf.setText("WELCOME");
    }
    public static void main (String args[]){
      new Aevent();


        }
    }

