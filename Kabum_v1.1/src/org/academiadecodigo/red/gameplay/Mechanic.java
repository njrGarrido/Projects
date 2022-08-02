package org.academiadecodigo.red.gameplay;

import org.academiadecodigo.red.KeysController;
import org.academiadecodigo.red.ScenarioTypes;
import org.academiadecodigo.red.gameplay.bricks.Bricks;
import org.academiadecodigo.red.gameplay.gamer.Paddle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.util.LinkedHashMap;

public class Mechanic {
    private Picture background;
    private ScenarioTypes gameLevel;
    private Ball ball;
    private Paddle paddle;
    private LinkedHashMap<String, Bricks> brickContainer;

    public Mechanic(ScenarioTypes level, Paddle paddle){
        gameLevel = level;
        this.paddle = paddle;
        ball = new Ball(level);
    }

    public void init() {
        background = new Picture(10,10,gameLevel.getStrBg());
    }
}
