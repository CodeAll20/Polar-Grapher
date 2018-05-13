import java.util.*;
import apcslib.*;

public class line extends r
{
   private int a;
   private boolean isCsc;
   
   public line (DrawingTool Pen, SketchPad Paper)
   {
      super(Pen, Paper);
      a = 1;
      isCsc = true;
   }
   
   public line (DrawingTool Pen, SketchPad Paper, int A, boolean IsCsc)
   {
      super(Pen, Paper);
      a = A;
      isCsc = IsCsc;
   }
   
   public int getA ()
   {
      return a;
   }
   
   public boolean getIsCsc ()
   {
      return isCsc;
   }
   
   public double getValue (double theta)
   {
      double value = 0;
      
      if (isCsc)
         value = a / Math.sin(theta);
      else
         value = a / Math.cos(theta);
      
      return value;
   }
   
   public String toString ()
   {
      String Return = "";
      
      if (isCsc)
         Return += "Parallel with x-axis\n" +
                   "Touches y-axis at " + a + "\n";
      else
         Return += "Parallel with y-axis\n" +
                   "Touches x-axis at " + a + "\n";
      
      return Return;
   }
}