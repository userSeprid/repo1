package com.game.units;

public enum Race {
    HUMAN(2, 1, 1, 0),
    DWARF(1, 0, 1, 2),
    ELF(1, 2, 0, 1),
    ORC(0, 1, 2, 1);

    private int healthModificatior;
    private int speedModificator;
    private int attackPointsModificator;
    private int defencePointsModificator;

    Race(final int defaultHealthModificatior,
         final int defaultSpeedModificator,
         final int defaultAttackPointsModificator,
         final int defaultDefencePointsModificator) {
        this.healthModificatior = defaultHealthModificatior;
        this.speedModificator = defaultSpeedModificator;
        this.attackPointsModificator = defaultAttackPointsModificator;
        this.defencePointsModificator = defaultDefencePointsModificator;
    }

    public int getHealthModificatior() {
        return healthModificatior;
    }

    public int getSpeedModificator() {
        return speedModificator;
    }

    public int getAttackPointsModificator() {
        return attackPointsModificator;
    }

    public int getDefencePointsModificator() {
        return defencePointsModificator;
    }
}
