package com.exc.mobamod.creep;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.world.World;

public class CreepEntity extends PathAwareEntity {

    protected CreepEntity(EntityType<? extends PathAwareEntity> type, World world) {
        super(type, world);
    }

    @Override
    public void tick() {
        super.tick();
        // TODO: движение по waypoint
    }
}
