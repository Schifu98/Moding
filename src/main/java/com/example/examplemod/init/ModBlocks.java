package com.example.examplemod.init;

import com.example.examplemod.block.BlockFlag;
import com.example.examplemod.block.BlockNB;
import com.example.examplemod.reference.Names;
import com.example.examplemod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks 
{
	public static final BlockNB flag = new BlockFlag();
	
	public static void init()
	{
		GameRegistry.registerBlock(flag, Names.Blocks.FLAG);
	}
}
