package com.exc.mobamod.component;

public class HealthComponent implements Component {

    public float health;
    public float maxHealth;

    public HealthComponent(float maxHealth) {
        this.maxHealth = maxHealth;
        this.health = maxHealth;
    }

    public void damage(float amount) {
        health -= amount;
    }

    public boolean isDead() {
        return health <= 0;
    }
}
