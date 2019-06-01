package com.game.units;

public abstract class Creature {
    private int health;
    private String name;
    private int attackPoints;
    private int defencePoints;
    private int speed;
    private final Race race;

    public Creature(final int baseHealth,
                    final String baseName,
                    final int baseAttackPoints,
                    final int baseDefencePoints,
                    final int basedSpeed,
                    final Race basedRace) {
        this.health = baseHealth;
        this.name = baseName;
        this.attackPoints = baseAttackPoints;
        this.defencePoints = baseDefencePoints;
        this.speed = basedSpeed;
        this.race = basedRace;
    }

    /**
     * Method executes attack on selected unit.
     * The health of attacked unit will be decreased on :
     * (attacker attack power - attacked unit defence)
     * @param attackedUnit the creature that will be attacked
     */
    public void attackAnEnemy(final Creature attackedUnit) {
        attackedUnit.setHealth(attackedUnit.getHealth()
                - (this.getAttackPower()
                - attackedUnit.getDefencePoints()));
    }

    /**
     * Return current attack power value of creature.
     * The attakPower is AP + AP * race modificator.
     * @return numerical value of attack power
     */
    public int getAttackPower() {
        return (attackPoints + attackPoints
                * race.getAttackPointsModificator());
    }

    /**
     * Return current value of health of the creature.
     * @return numerical value of the creature health
     */
    public int getHealth() {
        return health;
    }

    /**
     * Set new value for the creature health.
     * @param newHealth numerical value of the creature health
     */
    public void setHealth(final int newHealth) {
        this.health = newHealth;
    }

    /**
     * Return current name of the creature.
     * @return string value of the creature name
     */
    public String getName() {
        return name;
    }

    /**
     * Set new value for the creature name.
     * @param newName string value for the creature name
     */
    public void setName(final String newName) {
        this.name = newName;
    }

    /**
     * Return current attack points of the creature.
     * @return numerical value of the creature attack points
     */
    public int getAttackPoints() {
        return attackPoints;
    }

    /**
     * Set new value for the creature attack points.
     * @param newAttackPoints numerical value for the creature attack points
     */
    public void setAttackPoints(final int newAttackPoints) {
        this.attackPoints = newAttackPoints;
    }

    /**
     * Return current defence points of the creature.
     * @return numerical value of the creature defence points
     */
    public int getDefencePoints() {
        return defencePoints;
    }

    /**
     * Set new value for the creature defence points.
     * @param newDefencePoints numerical value for the creature defence points
     */
    public void setDefencePoints(final int newDefencePoints) {
        this.defencePoints = newDefencePoints;
    }

    /**
     * Return current speed of the the creature.
     * @return numerical value of the creature speed
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * Set new speed for the creature.
     * @param newSpeed numerical value for the creature speed
     */
    public void setSpeed(final int newSpeed) {
        this.speed = newSpeed;
    }

    /**
     * Return current race of the the creature.
     * @return current race of the creature using 'Race' object
     */
    public Race getRace() {
        return this.race;
    }
}
