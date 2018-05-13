import java.util.*;
import apcslib.*;
import java.awt.*;
import TerminalIO.KeyboardReader;

public class radGrapherRBMT
{
   public static Scanner sc = new Scanner(System.in);
   private static  SketchPad Paper = new SketchPad(1920, 1080, 0);
   private static DrawingTool Pen = new DrawingTool(Paper);
   
   public static void main (String[] args)
   {
      //Make sure pen starts as black
      Pen.setColor(Color.black);
      //instance variables (some of them)
      int pick = 0; //initialize switch
      int dPick = 0;
      int stop = 0;
      int ePick = 0;
      int A = 0;
      int B = 0;
      int C = 0;
      int trig = 0;
      KeyboardReader reader = new KeyboardReader(); //pauses in between actions
      
      
      //creating array list and adding graphs new graphs
      ArrayList <r> funList = new <r> ArrayList();
      int aPick = 0;
      
      r r1 = new circle (Pen, Paper, 1, '0');
      r r2 = new limacon (Pen, Paper, 7, 8, true);
      r r3 = new line (Pen, Paper, 1, true);
      r r4 = new rose (Pen, Paper, 3, 4, true);
      r r5 = new spiral (Pen, Paper, 1, 1);
      
      funList.add(r1);
      funList.add(r2);
      funList.add(r3);
      funList.add(r4);
      funList.add(r5);
          
      //creating other array list of graphs
      ArrayList <r> other = new <r> ArrayList();
      int bPick = 0;
      
      r c1 = new infLight (Pen, Paper, 7, true);
      r c2 = new rose (Pen, Paper, 3, 4, true);
      r c3 = new spiral (Pen, Paper, 1, 1);
      r c4 = new limacon (Pen, Paper, 9, 10, true);
      
      other.add(c1);
      other.add(c2);
      other.add(c3);
      other.add(c4);
   
      //array of colors that pen can change into
      String[] colors = new String[]{"Blue", "Green", "Red", "Yellow", "Create"} ; //create creates a new color based on rbg values entered
      int r = 0;
      int b = 0;
      int g = 0;
      int cPick = 0;
     
      drawAxes();
      
      while(pick < 6)
      {
         System.out.println(" Welcome to Polar Grapher!");
         System.out.println(" What would you like to do?: ");
         System.out.println(" 1 - Look at examples of functions");
         System.out.println(" 2 - Look at some crazy functions");
         System.out.println(" 3 - Graph a function");
         System.out.println(" 4 - Change color of the pen ");
         System.out.println(" 5 - Graph all the functions! "); //(Graph all functions in both arraylists)
         System.out.println(" 6 - Exit ");
       
           
         pick = Integer.parseInt(sc.nextLine()); //scanner for keyboard input
         switch(pick)
         {
            case 1:
               System.out.println(" Enter a number > -1 ");
               stop = Integer.parseInt(sc.nextLine());
               while(stop > -1)
               {
                  System.out.println(" Please choose a function you would like to see ");
                  System.out.println("1. Circle 2. Limacon 3. Line 4. Rose 5. Spiral ");
                  aPick = Integer.parseInt(sc.nextLine());
                  if(aPick == 1)
                  {   
                     drawAxes();
                     r1.draw(-100, 100);
                     reader.pause();
                     System.out.println(r1);
                  }
                  else if(aPick == 2)
                  {
                     drawAxes();
                     r2.draw(-30, 20);
                     reader.pause();
                     System.out.println(r2);
                  }
                  else if(aPick == 3)
                  {
                     drawAxes();
                     r3.draw(-400, 400);
                     reader.pause();
                     System.out.println(r3);
                  }
                  else if(aPick == 4)
                  {
                     drawAxes();
                     r4.draw(-10, 10);
                     reader.pause();
                     System.out.println(r4);
                  }
                  else if(aPick == 5)
                  {
                     drawAxes();
                     r5.draw(0, 20); 
                     reader.pause();
                     System.out.println(r5);
                  }
               
                  System.out.println(" Press 1 to choose another function or don't enter 1 to do something else ");
                  stop = Integer.parseInt(sc.nextLine());
                  refreshScreen();
                  if(stop == 1)
                     continue;
                  else
                     break;
               }
               break;           
            
            case 2:
               System.out.println(" Enter a number > -1 ");
               stop = Integer.parseInt(sc.nextLine());
               while(stop > -1)
               {
                  System.out.println(" Please choose a function you would like to see ");
                  System.out.println("1. Light signal 2. Lots of lines 3. Squarish spiral 4. Shell ");
                  bPick = Integer.parseInt(sc.nextLine()); 
               
                  if(bPick == 1)
                  {   
                     drawAxes();
                     c1.draw(-9999, 0);
                     reader.pause();
                  }
                  else if(bPick == 2)
                  {
                     drawAxes();
                     c2.draw(-9999, 0);
                     reader.pause();
                  }
                  else if(bPick == 3)
                  {
                     drawAxes();
                     c3.draw(-999, 999);
                     reader.pause();
                  }
                  else if(bPick == 4)
                  {
                     drawAxes();
                     c4.draw(-9999, 9999);
                     reader.pause();
                  }
               
                  System.out.println(" Press 1 to choose another crazy function or don't enter 1 to do something else ");
                  stop = Integer.parseInt(sc.nextLine());
                  refreshScreen();
                  if(stop == 1)
                     continue;
                  else
                     break;
               }
               refreshScreen();
               break;
               
            case 3:
               System.out.println(" Enter a number > -1 ");
               stop = Integer.parseInt(sc.nextLine());
               while(stop > -1)
               { 
                  System.out.println(" Pick a type of function you would like to graph ");
                  System.out.println(" 1. Circle 2. Limacon 3. Line 4. Rose 5. Spiral ");
                  ePick = Integer.parseInt(sc.nextLine());
                  if(ePick == 1)
                  {
                     System.out.println(" The equation of a circle is r = a ");
                     System.out.println(" Enter a value for a");
                     A = Integer.parseInt(sc.nextLine());
                     r cir = new circle (Pen, Paper, A, '0');
                     drawAxes();
                     cir.draw(-3.1415, 4);
                     reader.pause();
                     System.out.println(cir);
                  }
                  else if (ePick == 2)
                  {
                     System.out.println(" The equation of a limacon is r = a + b sin(theta) or a + b cos(theta) ");
                     System.out.println(" Enter values for a, b, and pick sine or cosine ");
                     System.out.println(" a = ");
                     A = Integer.parseInt(sc.nextLine());
                     System.out.println(" b = ");
                     B = Integer.parseInt(sc.nextLine());
                     System.out.println(" (1)sin or (2)cos? ");
                     trig = Integer.parseInt(sc.nextLine());
                     if(trig == 1)
                     {
                        r lim = new limacon (Pen, Paper, A, B, true);
                        drawAxes();
                        lim.draw(-3.1415, 4);
                        reader.pause();
                        System.out.println(lim);
                     }
                     else if(trig == 2)
                     {
                        r lim = new limacon (Pen, Paper, A, B, false);
                        drawAxes();
                        lim.draw(-3.1415, 4);
                        reader.pause();
                        System.out.println(lim);
                     }
                     else
                     {
                        System.out.println("You should enter 1 or 2");
                        continue;
                     } 
                  }
                  else if (ePick == 3)
                  {
                     System.out.println(" The equation of a line is r = a csc(theta) or a sec(theta) ");
                     System.out.println(" Enter values for a and pick cosecant or secant ");
                     System.out.println(" a = ");
                     A = Integer.parseInt(sc.nextLine());
                     System.out.println(" (1)csc or (2)sec ");
                     trig = Integer.parseInt(sc.nextLine());
                     if(trig == 1)
                     {
                        r lin = new line(Pen, Paper, A, true);
                        drawAxes();
                        lin.draw(-3.1415, 4);
                        reader.pause();
                        System.out.println(lin);
                     }
                     else if(trig == 2)
                     {
                        r lin = new line(Pen, Paper, A, false);
                        drawAxes();
                        lin.draw(-3.1415, 4);
                        reader.pause();
                        System.out.println(lin);
                     }
                     else
                     {
                        System.out.println("You should enter 1 or 2");
                        continue;
                     } 
                  }
                  else if (ePick == 4)
                  {
                     System.out.println(" The equation of a rose is r = a + sin(b * theta) or r = a + cos(b * theta) ");
                     System.out.println(" Enter values for a, b, and pick sine or cosine ");
                     System.out.println(" a = ");
                     A = Integer.parseInt(sc.nextLine());
                     System.out.println(" b = ");
                     B = Integer.parseInt(sc.nextLine());
                     System.out.println(" (1)sin or (2)cos? ");
                     trig = Integer.parseInt(sc.nextLine());
                     if(trig == 1)
                     {
                        r ros = new rose (Pen, Paper, A, B, true);
                        drawAxes();
                        ros.draw(-3.1415, 4);
                        reader.pause();
                        System.out.println(ros);
                     }
                     else if(trig == 2)
                     {
                        r ros = new rose (Pen, Paper, A, B, false);
                        drawAxes();
                        ros.draw(-3.1415, 4);
                        reader.pause();
                        System.out.println(ros);
                     }
                     else
                     {
                        System.out.println("You should enter 1 or 2");
                        continue;
                     } 
                         
                  }
                  else if (ePick == 5)
                  {
                     System.out.println(" The equation of a spiral is r = a(theta) + c ");
                     System.out.println(" Enter values for a and c ");
                     System.out.println(" a = ");
                     A = Integer.parseInt(sc.nextLine());
                     System.out.println(" c = ");
                     C = Integer.parseInt(sc.nextLine());
                     r spi = new spiral (Pen, Paper, A, C);
                     drawAxes();
                     spi.draw(-3.1415, 4);
                     reader.pause();
                     System.out.println(spi);
                  }
                  
                  System.out.println(" Press 1 to graph another function or don't enter 1 to do something else ");
                  stop = Integer.parseInt(sc.nextLine());
                  refreshScreen();
                  if(stop == 1)
                     continue;
                  else
                     break;
               }
               refreshScreen();
               break;               
               
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
               
               System.out.println(" Your color has been set");
               break;  
             
            case 5:  
               System.out.println(" Press enter 1 to graph all the functions ");
               dPick = Integer.parseInt(sc.nextLine());
               if(dPick == 1)
               {
                  drawAxes();
                  
                  for(r rs: funList)
                  {
                     rs.draw(-30, 30);
                     System.out.println(rs);
                  }
                  
                  for(r oth: other)
                  {
                     oth.draw(-9999, 9999);
                  }      
                  reader.pause();
               }
               else
               {
                  System.out.println("You should enter 1");
                  continue;
               }  
               
               System.out.println(" Press enter to go back to menu ");
               sc.nextLine();
             
               refreshScreen();
               break; 
                          
            case 6:
               System.out.println("Thanks for graphing!");
               System.exit(0); //ends program
               break;
         }
      
      } 
   }   
   
   //Draws the axes in black, and sets the pen back to the original color at the end of the method
   public static void drawAxes ()
   {
      Color initColor = Pen.getColor();
      
      Pen.setColor(Color.black);
      Pen.up();
      
      //Draw x-axis
      Pen.move(-9999, 0);
      Pen.down();
      Pen.move(9999, 0);
      Pen.up();
      
      //Draw y-axis
      Pen.move(0, -9999);
      Pen.down();
      Pen.move(0, 9999);
      Pen.up();
      
      //Set to original color
      Pen.setColor(initColor);
   }
   
   //Paints the screen white using the <fillRect> method and draws the axes again
   public static void refreshScreen ()
   {
      Color initColor = Pen.getColor();
      
      Pen.setColor(Color.white);
      Pen.up();
      
      //Paint screen white
      Pen.move(-2000, -2000);
      Pen.down();
      Pen.fillRect(10000, 10000);
      
      //Set to original color
      Pen.setColor(initColor);
      
      //Draw the axes
      drawAxes();
      Pen.up();
   }
}
