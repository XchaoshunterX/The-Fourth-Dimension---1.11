package com.chaoshunter.d4;

import java.util.Random;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = D4.MOD_ID, name = D4.MOD_NAME, version = D4.MOD_Verison, dependencies = D4.DEPENDENCIES)
public class D4 {
	public static final String MOD_ID = "d4";
	public static final String MOD_NAME = "The Fourth Dimension";
	public static final String MOD_Verison = "0.0.1";
	public static final String DEPENDENCIES = "required-after:forge@[13.19.1.2189,);after:modid";
	public static final String RESOURCE_PREFIX = MOD_ID.toLowerCase() + ":";
	
	
	public static Random random = new Random();
	
	@Instance(MOD_ID)
	public static D4 instance;
	
	@SidedProxy(clientSide = "com.chaoshunter.d4.ClientProxy", serverSide = "com.chaoshunter.d4.CommonProxy")
	public static CommonProxy proxy; 
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		
		proxy.preInit(event);
		
	}
	
	public void init(FMLInitializationEvent event){
		
		proxy.init(event);
	}
	
	public void PostInit(FMLPostInitializationEvent event){
		
		proxy.postInit(event);
	}
}
