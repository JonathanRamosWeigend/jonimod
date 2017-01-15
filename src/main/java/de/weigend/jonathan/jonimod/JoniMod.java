package de.weigend.jonathan.jonimod;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = JoniMod.MODID, version = JoniMod.VERSION)
public class JoniMod
{
    public static final String MODID = "jonimod";
    public static final String VERSION = "1.0";
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // Beim Starten registrieren wir einen neuen Blocktyp Joniblock aus blauem Glas

        JoniBlock block = new JoniBlock(Material.GLASS, MapColor.BLUE);
        JoniItem item = new JoniItem();

        GameRegistry.register(item);
        GameRegistry.register(block);
    }
}
