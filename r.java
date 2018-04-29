import java.util.*;
import apcslib.*;

abstract public class r 
{
   private static DrawingTool pen;
   private static  SketchPad paper;
   
   public r (DrawingTool Pen, SketchPad Paper)
   {
      pen = Pen;
      paper = Paper;
   }
   
   abstract public double getValue();
   
   public void draw (double angleFrom, int angleTo, DrawingTool Pen, SketchPad Paper)
   {
      for (double i = angleFrom; i <= angleTo; i += (angleTo - angleFrom) / (2 * Math.PI * 100))
         pen.draw
   }
   
   public double getZero();
}
