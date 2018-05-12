import java.util.*;
import apcslib.*;
import java.awt.*;

public class radGrapherRBMT4
{
   public static Scanner sc = new Scanner(System.in);
   private static  SketchPad Paper = new SketchPad(1920, 1080, 0);
   private static DrawingTool Pen = new DrawingTool(Paper);
   
   public static void main (String[] args)
   {
      //instance variables
      int pick = 0; //initialize switch
      
      ArrayList <r> funList = new <r> ArrayList();
   
      //array of colors that pen can change into
      String[] colors = new String[]{"Blue", "Green", "Red", "Yellow", "Create"} ; //create creates a new color based on rbg values entered
      int r = 0;
      int b = 0;
      int g = 0;
      int cPick = 0;
      
      r r1 = new circle (Pen, Paper, 1, '0');
      
      funList.add(r1);
      r1.draw(-300, 300);
      
      drawAxes();
      
      while(pick < 6)
      {
         System.out.println(" Welcome to Polar Grapher!");
         System.out.println(" What would you like to do?: ");
         System.out.println(" 1 - Look at examples of functions");
         System.out.println(" 2 - Graph a function ");
         System.out.println(" 3 - Add a new function "); //(Add a new function to array)
         System.out.println(" 4 - Change color of the pen ");
         System.out.println(" 5 - Graph all the functions! "); //(Graph all functions in the array)
         System.out.println(" 6 - Exit ");
       
           
         pick = Integer.parseInt(sc.nextLine()); //scanner for keyboard input
         switch(pick)
         {
         case 1:
         case 2:
         case 3:
         case 4: //change pen's color
            System.out.println(" Here are your options for color:");
            for (int i = 0; i < colors.length; i++)
               System.out.println(" " + (i + 1) + " - " + colors[i]);
            System.out.print(" Enter the number next to the color you want: ");
            cPick = Integer.parseInt(sc.nextLine());
               if(cPick == 1)
                  Pen.setColor(Color.blue);
               else if(cPick == 2)
                  Pen.setColor(Color.green);
               else if(cPick == 3)
                  Pen.setColor(Color.red);
               else if(cPick == 4)
                  Pen.setColor(Color.yellow);
               else if(cPick == 5)
               {
                  System.out.println("You can create a new color by entering RGB values");
                  sc.nextLine();
                  System.out.println("Please enter R value: ");
                  r = Integer.parseInt(sc.nextLine());
                  System.out.println("Please enter G value: ");
                  g = Integer.parseInt(sc.nextLine());
                  System.out.println("Please enter B value: ");
                  b = Integer.parseInt(sc.nextLine());
                  System.out.println("Congrats you have created a new color!");
                  Pen.setColor(new Color(r, g, b));
               }
             break;  
            
         case 5:
         case 6:
            System.out.println("Thanks for graphing!");
            System.exit(0); //ends program
            break;
         }
      
      } 
   }   
   
   public static void drawAxes ()
   {
      Pen.up();
      Pen.move(-960, 0);
      Pen.down();
      Pen.move(960, 0);
      Pen.up();
      Pen.move(0, -540);
      Pen.down();
      Pen.move(0, 540);
      Pen.up();
   }
}
