package App;

import java.awt.Color;
import java.awt.Graphics2D;

public class Projectiles extends Entity{

    public Projectiles(int x, int y, int width, int height, int speed) {
        super(x, y, width, height, speed);
    }

    @Override
    public void draw(Graphics2D g2) {
        g2.setColor(new Color(118, 52, 35));
        g2.fillOval(x, y, width, height);
    }

    public void move(){
        y += speed;
    }
}