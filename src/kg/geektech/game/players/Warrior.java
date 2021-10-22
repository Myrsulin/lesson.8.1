package kg.geektech.game.players;

import java.util.Random;

public class Warrior extends Hero {
    public Warrior(int health, int damage) {
        super(health, damage, SuperAbility.CRITICAL_DAMAGE);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        Random random = new Random();
        int a = random.nextInt(5);
        switch (a){
            case 2:
                setDamage(getDamage() * 2);
                break;
            case 3:
                setDamage(getDamage() * 3);
                break;
            case 4:
                setDamage(getDamage() * 4);
                break;


        }


    }
}
