package com.company;

public class Main {

    /*
    THIS IS ALL OLD CODE FROM A MISUNDERSTANDING OF THE FRACTAL

    public static int x = 0;
    public static int y = 0;

    // Totals kept for checking correctness
    public static int xTot = 0;
    public static int yTot = 0;

    // n rounds of the fractal
    public static int n;
    // number of datapoints to return
    public static int datapoints;
    // datapoints already recorded
    public static int pointsSoFar;

    public static int turnCounter;
    public static int turnTarget;

    // 0 for (1,0)
    // 1 for (0,1)
    // 2 for (-1,0)
    // 3 for (0,-1)
    public static int heading = 0;

    // if true, add to heading when turning, otherwise subtract
    public static boolean ccw = true;

    public static void recordDataPoint() {
        //print the current coords
        System.out.println(x + " " + y);

        //add to the totals for both coords
        xTot += x;
        yTot += y;

        pointsSoFar ++;
    }

    public static void move() {
        switch (heading) {
            case 0:
                x += 1;
                break;
            case 1:
                y += 1;
                break;
            case 2:
                x -= 1;
                break;
            case 3:
                y -= 1;
                break;
        }
    }

    public static void turn(int counter, int target) {
        if (ccw) {
            heading = (heading + 1) % 4;
        }
        else {
            heading = (heading - 1) % 4;
            if (heading < 0) {
                heading *= -1;
            }
        }

        counter++;
        if (counter == target) {
            counter = 0;
            target++;
            ccw = !ccw;
        }
    }
    */

    public static void main(String[] args) {
        /*
	// get the number of rounds to go, from the arguments
        n = Integer.parseInt(args[0]);
        datapoints = (int) ((Math.pow(2, n)) + 1);

        pointsSoFar = 0;
        turnCounter = 0;
        turnTarget = 1;

        recordDataPoint();
        while (pointsSoFar < datapoints) {
            if (pointsSoFar != 1) {
                turn(turnCounter, turnTarget);
            }
            move();
            recordDataPoint();
        }

        System.out.println("Totals: " + xTot + " " + yTot);
    */
        /*
        * TODO: everything. Code above is wrong, due to an incorrect understanding of the fractal.
        * Think of it like this: Starting with structure A (can be as simple as a line segment), make a copy A* of A. Rotate 90 degrees around the endpoint of A. Combine A and A* into A
        * If a is a line segment, for example, A is now a right angle. The new endpoint is A*'s original starting point
        * Repeat N times
        *
        * Should be able to do it with some linear algebra. An array of points with (2^n)+1 entries, but only a few occupied at first. Fill them as the rotations take place
        * Check notes from Graphics course on the proper matrix math. Off the top of my head you might need to:
        * 1. Make copy A* of array A
        * 2. Translate to endpoint
        * 3. Rotate 90 deg
        * 4. Translate back to origin
        * 5. Append values from A* into A, but in reverse order, ignoring the last value, which is shared
        *
        * NOTE: Check notes. The translation steps may not be needed. Who knows really.
        *
        * EXAMPLE: A = [(0,0), (1,0)]
        * 1. A* = [(0,0), (1,0)]
        * 2. translate to endpoint -> A* = [(-1,0), (0,0)]
        * 3. Rotate 90 deg: A* = [(0,1), (0,0)]
        * 4. translate back to origin -> A* = [(1,1), (1,0)]
        * 5. Append values in reverse order from A* into A, ignoring the last value in A* -> A = [(0,0), (1,0), (1,1]]
        * */
    }
}
