package com.worldcretornica.pwegoblocks.block;

import org.bukkit.World;
import org.bukkit.block.BlockFace;
import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.material.block.GenericCuboidCustomBlock;

public class CustomBlock1 extends GenericCuboidCustomBlock 
{
	public CustomBlock1(Plugin plugin)
	{
		super(plugin, "CustomBlock1", "http://pwegoable.com/pwegoserver/wp-content/uploads/2013/03/a1-greenscreen.png", 16, 0.1f, 0.5f, 0.1f, 0.9f, 0.8f, 0.9f, true);
	}
	
	public boolean isProvidingPowerTo(World world, int x, int y, int z, BlockFace face) {
        return false;
    }
 
    public boolean isIndirectlyProvidingPowerTo(World world, int x, int y, int z, BlockFace face) {
        return false;
    }
}
