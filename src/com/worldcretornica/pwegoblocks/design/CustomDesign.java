package com.worldcretornica.pwegoblocks.design;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericBlockDesign;
import org.getspout.spoutapi.block.design.Quad;
import org.getspout.spoutapi.block.design.SubTexture;
import org.getspout.spoutapi.block.design.Texture;

import com.worldcretornica.pwegoblocks.textures.CustomTexture2;

public class CustomDesign extends GenericBlockDesign
{
	
	
	public CustomDesign(Plugin plugin)
	{		
		float yMin = 0.5f;
		float yMax = 0.6f;
		float xMin = 0.2f;
		float xMax = 0.8f;
		float zMin = 0.2f;
		float zMax = 0.8f;
		
		float yPoleMin = 0.0f;
		float yPoleMax = 0.5f;
		float xPoleMin = 0.4f;
		float xPoleMax = 0.6f;
		float zPoleMin = 0.4f;
		float zPoleMax = 0.6f;
		
		setBoundingBox(xMin, yMin, zMin, xMax, yMax, zMax);
		this.
		setQuadNumber(10);
		
		Texture texture = new CustomTexture2(plugin);
		
		setMinBrightness(0.2F).setMaxBrightness(0.8F).setTexture(plugin, texture);
		
		SubTexture subtexture = new SubTexture(texture, 1, 1, 1);
		
		Quad bottom = new Quad(0, subtexture);
		bottom.addVertex(0, xMin, yMin, zMin);
		bottom.addVertex(1, xMax, yMin, zMin);
		bottom.addVertex(2, xMax, yMin, zMax);
		bottom.addVertex(3, xMin, yMin, zMax);
		setLightSource(0, 0, -1, 0);

		Quad face1 = new Quad(1, subtexture);
		face1.addVertex(0, xMin, yMin, zMin);
		face1.addVertex(1, xMin, yMax, zMin);
		face1.addVertex(2, xMax, yMax, zMin);
		face1.addVertex(3, xMax, yMin, zMin);
		setLightSource(1, 0, 0, -1);

		Quad face2 = new Quad(2, subtexture);
		face2.addVertex(0, xMax, yMin, zMin);
		face2.addVertex(1, xMax, yMax, zMin);
		face2.addVertex(2, xMax, yMax, zMax);
		face2.addVertex(3, xMax, yMin, zMax);
		setLightSource(2, 1, 0, 0);

		Quad face3 = new Quad(3, subtexture);
		face3.addVertex(0, xMax, yMin, zMax);
		face3.addVertex(1, xMax, yMax, zMax);
		face3.addVertex(2, xMin, yMax, zMax);
		face3.addVertex(3, xMin, yMin, zMax);
		setLightSource(3, 0, 0, 1);

		Quad face4 = new Quad(4, subtexture);
		face4.addVertex(0, xMin, yMin, zMax);
		face4.addVertex(1, xMin, yMax, zMax);
		face4.addVertex(2, xMin, yMax, zMin);
		face4.addVertex(3, xMin, yMin, zMin);
		setLightSource(4, -1, 0, 0);

		Quad top = new Quad(5, subtexture);
		top.addVertex(0, xMin, yMax, zMin);
		top.addVertex(1, xMin, yMax, zMax);
		top.addVertex(2, xMax, yMax, zMax);
		top.addVertex(3, xMax, yMax, zMin);
		setLightSource(5, 0, 1, 0);
		
		
		Quad poleface1 = new Quad(6, subtexture);
		poleface1.addVertex(0, xPoleMin, yPoleMin, zPoleMin);
		poleface1.addVertex(1, xPoleMin, yPoleMax, zPoleMin);
		poleface1.addVertex(2, xPoleMax, yPoleMax, zPoleMin);
		poleface1.addVertex(3, xPoleMax, yPoleMin, zPoleMin);
		setLightSource(6, 0, 0, -1);

		Quad poleface2 = new Quad(7, subtexture);
		poleface2.addVertex(0, xPoleMax, yPoleMin, zPoleMin);
		poleface2.addVertex(1, xPoleMax, yPoleMax, zPoleMin);
		poleface2.addVertex(2, xPoleMax, yPoleMax, zPoleMax);
		poleface2.addVertex(3, xPoleMax, yPoleMin, zPoleMax);
		setLightSource(7, 1, 0, 0);

		Quad poleface3 = new Quad(8, subtexture);
		poleface3.addVertex(0, xPoleMax, yPoleMin, zPoleMax);
		poleface3.addVertex(1, xPoleMax, yPoleMax, zPoleMax);
		poleface3.addVertex(2, xPoleMin, yPoleMax, zPoleMax);
		poleface3.addVertex(3, xPoleMin, yPoleMin, zPoleMax);
		setLightSource(8, 0, 0, 1);

		Quad poleface4 = new Quad(9, subtexture);
		poleface4.addVertex(0, xPoleMin, yPoleMin, zPoleMax);
		poleface4.addVertex(1, xPoleMin, yPoleMax, zPoleMax);
		poleface4.addVertex(2, xPoleMin, yPoleMax, zPoleMin);
		poleface4.addVertex(3, xPoleMin, yPoleMin, zPoleMin);
		setLightSource(9, -1, 0, 0);


		setQuad(bottom).setQuad(face1).setQuad(face2).setQuad(face3).setQuad(face4).setQuad(top).setQuad(poleface1).setQuad(poleface2).setQuad(poleface3).setQuad(poleface4);

	}
	
}
