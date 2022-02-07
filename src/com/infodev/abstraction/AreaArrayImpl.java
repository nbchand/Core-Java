/*
7. Repeat the above question(Q.N. 6 calculate area of different shapes) for 4 rectangles, 4 squares and 5 circles.
Hint- Use an array of objects.
 */
package com.infodev.abstraction;

import java.util.Random;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-02-07
 */
public class AreaArrayImpl {
    /**
     * Calculates area of multiple shapes using array
     */
    public static void performTask() {
        Area area[] = new Area[5];
        //object initialization
        for(int i=0;i<5;i++){
            area[i] = new Area();
        }
        //calculates area 4 times of each shape
        for(int i=0;i<4;i++){
            Random random = new Random();
            int length = random.nextInt(20);
            int breadth = random.nextInt(20);
            area[i].rectangleArea(length,breadth);
            area[i].squareArea(length);
            area[i].circleArea(length);
        }
        area[4].circleArea(21);
    }
}
