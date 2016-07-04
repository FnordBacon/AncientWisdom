package com.fnordbacon.ancientwisdom.creativetab;

import com.fnordbacon.ancientwisdom.init.ModItems;
import com.fnordbacon.ancientwisdom.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabAncientWisdom
{
    public static final CreativeTabs AW_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase()) {
        @Override
        public Item getTabIconItem() {
            return ModItems.debugGun;
        }


    };
}
