package kg.geektech.game.players;

import java.util.Random;

public class Golem extends Hero {
    public Golem(int health, int damage) {
        super(health, damage, SuperAbility.SHIT);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        boss.setDamage(boss.getDamage() / 5);
        }



    
}
