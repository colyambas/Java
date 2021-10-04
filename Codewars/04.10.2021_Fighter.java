// https://www.codewars.com/kata/577bd8d4ae2807c64b00045b/solutions/java
/*Create a function that returns the name of the winner in a fight between two fighters.

Each fighter takes turns attacking the other and whoever kills the other first is victorious. Death is defined as having health <= 0.

Each fighter will be a Fighter object/instance. See the Fighter class below in your chosen language.

Both health and damagePerAttack (damage_per_attack for python) will be integers larger than 0. You can mutate the Fighter objects.

Example:
public class Fighter {
  public String name;
  public int health, damagePerAttack;
  public Fighter(String name, int health, int damagePerAttack) {
    this.name = name;
    this.health = health;
    this.damagePerAttack = damagePerAttack;
  }
}*/
public class Fighter {

        public String name;
        public int health, damagePerAttack;
        public Fighter(String name, int health, int damagePerAttack) {
            this.name = name;
            this.health = health;
            this.damagePerAttack = damagePerAttack;
        }


    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
            int queue = 0;
            if (firstAttacker == fighter1.name) {
                queue = 1;
            }
            while (fighter1.health > 0 && fighter2.health > 0) {
                if (queue == 1) {
                    fighter2.health = fighter2.health - fighter1.damagePerAttack;
                    queue = 0;
                } else {
                    fighter1.health = fighter1.health - fighter2.damagePerAttack;
                    queue = 1;
                }
            }
        return fighter1.health >= fighter2.health ? fighter1.name : fighter2.name;
    }
}
