package cscd210lab2;

import java.util.Scanner;
import java.text.DecimalFormat;

public class CSCD210Lab2
{
   public static void main(final String [] args)
   {
      
      Scanner kb = new Scanner(System.in);
      String name = ""; // String name = new String("");
      double time = 0;
      
      System.out.print("Please enter the skier's name: ");
      name = kb.next(); 
      kb.nextLine();
      
      System.out.print("Please enter the winning time: ");
      time = kb.nextDouble(); 
     
      double mps, fps, kph, mph, m, sec, yrds;
      DecimalFormat df_obj = new DecimalFormat("#");
      DecimalFormat df_obj1 = new DecimalFormat("#.##");
      
      mps = 2500/time;
      fps = 2.5*3280.8399/time;//3280.8399 is the conversion factor between feet and kilometers
      kph = (2.5*3600)/time;//dividing by 3600 converts seconds into hours
      mph = (2.5*0.62137119*3600)/time;//multiplying by 0.62137119 converts km to miles
      m = 60/mph;
      sec = (60/mph-(int)m)*60;
      yrds = 100/(fps/3);
      
      System.out.println("");//spacing to match the assignment format
      System.out.println(name + " was traveling at a rate of: ");
      System.out.println(df_obj1.format(mps) + " meters per second,");
      System.out.println(df_obj1.format(fps) + " feet per second,");
      System.out.println(df_obj1.format(kph) + " kilometers per hour,");
      System.out.println(df_obj1.format(mph) + " miles per hour,");
      System.out.println("");//spacing to match the assignment format
      
      System.out.println("It would take " + df_obj.format(m) + " minutes and " + df_obj1.format(sec) + " seconds for " + name + " to ski one mile.");
      System.out.println("It would take " + df_obj1.format(yrds) + " seconds for " + name + " to ski 100 yards.");
   
   }
  
}