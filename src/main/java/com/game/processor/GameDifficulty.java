package com.game.processor;

public enum GameDifficulty {
    EASY(1, 25, 60, 15),
    NORMAL(5, 30, 40, 30),
    HARD(10, 15, 25, 60);


    private int monsterStatsModificator;
    private int neutralEventChanceValue;
    private int positiveEventChanceValue;
    private int negativeEventChanceValue;

    GameDifficulty(final int defaultMonsterStatsModificator,
                   final int defaultNeutralEventChanceValue,
                   final int defaultPositiveEventChanceValue,
                   final int defaultNegativeEventChanceValue) {
        this.monsterStatsModificator = defaultMonsterStatsModificator;
        this.neutralEventChanceValue = defaultNeutralEventChanceValue;
        this.positiveEventChanceValue = defaultPositiveEventChanceValue;
        this.negativeEventChanceValue = defaultNegativeEventChanceValue;
    }

    public int getMonsterStatsModificator() {
        return monsterStatsModificator;
    }

    public int getNeutralEventChanceValue() {
        return neutralEventChanceValue;
    }

    public int getPositiveEventChanceValue() {
        return positiveEventChanceValue;
    }

    public int getNegativeEventChanceValue() {
        return negativeEventChanceValue;
    }
}
