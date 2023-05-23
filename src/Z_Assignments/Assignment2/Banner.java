package Z_Assignments.Assignment2;

import java.awt.*;
import java.applet.*;

public class Banner extends Applet implements Runnable {
   String str = " Welcome to JAVA ";
   Thread t ;
   boolean b;
   
   public void init() {
      setBackground(Color.gray);
      setForeground(Color.yellow);
   }
   public void start() {
      t = new Thread(this);
      b = false;
      t.start();
   }
   public void run () {
      char ch;
      for( ; ; ) {
      try {
         repaint();
         Thread.sleep(250);
         ch = str.charAt(0);
         str = str.substring(1, str.length());
         str = str + ch;
      }
      catch(InterruptedException e) {}
      }
   }
   public void paint(Graphics g) {
      g.drawRect(1,1,300,1500);
      g.setColor(Color.yellow);
      g.fillRect(1,1,300,1500);
      g.setColor(Color.red);
      g.drawString(str, 10, 15);
      
   }
}