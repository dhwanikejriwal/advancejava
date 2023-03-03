import java.awt.*;

public class awtExample1 extends Frame {
    awtExample1(){
        Button b=new Button( "Click me!!");
        b.setBounds(30,30,100,80);
        add(b);

        setSize(300,300);
        setTitle("AWT example");
        setLayout(null);
        setVisible(true);
    }
    public static void main (String  args[]){
        awtExample1 f = new awtExample1();
    }
}
