import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MyKeyAdapter extends KeyAdapter {
    AppWindow appWindow;
    public MyKeyAdapter(AppWindow appWindow){
        this.appWindow = appWindow;
    }

    public void keyTyped(KeyEvent ke){
        appWindow.keymsg += ke.getKeyChar();
        appWindow.repaint();
    }
}
