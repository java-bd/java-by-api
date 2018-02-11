import javax.swing.DebugGraphics;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.RepaintManager;

public class DebugGraphicsBufferedOption {

  public static void main(String[] a) {

    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JButton bn = new JButton();

    RepaintManager repaintManager = RepaintManager.currentManager(bn);
    repaintManager.setDoubleBufferingEnabled(false);

    bn.setDebugGraphicsOptions(DebugGraphics.BUFFERED_OPTION | DebugGraphics.FLASH_OPTION
        | DebugGraphics.LOG_OPTION);

    frame.add(bn);

    frame.setSize(300, 300);
    frame.setVisible(true);

    frame.add(bn);
  }

}
