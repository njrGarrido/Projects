package org.academiadecodigo.red.gameplay;

import java.util.LinkedHashMap;


public class PositionMap extends LinkedHashMap<String,Double> {
    private double[] drawPos;

    public PositionMap(double x, double y, double width, double height){
        drawPos = new double[]{x,y,width,height};
        put("X",drawPos[0]);
        put("Y",drawPos[1]);
        put("cmX", drawPos[0]/drawPos[2]);
        put("cmY", drawPos[1]/drawPos[3]);
    }
    public double getDraw(int i) {
        return drawPos[i];
    }
}
