package tema3;

abstract class Fighter {

    @Override
    public String toString() {
        return "Fighter is a " + this.getClass().getSimpleName();
    }

    boolean isVulnerable() {
        return false; // Fighters are not vulnerable by default
    }

    abstract int damagePoints(Fighter fighter);

}

class Warrior extends Fighter {

    @Override
    int damagePoints(Fighter fighter) {
        return fighter.isVulnerable() ? 10 : 6;
    }
}

class Wizard extends Fighter {
    private int spells;

    @Override
    boolean isVulnerable() {
        return spells == 0;
    }

    @Override
    int damagePoints(Fighter fighter) {
        if (spells > 0) {
            spells -= 1;
            return 12;
        }
        return 3;
    }

    void prepareSpell() {
        spells += 1;
    }
}
