package com.worldcretornica.pwegoblocks;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.getspout.spoutapi.inventory.SpoutItemStack;
import org.getspout.spoutapi.material.CustomBlock;

import com.worldcretornica.pwegoblocks.block.CustomBlock1;
import com.worldcretornica.pwegoblocks.block.CustomBlock2;
import com.worldcretornica.pwegoblocks.block.TestBlock1;
import com.worldcretornica.pwegoblocks.block.TestBlock2;
import com.worldcretornica.pwegoblocks.block.TestBlock3;

public class PwegoBlocks extends JavaPlugin 
{
	
	public static CustomBlock testBlock1;
	public static CustomBlock testBlock2;
	public static CustomBlock testBlock3;
	public static CustomBlock customblock1;
	public static CustomBlock customblock2;
	
	@Override
	public void onEnable() {
		
		testBlock1 = new TestBlock1(this);
		testBlock2 = new TestBlock2(this);
		testBlock3 = new TestBlock3(this);
		customblock1 = new CustomBlock1(this);
		customblock2 = new CustomBlock2(this);
	}
	
	@Override
	public void onDisable() {
		
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) 
	{
		if(command.getName().equalsIgnoreCase("pwegoblocks"))
		{
			if(args.length > 0)
			{
				int blockid;
				Player p = (Player) sender;
				
				blockid = Integer.parseInt(args[0]);
				
				
				switch(blockid)
				{
				case 1:
					p.getInventory().addItem(new SpoutItemStack(testBlock1, 1));
					break;
				case 2:
					p.getInventory().addItem(new SpoutItemStack(testBlock2, 1));
					break;
				case 3:
					p.getInventory().addItem(new SpoutItemStack(testBlock3, 1));
					break;
				case 4:
					p.getInventory().addItem(new SpoutItemStack(customblock1, 1));
					break;
				}
			}
			
			return true;
		}
		
		return false;
	}
}
