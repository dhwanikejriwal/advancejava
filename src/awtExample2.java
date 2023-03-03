import java.awt.*;
public class awtExample2 {
    awtExample2(){
        Frame f = new Frame();
        Label l = new Label("Employee id");
        TextField t = new TextField();
        Button b = new Button("Submit");

        l.setBounds(20,80,80,30);
        t.setBounds(20,100,80,30);
        b.setBounds(100,100,80,30);

        f.add(b);
        f.add(l);
        f.add(t);

        f.setSize(300,300);
        f.setTitle("EMPLOYEE RECORD");
        f.setVisible(true);
        f.setLayout(null);

    }
    public static void main (String args[]) {
        awtExample2 f = new awtExample2();
    }
}
