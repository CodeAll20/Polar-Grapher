import java.util.*;
import apcslib.*;

public class radGrapherRBMT
{
   //These are all the instance variables
   private static DrawingTool pen;
   private static SketchPad paper;
   private static double theta;
   
   //This is the main method, where all the graphing will happen
   public static void main (String [] args)
   {
      //Clearing the instance variables
      paper = new SketchPad(1000, 700, 0);
      pen = new DrawingTool(paper);
      theta = 0;
      
      //Here is the actual movement of the pen
      pen.up();
      for (theta = 0; theta <= 2 * Math.PI; theta += 2 * Math.PI / 200)
      {
         /*
         Since x = r * sin(theta) and y = r * cos(theta),
         I made the program print the return from the method r (defined below), and the multiplied it by sin or cos, depending on
         whether it was x or y.
         I also multiplied the values by 100, to make the graph larger. We can deal wth scaling later
         */
         pen.move((int)(r(theta) * Math.cos(theta) * 100), (int)(r(theta) * Math.sin(theta) * 100));
         if (!pen.isDown())
            pen.down();
      }
   }
   
   /*
   Here is the method that actually returns values for the main method to print. I am thinking of making the r emthod into a full-on
   class later on
   */
   private static double r (double angle)
   {
      return 1 - 2 * Math.sin(theta);
   }
}
