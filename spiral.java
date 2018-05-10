import java.util.*;
import apcslib.*;

public class spiral extends r
{
   private int a;
   
   public spiral (DrawingTool Pen, SketchPad Paper)
   {
      super(Pen, Paper);
      a = 1;
   }
   
   public spiral (DrawingTool Pen, SketchPad Paper, int A, boolean IsCsc)
   {
      super(Pen, Paper);
      a = A;
   }
   
   public double getValue (double theta)
   {
      double value = 0;
      
      value = a * theta;
      
      return value;
   }
   
   public String toString ()
   {
      String Return = "";
      
      if (a > 0)
         Return += "Rotation: Clockwise\n";
      else if (a < 0)
         Return += "Rotation: Counterclockwise\n";
      
      return Return;
   }
}