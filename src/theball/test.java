/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theball;

/**
 *
 * @author berdi
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 // Test constructor and toString()
      Ball ball = new Ball(1.1, 2.2, 10.0, 3.3, 4.4);


      // Test Setters and Getters
      ball.setX(80);
      ball.setY(30);
      ball.setRadius(5);
      ball.setxDelta(4);
      ball.setyDelta(6);
      System.out.println(ball);  // toString()
      System.out.println("x is: " + ball.getX());
      System.out.println("y is: " + ball.getY());
      System.out.println("radius is: " + ball.getRadius());
      System.out.println("xDelta is: " + ball.getxDelta());
      System.out.println("yDelta is: " + ball.getyDelta());

      // Bounce the ball within the boundary
      double xMin = 0;
      double xMax = 100;
      double yMin = 0;
      double yMax = 50;
      for (int i = 0; i < 15; i++) {
         ball.move(xMin,xMax,yMin,yMax);
     // Check boundary value to bounce back

      }

//      }
      
    }
    
}
