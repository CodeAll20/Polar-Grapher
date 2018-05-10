import java.util.*;
import apcslib.*;

public class limacon extends r
{
   private int a;
   private int b;
   private boolean isSin;
   
   public limacon (DrawingTool Pen, SketchPad Paper)
   {
      super(Pen, Paper, 1);
      a = 1;
      b = 2;
      isSin = true;
   }
   
   public limacon (DrawingTool Pen, SketchPad Paper, int Sign, int A, int B, boolean IsSin)
   {
      super(Pen, Paper, Sign);
      a = A;
      b = B;
      isSin = IsSin;
   }
   
   public double getValue(double theta)
   {
      double value = 0;
      
      if (isSin)
         value = b + a * Math.sin(theta);
      else
         value = b + a * Math.cos(theta);
      
      return value;
   }
   
   public String toString ()
   {
      String Return = "";                      
      
      if (b / a >= 1)
         Return += "Has no dip or loop\n";
      else if (b / a == 1)
         Return += "Has a dip\n";
      else
         Return += "Has a loop\n";
      
      if (isSin)
         Return += "Alignment: y-axis\n";
      else
         Return += "Alignment: x-axis\n";
      
      return Return;
   }
}