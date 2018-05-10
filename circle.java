import java.util.*;
import apcslib.*;

public class circle extends r
{
   private int a;
   private char align;
   
   public circle (DrawingTool Pen, SketchPad Paper)
   {
      super(Pen, Paper);
      a = 1;
      align = '0';
   }
   
   public circle (DrawingTool Pen, SketchPad Paper, int A, char Align)
   {
      super(Pen, Paper);
      a = A;
      align = Align;
   }
   
   public int getA ()
   {
      return a;
   }
   
   public double getValue (double theta)
   {
      double value = 0;
      
      switch (align)
      {
         case '0':
            value = a;
            break;
         
         case 'x':
         case 'X':
            value = a * Math.cos(theta);
            break;
         
         case 'Y':
         case 'y':
            value = a * Math.sin(theta);
            break;
         
         default:
            break;
      }
      
      return value;
   }
   
   public String toString ()
   {
      String Return = "Radius: " + (Math.abs(a) / 2) + "\n" +
                      "Circumference: " + (Math.PI * Math.abs(a)) + "\n" +
                      "Area: " + (Math.PI * Math.pow(a, 2)) + "\n";
      if (align == '0')
         Return += "Alignment of Function: Origin\n";
      else
         Return += "Alignment of Function: " + align + "-axis\n";
      
      return Return;
   }
}
