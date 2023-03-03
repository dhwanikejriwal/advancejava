// window closing by extending window adaptor
import java.awt.*;
import java.awt.event.*;

public class windowClosing2 extends WindowAdapter{
    Frame f;
    windowClosing2(){
        f=new Frame();
        f.addWindowListener(this);

        f.setSize(400,400);
        f.setVisible(true);
        f.setLayout(null);
    }
    public void windowClosing(WindowEvent e){
        f.dispose();
    }
    public static void main(String args[]){
        new windowClosing2();
    }

}
