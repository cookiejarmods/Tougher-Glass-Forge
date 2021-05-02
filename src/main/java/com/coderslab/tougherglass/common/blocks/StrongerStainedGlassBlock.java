package com.coderslab.tougherglass.common.blocks;

import co.eltrut.differentiate.common.interf.IRenderTypeBlock;
import net.minecraft.block.StainedGlassBlock;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.item.DyeColor;

public class StrongerStainedGlassBlock extends StainedGlassBlock implements IRenderTypeBlock {

	public StrongerStainedGlassBlock(DyeColor colorIn, Properties properties) {
		super(colorIn, properties);
	}

	@Override
	public RenderType getRenderType() {
		return RenderType.translucent();
	}

}
