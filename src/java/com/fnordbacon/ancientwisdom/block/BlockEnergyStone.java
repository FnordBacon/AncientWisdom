package com.fnordbacon.ancientwisdom.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class BlockEnergyStone extends BlockCommon
{
    public IIcon[] icons = new IIcon[23];
    public IIcon[] iconMap = new IIcon[6];
    public enum textures
    {
        stone, bottomLeft_off, bottomLeft_on, center_off, center_on, cross_off, cross_on, horiz_off, horiz_on, TDown_off, TDown_on, TLeft_off, TLeft_on, topLeft_off, topLeft_on, topRight_off, topRight_on, TRight_off, TRight_on, TUp_off, TUp_on, vert_off, vert_o
    }

    public BlockEnergyStone()
    {
        super();
        this.setBlockName("energyStone");
        this.setBlockTextureName("energyStone");
        this.setHardness(1.5f);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) {
        return this.iconMap[side];
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        // registers all the textures the block may use
        int count = 0;
        for (textures name : textures.values())
        {
            icons[count] = iconRegister.registerIcon(this.textureName + "_" + name);
            count++;
        }
        // maps the 0 position texture to all sides of the cube
        for (int i = 0; i < iconMap.length; i++)
        {
            iconMap[i] = icons[0];
        }
    }
}


/**
 need to find a way to get check if the right tool was used and find out which side the block was clicked on.
 */