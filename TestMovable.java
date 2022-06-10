package Movable;

public abstract class TestMovable implements Movable {
    public static void main(String[] args){
        MovablePoint p1 = new MovablePoint() {
            @Override
            public void MovablePoint(int x, int y) {
                super.MovablePoint(x, y);
            }
        };

        System.out.println(p1);
        p1.moveDown();
        System.out.println(p1);
        p1.moveUp();
        System.out.println(p1);
        p1.moveRight();
        System.out.println(p1);
        p1.moveLeft();
        System.out.println(p1);
        p1.moveDown();
        System.out.println(p1);
        p1.moveDown();
        System.out.println(p1);
    }
}
