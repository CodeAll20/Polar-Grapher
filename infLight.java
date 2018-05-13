import java.util.*;
import apcslib.*;

public class infLight extends circle
{
   private boolean isSin;
   
   public infLight (DrawingTool Pen, SketchPad Paper)
   {
      super(Pen, Paper);
      isSin = true;
   }
   
   public infLight (DrawingTool Pen, SketchPad Paper, int A, boolean IsSin)
   {
      super(Pen, Paper, A, '0');
      isSin = IsSin;
   }
   
   public double getValue (double theta)
   {
      double value = 0;
      
      if (isSin)
         value = Math.sqrt(Math.pow(getA(), 2) * Math.sin(2 * theta));
      else
         value = Math.sqrt(Math.pow(getA(), 2) * Math.cos(2 * theta));
      
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