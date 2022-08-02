package org.academiadecodigo.red.gameplay.bricks;

import org.academiadecodigo.red.ScenarioTypes;
import org.academiadecodigo.red.gameplay.PositionMap;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public abstract class Bricks {
    private ScenarioTypes scenarioTypes;
    private PositionMap pos;
    private Picture brickGraph;

    public Bricks(PositionMap pos, ScenarioTypes type){
        this.pos = pos;
        scenarioTypes = type;
        brickGraph = new Picture(pos.getDraw(1),pos.getDraw(2));
    }
}
