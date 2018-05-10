import java.util.*;
import apcslib.*;

public class lemniscate extends r
{
   private int a;
   private boolean isSin;
   
   public lemniscate (DrawingTool Pen, SketchPad Paper)
   {
      super(Pen, Paper);
      a = 1;
      isSin = true;
   }
   
   public lemniscate (DrawingTool Pen, SketchPad Paper, int A, boolean IsSin)
   {
      super(Pen, Paper);
      a = A;
      isSin = IsSin;
   }
   
   public double getValue (double theta)
   {
      double value = 0;
      
      if (isSin)
         value = Math.sqrt(Math.pow(a, 2) * Math.sin(2 * theta));
      else
         value = Math.sqrt(Math.pow(a, 2) * Math.cos(2 * theta));
      
      return value;
   }
   
   public String toString ()
   {
      String Return = "";
      
      if (isSin)
         Return += "Alignment: y = x\n";
      else
         Return += "Alignment: x-axis\n";
      
      return Return;
   }
}
