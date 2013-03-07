package com.worldcretornica.pwegoblocks.textures;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.Texture;

public class CustomTexture1 extends Texture 
{
	public CustomTexture1(Plugin plugin)
	{
		super(plugin, "http://pwegoable.com/pwegoserver/wp-content/uploads/2013/03/a2-bluescreen.png", 1, 1, 1);
		//this.subTextures.add(new CustomTexture2(plugin));
	}
}
