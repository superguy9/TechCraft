package me.superguy9.techcraft;

import me.superguy9.techcraft.proxy.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ModInformation.MODID, name = ModInformation.NAME, version = ModInformation.VERSION)
public class TechCraft {
	
	@Instance(ModInformation.MODID)
	public static TechCraft instance;
	
	@SidedProxy(clientSide = "me.superguy9.techcraft.proxy.ClientProxy", serverSide = "me.superguy9.techcraft.proxy.CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		proxy.initRenderers();
		proxy.initSounds();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
	}
}
