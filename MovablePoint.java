package Movable;

public abstract class MovablePoint implements Movable {
    private int x = 0;
    private int y = 0;

    public String toString(){
        return "(Pozycja x: " + x + ", Pozycja y: " + y +" )";
    }
    public void MovablePoint(int x, int y){
        System.out.println("x = " + x + " y = " + y);
    }
    public void moveUp(){
        y = y+1;
    }
    public void moveDown(){
        y = y-1;
    }
    public void moveLeft(){
        x = x-1;
    }
    public void moveRight(){
        x = x+1;
    }
}
