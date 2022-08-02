package org.academiadecodigo.red;

public enum ScenarioTypes {
    QUITING(-1),
    MENU(0),
    LVL1(1),
    LVL2(2),
    LVL3(3);

    private int myLvl;
    private final  String[] fullLifePath = new String[]{};
    private final String[] halfLifePath = new String[]{};
    private final String[] endLifePath = new String[]{};
    private final String[] bgPath = new String[]{};
    private final String[] paddlePath = new String[]{};

    ScenarioTypes(int i) {
        myLvl =i;
    }

    public String getStrFullHP() {
        return fullLifePath[myLvl-1];
    }
    public String getStrHalfLife() {
        return halfLifePath[myLvl-1];
    }
    public String getStrEndLife() {
        return endLifePath[myLvl-1];
    }
    public String getStrBg() {
        return bgPath[myLvl-1];
    }
    public String getStrPaddle() {
        return paddlePath[myLvl-1];
    }
    public int getMyLvl(){
        return myLvl;
    }
}
