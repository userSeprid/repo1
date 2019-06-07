package com.game.events;

import com.game.units.Hero;
import com.game.units.Monster;

public interface Event {
    public void initEvent(Hero involvedHero, Monster involvedMonster);
}
