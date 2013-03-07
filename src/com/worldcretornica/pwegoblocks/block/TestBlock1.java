package com.worldcretornica.pwegoblocks.block;

import org.bukkit.World;
import org.bukkit.block.BlockFace;
import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;

public class TestBlock1 extends GenericCubeCustomBlock 
{
	public TestBlock1(Plugin plugin)
	{
		super(plugin, "TestBlock1", "http://pwegoable.com/pwegoserver/wp-content/uploads/2013/03/a1-greenscreen.png", 16);
	}
	
	public boolean isProvidingPowerTo(World world, int x, int y, int z, BlockFace face) {
        return false;
    }
 
    public boolean isIndirectlyProvidingPowerTo(World world, int x, int y, int z, BlockFace face) {
        return false;
    }
}
