package com.worldcretornica.pwegoblocks.block;

import org.bukkit.World;
import org.bukkit.block.BlockFace;
import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.material.block.GenericCustomBlock;

import com.worldcretornica.pwegoblocks.design.CustomDesign;

public class CustomBlock2 extends GenericCustomBlock 
{	
	public CustomBlock2(Plugin plugin)
	{
		super(plugin, "CustomBlock2", true, new CustomDesign(plugin));
		setOpaque(false);
	}
	
	public boolean isProvidingPowerTo(World world, int x, int y, int z, BlockFace face) {
        return false;
    }
 
    public boolean isIndirectlyProvidingPowerTo(World world, int x, int y, int z, BlockFace face) {
        return false;
    }
    
    @Override
	public int getBlockId() {
		return 20;
	}
}
