import java.awt.*;
import java.awt.event.*;
public class WindowAdaptor1 {
    Frame f;
    WindowAdaptor1(){
        f=new Frame("Window Adaptor");
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });

        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main (String args[]){
        new WindowAdaptor1();
    }
}
