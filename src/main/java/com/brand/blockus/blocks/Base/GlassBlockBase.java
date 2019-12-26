package com.brand.blockus.blocks.Base;

import com.brand.blockus.Blockus;

import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.GlassBlock;
import net.minecraft.block.Material;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class GlassBlockBase extends GlassBlock {

    public GlassBlockBase(String name, float hardness, float resistance) {
	    super(FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS).strength(hardness, resistance).nonOpaque().build());
	    Registry.register(Registry.BLOCK, new Identifier(Blockus.MOD_ID, name), this);
	    Registry.register(Registry.ITEM,new Identifier(Blockus.MOD_ID, name), new BlockItem(this, new Item.Settings().maxCount(64).group(Blockus.BLOCKUS_BUILDING_BLOCKS)));
    
   }
}
