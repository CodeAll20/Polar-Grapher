import java.util.*;
import apcslib.*;

public class circle extends r
{
   private int a;
   private char align;
   
   public circle (DrawingTool Pen, SketchPad Paper)
   {
      super(Pen, Paper, 1);
      a = 1;
      align = '0';
   }
   
   public circle (DrawingTool Pen, SketchPad Paper, int Sign, int A, char Align)
   {
      super(Pen, Paper, Sign);
      a = A;
      align = Align;
   }
   
   public double getValue(double theta)
   {
      double value = 0;
      
      switch (align)
      {
         case '0':
            value = getSign() * a;
            break;
         
         case 'x':
         case 'X':
            value = getSign() * a * Math.cos(theta);
            break;
         
         case 'Y':
         case 'y':
            value = getSign() * a * Math.sin(theta);
            break;
      }
      
      return value;
   }
   
   public String toString ()
   {
      return "Radius: " + (a / 2) + "\n" +
             "Circumference: " + (Math.PI * a) + "\n" +
             "Area: " + (Math.PI * Math.pow(a, 2));
   }
}
