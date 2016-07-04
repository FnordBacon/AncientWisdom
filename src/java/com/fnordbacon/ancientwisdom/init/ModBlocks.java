package com.fnordbacon.ancientwisdom.init;

import com.fnordbacon.ancientwisdom.block.BlockCommon;
import com.fnordbacon.ancientwisdom.block.BlockEnergyStone;
import com.fnordbacon.ancientwisdom.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockCommon energyStone = new BlockEnergyStone();

    public static void init()
    {
        GameRegistry.registerBlock(energyStone, "energyStone");
    }
}
