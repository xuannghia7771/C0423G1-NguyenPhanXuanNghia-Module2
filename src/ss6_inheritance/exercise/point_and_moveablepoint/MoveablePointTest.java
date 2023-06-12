package ss6_inheritance.exercise.point_and_moveablepoint;

import java.util.Arrays;

public class MoveablePointTest {
    public static void main(String[] args) {
        MoveablePoint moveablePoint;
        moveablePoint = new MoveablePoint();
        System.out.println(moveablePoint);

        moveablePoint = new MoveablePoint(5.0f, 5.0f, 10f, 10f);
        System.out.println("In beginning, " + moveablePoint);
        moveablePoint.move();
        System.out.println("Moving finished!");
        System.out.println("The Point at position " + Arrays.toString(moveablePoint.getXY()));
    }
}
