package com.DrVaristy.LeeMod.Items;

import com.DrVaristy.LeeMod.Main;
import com.DrVaristy.LeeMod.Init.ModItems;
import com.DrVaristy.LeeMod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

public ItemBase(String Name) {
	
	setUnlocalizedName(Name);
	setRegistryName(Name);
	setCreativeTab(CreativeTabs.TOOLS);
	
	ModItems.ITEMS.add(this);
}
	
	
	@Override
	public void registerModels()
		
	
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
