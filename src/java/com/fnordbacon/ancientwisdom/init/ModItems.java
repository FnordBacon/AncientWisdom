package com.fnordbacon.ancientwisdom.init;

import com.fnordbacon.ancientwisdom.item.ItemCarvingRod;
import com.fnordbacon.ancientwisdom.item.ItemChiselSpade;
import com.fnordbacon.ancientwisdom.item.ItemCommon;
import com.fnordbacon.ancientwisdom.item.ItemDebugGun;
import com.fnordbacon.ancientwisdom.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

// init all the items
@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemCommon debugGun = new ItemDebugGun();
    public static final ItemCommon carvingRod = new ItemCarvingRod();
    public static final ItemCommon chiselSpade = new ItemChiselSpade();

    public static void init()
    {
        GameRegistry.registerItem(debugGun, "debugGun");
        GameRegistry.registerItem(carvingRod, "carvingRod");
        GameRegistry.registerItem(chiselSpade, "chiselSpade");
    }
}
