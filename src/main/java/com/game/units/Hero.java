package com.game.units;

public class Hero extends Creature {
    public Hero(final int health,
                final String name,
                final int attackPoints,
                final int defencePoints,
                final int speed,
                final Race race) {

        super(health,
                name,
                attackPoints,
                defencePoints,
                speed,
                race);
    }
}
