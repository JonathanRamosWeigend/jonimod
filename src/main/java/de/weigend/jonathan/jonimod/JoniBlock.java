package de.weigend.jonathan.jonimod;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Created by weigend on 08.01.17.
 */
public class JoniBlock extends Block {

    public static final String NAME = "Joniblock";

    public JoniBlock(Material blockMaterialIn, MapColor blockMapColorIn) {
        super(blockMaterialIn, blockMapColorIn);

        setUnlocalizedName(NAME);
        setRegistryName(NAME);
        setLightLevel(1.0f);
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
    }

    public JoniBlock(Material blockMaterialIn) {
        this(blockMaterialIn, MapColor.BLUE);
    }

}
