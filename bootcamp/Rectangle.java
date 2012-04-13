package bootcamp;

import java.util.Random;

public class Rectangle {
    private int width;
    private int height;
    public Random r;// this is for random number multiplication

    public Rectangle(Random r){
        this.r = r;
    }
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }



    public int perimeter() {
        return width * 2 + height * 2;
    }

    public int area() {
        return width * height;
    }

    public static Rectangle createSquare(int length) {
        return new Rectangle(length, length);
    }

    public static Rectangle createRectangle(int height, int width) {
        return new Rectangle(height, width);
    }

    public int multiply(int value) {
        return value * r.nextInt();
    }
}
