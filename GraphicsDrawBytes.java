import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicsDrawBytes extends JPanel {

  public void paint(Graphics g) {
      byte [] barray = { 0x41, 0x42, 0x43 };
      g.drawBytes (barray, 0, barray.length, 10, 30);
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.getContentPane().add(new GraphicsDrawBytes());

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(200,200);
    frame.setVisible(true);
  }
}