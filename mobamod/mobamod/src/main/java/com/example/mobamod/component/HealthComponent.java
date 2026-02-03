package com.example.mobamod.component;

import com.example.mobamod.ecs.Component;

public class HealthComponent implements Component {

    public float hp;
    public float maxHp;

    public HealthComponent(float maxHp) {
        this.maxHp = maxHp;
        this.hp = maxHp;
    }

    public void damage(float dmg) {
        hp -= dmg;
    }

    public boolean dead() {
        return hp <= 0;
    }
}