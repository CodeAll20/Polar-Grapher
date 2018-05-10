import java.util.*;
import apcslib.*;

public class limacon extends rose
{   
   public limacon (DrawingTool Pen, SketchPad Paper)
   {
      super(Pen, Paper);
   }
   
   public limacon (DrawingTool Pen, SketchPad Paper, int A, int B, boolean IsSin)
   {
      super(Pen, Paper, A, B, IsSin);
   }
   
   public double getValue (double theta)
   {
      double value = 0;
      
      if (getIsSin())
         value = getB() + getA() * Math.sin(theta);
      else
         value = getB() + getA() * Math.cos(theta);
      
      return value;
   }
   
   public String toString ()
   {
      String Return = "";
      
      if (getIsSin())
         Return += "Intersects y-axis at y = 0 and y = " + (a - b) + "\n";
      else
         Return += "Intersects x-axis at x = 0 and x = " + (a - b) + "\n";
      
      if (Math.abs(getB() / getA()) >= 1)
         Return += "Has no dip or loop\n";
      else if (Math.abs(getB() / getA()) == 1)
         Return += "Has a dip\n";
      else
         Return += "Has a loop\n";
      
      if (getIsSin())
         Return += "Alignment: y-axis\n";
      else
         Return += "Alignment: x-axis\n";
      
      return Return;
   }
}
