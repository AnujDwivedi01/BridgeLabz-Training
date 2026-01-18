package com.bagnball;
import java.util.ArrayList;
import java.util.List;

public class BagBallApp {

    public static void main(String[] args) {

        Bag bag1 = new Bag("B1", "Red", 2);
        Bag bag2 = new Bag("B2", "Blue", 3);

        Ball ball1 = new Ball("BALL1", "Green", "Small");
        Ball ball2 = new Ball("BALL2", "Yellow", "Medium");
        Ball ball3 = new Ball("BALL3", "Red", "Large");

        bag1.addBall(ball1);
        bag1.addBall(ball2);
        bag1.addBall(ball3); // should fail (capacity reached)

        bag2.addBall(ball3);

        bag1.displayBalls();
        bag2.displayBalls();

        bag1.removeBall("BALL1");
        bag1.displayBalls();

        // Display all bags and ball count
        List<Bag> bags = new ArrayList<>();
        bags.add(bag1);
        bags.add(bag2);

        System.out.println("\n--- Bag Summary ---");
        for (Bag b : bags) {
            System.out.println("Bag ID: " + b.getId() + ", Ball Count: " + b.getBallCount());
        }
    }
}
