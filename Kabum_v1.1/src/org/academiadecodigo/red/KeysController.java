package org.academiadecodigo.red;

import org.academiadecodigo.red.gameplay.gamer.Paddle;
import org.academiadecodigo.red.menu.Menu;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class KeysController implements KeyboardHandler {
    private Menu menu;
    private Paddle paddle;

    public KeysController(Menu menu){
        this.menu = menu;
    }
    public void init() {
        keyboardInit();
    }

    private void keyboardInit(){
        Keyboard keyboard = new Keyboard(this);

        //Press 1 for first level
        KeyboardEvent onePressed = new KeyboardEvent();
        onePressed.setKey(KeyboardEvent.KEY_1);
        onePressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(onePressed);

        //Press 2 for second level
        KeyboardEvent twoPressed = new KeyboardEvent();
        twoPressed.setKey(KeyboardEvent.KEY_2);
        twoPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(twoPressed);

        //Press 3 for third level
        KeyboardEvent threePressed = new KeyboardEvent();
        threePressed.setKey(KeyboardEvent.KEY_3);
        threePressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(threePressed);

        //Press q for quiting application
        KeyboardEvent qPressed = new KeyboardEvent();
        qPressed.setKey(KeyboardEvent.KEY_Q);
        qPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(qPressed);

        //Press S for save the game
        KeyboardEvent sPressed = new KeyboardEvent();
        sPressed.setKey(KeyboardEvent.KEY_S);
        sPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(sPressed);

        //Press l for load last game
        KeyboardEvent lPressed = new KeyboardEvent();
        lPressed.setKey(KeyboardEvent.KEY_L);
        lPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(lPressed);
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        if(keyboardEvent.getKey() == KeyboardEvent.KEY_1) {
            menu.setPlayerLvl(ScenarioTypes.LVL1);

        }
        if(keyboardEvent.getKey() == KeyboardEvent.KEY_2) {
            menu.setPlayerLvl(ScenarioTypes.LVL2);
        }
        if(keyboardEvent.getKey() == KeyboardEvent.KEY_3) {
            menu.setPlayerLvl(ScenarioTypes.LVL3);
        }

        if(keyboardEvent.getKey() == KeyboardEvent.KEY_Q) {
            menu.setPlayerLvl(ScenarioTypes.QUITING);
        }
        if(keyboardEvent.getKey() == KeyboardEvent.KEY_S) {
            menu.saveGame();
        }

        if(keyboardEvent.getKey() == KeyboardEvent.KEY_L) {
            menu.setSavedGame(true);
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }

    public void setPaddle(Paddle user){
        paddle = user;
    }
}
