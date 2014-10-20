package com.example.examplemod.item;

import com.example.examplemod.crativetab.CreativeTabNB;
import com.example.examplemod.reference.Reference;

import net.minecraft.item.Item;

public class ItemNB extends Item
{
	public ItemNB()
	{
		super();
		this.setCreativeTab(CreativeTabNB.NB_Tab);
	}
	
	@Override
	public String getUnlocalizedName()
	{
		return String.format("item.%s%s", Reference.MOD_ID.toLowerCase());
	}
}
