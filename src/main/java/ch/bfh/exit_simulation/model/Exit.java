package ch.bfh.exit_simulation.model;

import ch.bfh.exit_simulation.util.Vector2d;

import java.awt.*;

/**
 * Created by Shylux on 19.10.2015.
 */
public class Exit extends Rectangle {

    public Exit(int _x, int _y, int _width, int _height) {
        super(_x, _y, _width, _height);
    }
    public Vector2d getNavigationPoint() {
        return new Vector2d(this.getCenterX(), this.getCenterY());
    }
}
