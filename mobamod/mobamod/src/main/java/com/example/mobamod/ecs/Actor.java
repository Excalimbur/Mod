package com.example.mobamod.ecs;

import java.util.HashMap;
import java.util.Map;

public class Actor {

    private final Map<Class<? extends Component>, Component> components = new HashMap<>();

    public <T extends Component> void add(T component) {
        components.put(component.getClass(), component);
    }

    public <T extends Component> T get(Class<T> type) {
        return type.cast(components.get(type));
    }

    public <T extends Component> boolean has(Class<T> type) {
        return components.containsKey(type);
    }
}