package com.latidens.borealis.integration;

import net.neoforged.fml.ModList;

public enum BorealisModCompats {
    NOMANSLAND;

    private final String id;

    BorealisModCompats() {
        id = name().toLowerCase();
    }

    public boolean isLoaded() {
        return ModList.get().isLoaded(id);
    }
}
