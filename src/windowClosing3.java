import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class windowClosing3 extends Frame implements WindowListener{
    windowClosing3(){
        addWindowListener(this);

        setSize(400,400);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String args[])
    {
        new windowClosing3();
    }
    public void windowActivated(WindowEvent e){}
    public void windowClosed(WindowEvent e){}
    public void windowClosing(WindowEvent e){
        dispose();
    }
    public void windowDeactivated(WindowEvent e){}
    public void windowDeiconified(WindowEvent e){}
    public void windowIconified(WindowEvent e){}
    public void windowOpened(WindowEvent e){}


}
