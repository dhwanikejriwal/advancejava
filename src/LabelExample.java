import java.awt.*;
import java.awt.event.*;
import java.net.UnknownHostException;

public class LabelExample extends Frame implements ActionListener{
    TextField tf; Label l;Button b;
    LabelExample(){
        tf =new TextField();
        l = new Label();
        b = new Button("Find Ip");

        b.setBounds(30,30,100,30);
        l.setBounds(30,80,100,30);
        tf.setBounds(30,130,100,30);

        b.addActionListener(this);

        add(b);add(tf);add(l);

        setSize(1000,1000);
        setVisible(true);
        setLayout(null);
    }
    public void actionPerformed(ActionEvent e){

        try {
            String host = tf.getText();
            String ip=java.net.InetAddress.getByName(host).getHostAddress();
            l.setText("IP of" + host + "is:"+ip);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    public static void main (String args[]){
        new LabelExample();
    }
}
