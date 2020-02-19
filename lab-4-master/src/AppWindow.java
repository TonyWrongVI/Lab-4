import javafx.scene.control.Button;

import java.awt.*;

public class AppWindow extends Frame {
    String keymsg = "This is a test text.";
    String mousemsg = "";
    int mouseX=30, mouseY=30;

    public AppWindow(){
        addKeyListener(new MyKeyAdapter(this));
        addMouseListener(new MyMouseAdapter(this));
        addWindowListener(new MyWindowAdapter());
    }

    public void paint(Graphics g){
        g.drawString(keymsg, 10, 40);
        g.drawString(mousemsg, mouseX, mouseY);
    }

    public static void main(String args[]){
        AppWindow appwin = new AppWindow();

        appwin.setSize(new Dimension(300, 200));
        Knopka k = new Knopka();
        k.mk(appwin);
        appwin.setTitle("An AWT-Based Application");
        appwin.setVisible(true);


    }

}
