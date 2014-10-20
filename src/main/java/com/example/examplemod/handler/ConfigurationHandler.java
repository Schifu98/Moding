package com.example.examplemod.handler;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

import com.example.examplemod.reference.Reference;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class ConfigurationHandler 
{
	public static Configuration configuration;
	public static boolean testValue;
	
	public static void init(File configFile)
	{
		if (configuration == null)
		{
			configuration  = new Configuration(configFile);
		}
		
	}
	{	
		String configValue = null;
		System.out.println("Configuration Test: " +  configValue);
	}
	
	@SubscribeEvent
	public void onConfigurationChengedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
	{
		if (event.modID.equalsIgnoreCase(Reference.MOD_ID))
		{
			loadConfiguration();
		}
	}
	
	public void loadConfiguration()
	{
		testValue = configuration.getBoolean("configValue", Configuration.CATEGORY_GENERAL, false, "This is an example configuration value");
		
		if (configuration.hasChanged())
		{
			configuration.save();
		}
	}
}
