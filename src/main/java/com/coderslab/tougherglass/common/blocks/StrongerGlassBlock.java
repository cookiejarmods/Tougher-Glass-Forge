package com.coderslab.tougherglass.common.blocks;

import co.eltrut.differentiate.common.interf.IRenderTypeBlock;
import net.minecraft.world.level.block.GlassBlock;
import net.minecraft.client.renderer.RenderType;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class StrongerGlassBlock extends GlassBlock implements IRenderTypeBlock {

	public StrongerGlassBlock(Properties properties) {
		super(properties);
	}

	@Override
	public RenderType getRenderType() {
		return RenderType.cutout();
	}

}
