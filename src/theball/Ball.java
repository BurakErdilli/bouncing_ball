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
public class Ball {

    private double x;
    private double y;
    private double radius;
    private double xDelta;
    private double yDelta;

    public Ball(double x, double y, double radius, double xDelta, double yDelta) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = xDelta;
        this.yDelta = yDelta;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getxDelta() {
        return xDelta;
    }

    public void setxDelta(double xDelta) {
        this.xDelta = xDelta;
    }

    public double getyDelta() {
        return yDelta;
    }

    public void setyDelta(double yDelta) {
        this.yDelta = yDelta;
    }

    public void reflectHorizontal() {
        this.setxDelta(-xDelta);

    }

    public void reflectVertical() {
        this.setyDelta(-yDelta);

    }
    public double edgeCalx(){
        if (this.xDelta>0) {
            return this.x+this.radius;
            
            
        }
        else {
             return this.x-this.radius;
        }
    }
        public double edgeCaly(){
        if (this.yDelta>0) {
            return this.y+this.radius;
            
            
        }
        else {
             return this.y-this.radius;
        }
    }
    public String edgePos(){

    return "x's edge: " +this.edgeCalx() + " y's edge: "+this.edgeCaly() ;
    }
    public void move(double xMin, double xMax, double yMin, double yMax) {
        double a;
        System.out.println(toString());

        this.x += this.xDelta;
        this.y += this.yDelta;

        if ((this.x + this.getRadius()) > xMax || (this.x - this.getRadius()) < xMin) {

            System.out.println("reflexted on y axis");
            this.reflectHorizontal();
            if ((this.x + this.getRadius()) > xMax) {
                a = this.x + this.getRadius();
                a -= (2 * (a - xMax));
                this.x = a - this.getRadius();

            } else {
                a= this.x-this.getRadius();
                a+=(xMin-a)*2;
                this.x=a+this.getRadius();
            }
        }
        if ((this.y + this.getRadius()) > yMax || (this.y - this.getRadius()) < yMin) {
            System.out.println("reflexted on x axis");
            this.reflectVertical();
            if ((this.y + this.getRadius()) > yMax) {
                a = this.y + this.getRadius();
                a -= (2 * (a - yMax));
                this.y = a - this.getRadius();

            } else {
              a= this.y-this.getRadius();
                a+=(yMin-a)*2;
                this.y=a+this.getRadius();
            }
        }

    }

    @Override
    public String toString() {
        return "Ball" + "[(" + x + "),(" + y + ") " + ", speed= (" + xDelta + "),(" + yDelta + " )] :the pos of the edge that is close to the limits:   "+this.edgePos();
    }
    


}
