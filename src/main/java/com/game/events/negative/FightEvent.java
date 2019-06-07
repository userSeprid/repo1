package com.game.events.negative;

import com.game.units.Creature;
import com.game.units.Hero;
import com.game.units.Monster;

public class FightEvent implements NegativeEvent {

    private Creature[] involvedUnits = new Creature[2];
    private Hero currentHero;
    private Monster currentMonster;

    @Override
    public void initEvent(final Hero involvedHero, final Monster involvedMonster) {
        this.currentHero = involvedHero;
        this.currentMonster = involvedMonster;
        insertByCreatureSpeed();



    }

    private void insertByCreatureSpeed() {
        if (currentHero.getSpeed() > currentMonster.getSpeed()) {
            involvedUnits[0] = currentHero;
            involvedUnits[1] = currentMonster;
        } else {
            involvedUnits[0] = currentMonster;
            involvedUnits[1] = currentHero;
        }

    }


}
