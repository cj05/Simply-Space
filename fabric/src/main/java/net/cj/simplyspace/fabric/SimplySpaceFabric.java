package net.cj.simplyspace.fabric;

import net.cj.simplyspace.SimplySpace;
import net.fabricmc.api.ModInitializer;

public class SimplySpaceFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        SimplySpace.init();
    }
}