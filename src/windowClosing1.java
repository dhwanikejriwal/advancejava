import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


public class windowClosing1 extends Frame{
    windowClosing1(){
        addWindowListener(new WindowAdapter() {

            public void windowClose(WindowEvent e) {
                dispose();
            }

        });
        setSize(400,400);
        setVisible(true);
        setLayout(null);
    }
    public static void main(String args[]){
        new windowClosing2();
    }
}
