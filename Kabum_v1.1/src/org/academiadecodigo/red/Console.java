package org.academiadecodigo.red;

import org.academiadecodigo.red.menu.Menu;

public class Console {
    private static Menu menu = new Menu();

    public static void main(String[] args) {
        menu.init();
        int lvlchosen;

        while (true){
            lvlchosen = menu.menu();

            if (lvlchosen == -1){
                break;
            }

            menu.startGame();
        }
        menu.close();
    }
}
