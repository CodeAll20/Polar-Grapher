import java.util.*;
import apcslib.*;

abstract public class r implements Function
{
   private static DrawingTool pen;
   private static SketchPad paper;
   private static int sign;
   
   public r (DrawingTool Pen, SketchPad Paper, int Sign)
   {
      pen = Pen;
      paper = Paper;
      sign = (int)Math.signum(Sign);
   }
   
   public int getSign ()
   {
      return sign;
   }
   
   public void flipSign ()
   {
      sign *= -1;
   }
   
   abstract public double getValue(double theta);
   
   public void draw (double angleFrom, int angleTo)
   {
      //Here is the actual movement of the pen
      pen.up();
      for (double theta = angleFrom; theta <= angleTo; theta += (angleTo - angleFrom) / (2 * Math.PI * 200))
      {
         /*
         Since x = r * sin(theta) and y = r * cos(theta),
         I made the program print the return from the method r (defined below), and the multiplied it by sin or cos, depending on
         whether it was x or y.
         I also multiplied the values by 100, to make the graph larger. We can deal wth scaling later
         */
         pen.move((getValue(theta) * Math.cos(theta) * 100), (getValue(theta) * Math.sin(theta) * 100));
         if (!pen.isDown())
            pen.down();
      }
   }
   
   abstract public String toString();
}
