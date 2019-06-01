package com.game.processor;

import com.game.units.Hero;
import com.game.units.Monster;

public class GameInstance {

    private final GameDifficulty gameDifficulty;
    private int turnCounter;
    private Hero currentHero;
    private Monster currentMonster;


    public GameInstance(final GameDifficulty gameDifficulty) {
        this.gameDifficulty = gameDifficulty;
        turnCounter = 1;
    }


}
