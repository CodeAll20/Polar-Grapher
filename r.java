import java.util.*;
import apcslib.*;

public class r 
{
   //Instance variables
   int aVar = 0; //basic polar equations: r = a+-b(sin/cos/tan theta)
   int bVar = 0;
   double theta = 0;
   
   public void setAVar (int a)
   {
      aVar = a;
   }
   
   public int getAVar ()
   {
      return aVar;
   }
   
   public void setBVar (int b)
   {
      bVar = b;
   }
   
   public int getBVar ()
   {
      return bVar;
   }
   
   //Graphing methods for basic trig
   public double doSine (double angle)
   {
      return bVar * (Math.sin(theta));
   }
   
   public double doCosine (double angle)
   {
      return bVar * (Math.cos(theta));
   }
   
   public double doTangent (double angle)
   {
      return bVar * (Math.tan(theta));
   }
   
   public double doCsc (double angle)
   {
      return bVar * (1/Math.sin(theta));
   }
   
   public double doSec (double angle) 
   {
      return bVar * (1/Math.cos(theta));
   }
   
   public double doCot (double angle)
   {
      return bVar * (1/Math.tan(theta));
   }
   
   //Special shapes with polar
   
   public double doLoopUp (double angle)
   {
      return aVar - bVar * (Math.sin(theta));
   }
   
   public double doLoopDown (double angle)
   {
      return aVar + bVar * (Math.sin(theta));
   }
   
   public double doLoopRight (double angle)
   {
      return aVar - bVar * (Math.cos(theta));
   }
   
   public double doLoopLeft (double angle)
   {
      return aVar + bVar * (Math.cos(theta));
   }
   
   public double doFlowerDouble (double angle) //this is the cosine flower
   {
      return
 }  
 
 //these are just some basic equations that can be added to sub classes later or kept like this
