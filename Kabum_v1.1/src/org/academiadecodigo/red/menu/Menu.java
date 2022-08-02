package org.academiadecodigo.red.menu;

import org.academiadecodigo.red.GameConstructor;
import org.academiadecodigo.red.KeysController;
import org.academiadecodigo.red.ScenarioTypes;
import org.academiadecodigo.red.gameplay.Mechanic;
import org.academiadecodigo.red.gameplay.gamer.Paddle;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Menu {

    public static final Rectangle screenSize = new Rectangle(10,10,1100,800);
    private KeysController keyboard;
    private ScenarioTypes playerLvl;
    private GameConstructor playerGame;
    private Mechanic mechanic;
    private boolean savedGame;
    public Menu(){
        keyboard = new KeysController(this);
        screenSize.setColor(Color.WHITE);
        savedGame = false;
    }
    public void init(){
        screenSize.draw();
        keyboard.init();
    }

    public int menu() {
        int counter = 0;
        playerLvl = ScenarioTypes.MENU;
        while (playerLvl == ScenarioTypes.MENU){

            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                System.out.println("Menu(): Thread.Sleep error");
                throw new RuntimeException(e);
            }
            counter++;
            if(counter % 50 == 0){
                System.out.println(counter * 0.02);
            }
        }
        Paddle newPlayer = new Paddle(playerLvl);
        playerGame = new GameConstructor(playerLvl);
        mechanic = new Mechanic(playerLvl, newPlayer);
        keyboard.setPaddle(newPlayer);
        return playerLvl.getMyLvl();
    }
    public void setPlayerLvl(ScenarioTypes choosenLevel){
        playerLvl = choosenLevel;
    }

    public void startGame() {
        playerGame.init();
        mechanic.init();

        // Check if user press load game
        if (savedGame){
            // Load .txt
            // Load played Level
            playerLvl = ScenarioTypes.LVL1;
            loadLastGame();
            savedGame = false;
        } else {

        }
    }

    public void close() {
        System.exit(0);
    }

    public void saveGame() {
        playerGame.save();
    }

    public void loadLastGame() {
        playerGame.load();
    }
    public void setSavedGame(boolean savedGame){
        this.savedGame = savedGame;
    }
}
