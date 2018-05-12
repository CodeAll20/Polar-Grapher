import java.util.*;
import apcslib.*;
import java.awt.*;

public class radGrapherRBMT
{
   public static Scanner sc = new Scanner(System.in);
   private static DrawingTool Pen;
   private static  SketchPad Paper;
   
   public static void main (String[] args)
   {
      //instance variables
      int pick = 0; //initialize switch
      Paper = new SketchPad(1920, 1080, 0);
      Pen = new DrawingTool(Paper);
      
      ArrayList<r> funList = new <r>ArrayList();
   
      //array of colors that pen can change into
      String[] colors = new String[]{"Blue", "Green", "Red", "Yellow", "Create"} ; //create creates a new color based on rbg values entered
      int r = 0;
      int b = 0;
      int g = 0;
      String cPick = "";
      
      r r1 = new circle (Pen, Paper, 1, '0');
      
      funList.add(r1);
      r1.draw(-300, 300);
     
          
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
       
           
         pick = sc.nextInt(); //scanner for keyboard input
         switch(pick)
         {
         case 1:
         case 2:
         case 3:
         case 4: //change pen's color
            System.out.println(" Press enter and pick (type) a color");
            sc.nextLine();
            System.out.println(colors);
            cPick = sc.nextLine();
               if(cPick == "Blue")
                  Pen.setColor(Color.blue);
               else if(cPick == "Green")
                  Pen.setColor(Color.green);
               else if(cPick == "Red")
                  Pen.setColor(Color.red);
               else if(cPick == "Yellow")
                  Pen.setColor(Color.yellow);
               else if(cPick == "Create")
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
   
}
