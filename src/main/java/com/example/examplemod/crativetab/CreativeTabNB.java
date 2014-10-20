package com.example.examplemod.crativetab;

import com.example.examplemod.init.ModItems;
import com.example.examplemod.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabNB 
{
	public static final CreativeTabs NB_Tab = new CreativeTabs(Reference.MOD_ID.toLowerCase())
	{
		@Override
		public Item getTabIconItem()
		{
			return ModItems.mapleLeaf;
		}
	};
}
