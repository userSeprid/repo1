package com.game.processor;

import com.game.events.Event;
import com.game.events.EventFactory;
import com.game.units.CreatureFactory;
import com.game.units.CreatureType;
import com.game.units.Hero;
import com.game.units.Monster;

public class GameInstance {

    private final GameDifficulty gameDifficulty;
    private int turnCounter;
    private Hero currentHero;
    private Monster currentMonster;
    private Event currecntEvent;
    private Event nextEvent;
    private boolean gameOver = false;


    public GameInstance(final GameDifficulty gameDifficulty) {
        this.gameDifficulty = gameDifficulty;
        this.turnCounter = 1;
        this.currentHero = (Hero) CreatureFactory.getCreature(CreatureType.HERO, gameDifficulty);
        this.currentMonster = (Monster) CreatureFactory.getCreature(CreatureType.MONSTER, gameDifficulty);
        this.currecntEvent = EventFactory.getEvent();
    }

    private void generateNextEvent() {
        nextEvent = EventFactory.getEvent();
    }

    public boolean makeATurnAhead() {
        processCurrentTurn();
        checkAnRefreshUnits();
        if (gameOver) {
            return false;
        }
        generateNextEvent();
        return true;
    }

    private void processCurrentTurn() {

    }


    private void checkAnRefreshUnits() {
        if (currentHero.getHealth() < 1) {
            this.gameOver = true;
        } else if (currentMonster.getHealth() < 1) {
            this.currentMonster = (Monster) CreatureFactory.getCreature(CreatureType.MONSTER, gameDifficulty);
        }
    }

}
