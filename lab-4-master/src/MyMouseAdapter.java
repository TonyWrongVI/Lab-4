import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyMouseAdapter extends MouseAdapter {
    AppWindow appWindow;
    public MyMouseAdapter (AppWindow appWindow){
        this.appWindow = appWindow;
    }

    public void mousePressed(MouseEvent me){
        appWindow.mouseX = me.getX();
        appWindow.mouseY = me.getY();
        appWindow.mousemsg = "Mouse down at " + appWindow.mouseX + ", " + appWindow.mouseY;
        appWindow.repaint();
    }
}
