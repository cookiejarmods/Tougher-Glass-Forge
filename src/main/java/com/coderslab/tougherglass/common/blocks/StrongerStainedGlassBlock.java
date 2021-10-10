package com.coderslab.tougherglass.common.blocks;

import co.eltrut.differentiate.common.interf.IRenderTypeBlock;
import net.minecraft.world.level.block.StainedGlassBlock;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.DyeColor;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class StrongerStainedGlassBlock extends StainedGlassBlock implements IRenderTypeBlock {

	public StrongerStainedGlassBlock(DyeColor colorIn, Properties properties) {
		super(colorIn, properties);
	}

	@Override
	public RenderType getRenderType() {
		return RenderType.translucent();
	}

}
