package tema3;

public class Main_Fighter {
    public static void main(String[] args) {
        // Describe a fighter
        Fighter warrior = new Warrior();
        System.out.println(warrior.toString());

        //  Make fighters not vulnerable by default
        System.out.println(warrior.isVulnerable()); // Should print "false"

        // Allow Wizards to prepare a spell
        Wizard wizard = new Wizard();
        wizard.prepareSpell();

        // Make Wizards vulnerable when not having prepared a spell
        System.out.println(wizard.isVulnerable()); // Should print "false" because a spell has been prepared

        // Calculate the damage points for a Wizard
        Warrior enemyWarrior = new Warrior();
        System.out.println(wizard.damagePoints(enemyWarrior)); // Should print "12" because a spell is prepared

        // Calculate the damage points for a Warrior
        Wizard enemyWizard = new Wizard();
        System.out.println(enemyWarrior.damagePoints(enemyWizard)); // Should print "10" because the Wizard is vulnerable
    }
}
