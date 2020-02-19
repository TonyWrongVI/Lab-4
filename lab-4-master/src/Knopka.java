import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Knopka extends AppWindow {

    void mk(AppWindow appwin ){
  /*   Button b = new Button("Text here");
     b.setBounds(50,50,10,10);
     appwin.add(b);
     appwin.setSize(new Dimension(300, 200));*/
        Button b=new Button("Click Here");
        b.setBounds(50,100,80,30);
        b.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {

            }

            @Override
            public void mouseMoved(MouseEvent e) {
                int x = (int) (Math.random() * (1920)+1);
                int y = (int) (Math.random() * (1080)+1);
                b.setBounds(x,y,70,60);
            }
        });
        appwin.add(b);
        appwin.setSize(400,400);
        appwin.setLayout(null);
        appwin.setVisible(true);
    }
}
