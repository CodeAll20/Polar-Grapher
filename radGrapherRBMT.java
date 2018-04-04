import java.util.*;
import apcslib.*;

public class radGrapherRBMT
{
   private static DrawingTool pen;
   private static SketchPad paper;
   private static double theta;
   
   public static void main (String [] args)
   {
      paper = new SketchPad(1000, 700, 0);
      pen = new DrawingTool(paper);
      theta = 0;
      
      pen.up();
      for (theta = 0; theta <= 2 * Math.PI; theta += 2 * Math.PI / 200)
      {
         pen.move((int)(r(theta) * Math.cos(theta) * 100), (int)(r(theta) * Math.sin(theta) * 100));
         if (!pen.isDown())
            pen.down();
      }
   }
   
   private static double r (double angle)
   {
      return 1 - 2 * Math.sin(theta);
   }
}