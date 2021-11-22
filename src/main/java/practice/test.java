package practice;

import processing.core.PApplet;

public class test extends PApplet {
    public static void main(String... args) {
        PApplet.main(test.class);
    }
    @Override
    public void settings() {
        size (500,500);
    }
    int x = 1;
    int y = 1;

    @Override
    public void draw() {
        background(204);
        rect(x, y, 50, 50);
        if (mouseX > x && mouseX < x + 50 && mouseY > y && mouseY < y + 50) {
            x = (int) (Math.random() * 400);
            y = (int) (Math.random() * 400);
        }
    }
}

