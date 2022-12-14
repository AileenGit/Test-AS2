
import java.awt.*;
import javax.swing.*;
public class Test extends JFrame {
   public Test() {
      setTitle("Pack() method Test");
      setLayout(new FlowLayout());
      setButton();
      pack(); // calling the pack() method
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLocationRelativeTo(null);
      setVisible(true);
   }
   void setButton() {
      for(int i=1; i < 6; i++) {
         add(new JButton("Button" +i));
      }
   }
   public static void main(String args[]) {
      new Test();
      paint(null);
   }
   public void paint(Graphics g) {
       //Graphics2D allows setting of pen's stroke size
       Graphics2D graphic2D = (Graphics2D) g;
       //graphic2D.setStroke(new BasicStroke(GameMain.SYMBOL_STROKE_WIDTH, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
       
       //draw the symbol in the position
       //int x1 = col * GameMain.CELL_SIZE + GameMain.CELL_PADDING;
       //int y1 = row * GameMain.CELL_SIZE + GameMain.CELL_PADDING;
       //if (content == Player.Cross) {
           graphic2D.setColor(Color.RED);
           //int x2 = (col + 1) * GameMain.CELL_SIZE - GameMain.CELL_PADDING;
           //int y2 = (row + 1) * GameMain.CELL_SIZE - GameMain.CELL_PADDING;
           graphic2D.drawLine(1, 1, 2, 2);
           graphic2D.drawLine(2, 1, 1, 2);
       //}else if (content == Player.Nought) {
           //graphic2D.setColor(Color.BLUE);
          //graphic2D.drawOval(x1, y1, GameMain.SYMBOL_SIZE, GameMain.SYMBOL_SIZE);
       //}
   }

}