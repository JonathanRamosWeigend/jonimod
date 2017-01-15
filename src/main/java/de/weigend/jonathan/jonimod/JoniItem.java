package de.weigend.jonathan.jonimod;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

/**
 * Created by weigend on 15.01.17.
 */
public class JoniItem extends ItemBlock {
    public JoniItem() {
        super(new JoniBlock(Material.GLASS));
        setUnlocalizedName("joniitem");
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        setRegistryName("joniitem");
    }
}
