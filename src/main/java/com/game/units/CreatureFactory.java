package com.game.units;

import com.game.processor.GameDifficulty;

import java.util.Random;

public final class CreatureFactory {
    private static final int DEFAULT_HEALTH = 100;
    private static final int DEFAULT_SPEED = 5;
    private static final int DEFAULT_ATTACK_POINTS = 10;
    private static final int DEFAULT_DEFENCE_POINTS = 3;

    private static final int NUMBER_OF_AVAILABLE_RACES = 5;

    private CreatureFactory() {}

    public static Creature getCreature(
            final CreatureType creatureType,
            final GameDifficulty difficulty
    ) {
        Random rand = new Random();
        switch (rand.nextInt(NUMBER_OF_AVAILABLE_RACES)) {
            case 1:
                return generateCreature(Race.DWARF, difficulty, creatureType);
            case 2:
                return generateCreature(Race.ELF, difficulty, creatureType);
            case 3:
                return generateCreature(Race.HUMAN, difficulty, creatureType);
            default:
                return generateCreature(Race.ORC, difficulty, creatureType);
            }
    }

    private static Creature generateCreature(
            final Race race,
            final GameDifficulty difficulty,
            final CreatureType creatureType
    ) {
        int health = DEFAULT_HEALTH
                + DEFAULT_HEALTH
                * race.getHealthModificatior()
                + DEFAULT_HEALTH
                * difficulty.getMonsterStatsModificator();
        int attackPoints = DEFAULT_ATTACK_POINTS
                + DEFAULT_ATTACK_POINTS
                * race.getAttackPointsModificator()
                + DEFAULT_ATTACK_POINTS
                * difficulty.getMonsterStatsModificator();
        int defencePoints = DEFAULT_DEFENCE_POINTS
                + DEFAULT_DEFENCE_POINTS
                * race.getDefencePointsModificator()
                + DEFAULT_DEFENCE_POINTS
                * difficulty.getMonsterStatsModificator();
        int speed = DEFAULT_SPEED
                + DEFAULT_SPEED
                * race.getSpeedModificator()
                + DEFAULT_SPEED
                * difficulty.getMonsterStatsModificator();

        if (creatureType.equals(CreatureType.MONSTER)) {
            return new Monster(
                    health,
                    "Angry monster",
                    attackPoints,
                    defencePoints,
                    speed,
                    race
            );
        } else {
            return new Hero(
                    health,
                    "Brave hero",
                    attackPoints,
                    defencePoints,
                    speed,
                    race
            );
        }
    }

}
