package net.cj.simplyspace.forge;

import net.cj.simplyspace.SimplySpace;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(SimplySpace.MOD_ID)
public class SimplySpaceForge {
    public SimplySpaceForge() {
        SimplySpace.init();
    }
}