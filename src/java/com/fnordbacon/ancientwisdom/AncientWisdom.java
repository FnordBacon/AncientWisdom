package com.fnordbacon.ancientwisdom;

import com.fnordbacon.ancientwisdom.client.handler.KeyInputEventHandler;
import com.fnordbacon.ancientwisdom.handler.ConfigurationHandler;
import com.fnordbacon.ancientwisdom.init.ModBlocks;
import com.fnordbacon.ancientwisdom.init.ModItems;
import com.fnordbacon.ancientwisdom.init.Recipes;
import com.fnordbacon.ancientwisdom.proxy.IProxy;
import com.fnordbacon.ancientwisdom.reference.Reference;

import com.fnordbacon.ancientwisdom.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class AncientWisdom
{
	@Mod.Instance(Reference.MOD_ID) // clean instance of my mod. unaffected by changes other mods might make.
	public static AncientWisdom instance;

	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static IProxy proxy;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		// in here we do.. network handling, mod config, init items and blocks

		ConfigurationHandler.init(event.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

		proxy.registerKeyBindings();

		// Register items and blocks
		ModItems.init();
		ModBlocks.init();

		LogHelper.info("Pre Initialization done!");
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{
		// in here we do.. registration of gui, tile entities, crafting recipies
		// subs the input key events to the event bus
		// NOT NEED FOR NOW : FMLCommonHandler.instance().bus().register(new KeyInputEventHandler());
		Recipes.init();
		LogHelper.info("Initialization done!");
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		// everything that we want to be run after every other mod has finished loading
		LogHelper.info("Post Initialization done!");
	}
}
