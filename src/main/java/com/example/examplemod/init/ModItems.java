package com.example.examplemod.init;

import net.minecraft.item.Item;

import com.example.examplemod.item.ItemCoin;
import com.example.examplemod.item.ItemMapleLeaf;
import com.example.examplemod.item.ItemNB;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems 
{
	public static final ItemNB mapleLeaf = new ItemMapleLeaf();
	public static final ItemNB Coin = new ItemCoin();

	public static void init()
	{
		GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
		GameRegistry.registerItem(Coin, "Coin");
	}
}
