import java.util.*;
import apcslib.*;

public class spiral extends circle
{
   private int c;
   
   public spiral (DrawingTool Pen, SketchPad Paper)
   {
      super(Pen, Paper);
      c = 1;
   }
   
   public spiral (DrawingTool Pen, SketchPad Paper, int A, int C)
   {
      super(Pen, Paper, A, '0');
      c = C;
   }
   
   public int getC ()
   {
      return c;
   }
   
   public double getValue (double theta)
   {
      double value = 0;
      
      value = getA() * theta + c;
      
      return value;
   }
   
   public String toString ()
   {
      String Return = "";
      
      if (getA() > 0)
         Return += "This spiral is positive and starts at (" + c + ", 0)\n";
      else if (getA() < 0)
         Return += "This spiral is negative and starts at (" + c + ", 0)\n";
      
      return Return;
   }
}