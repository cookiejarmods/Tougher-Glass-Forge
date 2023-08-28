package com.coderslab.tougherglass.core.registry;

import com.coderslab.tougherglass.core.TougherGlass;
import com.teamabnormals.blueprint.core.util.registry.BlockSubRegistryHelper;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.GlassBlock;
import net.minecraft.world.level.block.StainedGlassBlock;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;

@Mod.EventBusSubscriber(modid = TougherGlass.MOD_ID, bus = Bus.MOD)
public class TABlocks {
	
	public static final BlockSubRegistryHelper HELPER = TougherGlass.REGISTRY_HELPER.getBlockSubHelper();
	public static final List<RegistryObject<Block>> BLOCKS = new ArrayList<>();

	public static final RegistryObject<Block> STRONGER_GLASS = createStrongGlass();
	public static final RegistryObject<Block> STRONGER_WHITE_STAINED_GLASS = createStrongStainedGlass(DyeColor.WHITE);
	public static final RegistryObject<Block> STRONGER_ORANGE_STAINED_GLASS = createStrongStainedGlass(DyeColor.ORANGE);
	public static final RegistryObject<Block> STRONGER_MAGENTA_STAINED_GLASS = createStrongStainedGlass(DyeColor.MAGENTA);
	public static final RegistryObject<Block> STRONGER_LIGHT_BLUE_STAINED_GLASS = createStrongStainedGlass(DyeColor.LIGHT_BLUE);
	public static final RegistryObject<Block> STRONGER_YELLOW_STAINED_GLASS = createStrongStainedGlass(DyeColor.YELLOW);
	public static final RegistryObject<Block> STRONGER_LIME_STAINED_GLASS = createStrongStainedGlass(DyeColor.LIME);
	public static final RegistryObject<Block> STRONGER_PINK_STAINED_GLASS = createStrongStainedGlass(DyeColor.PINK);
	public static final RegistryObject<Block> STRONGER_GRAY_STAINED_GLASS = createStrongStainedGlass(DyeColor.GRAY);
	public static final RegistryObject<Block> STRONGER_LIGHT_GRAY_STAINED_GLASS = createStrongStainedGlass(DyeColor.LIGHT_GRAY);
	public static final RegistryObject<Block> STRONGER_CYAN_STAINED_GLASS = createStrongStainedGlass(DyeColor.CYAN);
	public static final RegistryObject<Block> STRONGER_PURPLE_STAINED_GLASS = createStrongStainedGlass(DyeColor.PURPLE);
	public static final RegistryObject<Block> STRONGER_BLUE_STAINED_GLASS = createStrongStainedGlass(DyeColor.BLUE);
	public static final RegistryObject<Block> STRONGER_BROWN_STAINED_GLASS = createStrongStainedGlass(DyeColor.BROWN);
	public static final RegistryObject<Block> STRONGER_GREEN_STAINED_GLASS = createStrongStainedGlass(DyeColor.GREEN);
	public static final RegistryObject<Block> STRONGER_RED_STAINED_GLASS = createStrongStainedGlass(DyeColor.RED);
	public static final RegistryObject<Block> STRONGER_BLACK_STAINED_GLASS = createStrongStainedGlass(DyeColor.BLACK);

	public static RegistryObject<Block> createStrongGlass() {
		RegistryObject<Block> block = HELPER.createBlock("stronger_glass", () -> new GlassBlock(Properties.GLASS));
		BLOCKS.add(block);
		return block;
	}

	public static RegistryObject<Block> createStrongStainedGlass(DyeColor color) {
		RegistryObject<Block> block = HELPER.createBlock("stronger_" + color + "_stained_glass", () -> new StainedGlassBlock(color, Properties.GLASS));
		BLOCKS.add(block);
		return block;
	}
	
	public static class Properties {
		public static final Block.Properties GLASS = Block.Properties.copy(Blocks.GLASS).strength(1, 1200).requiresCorrectToolForDrops();
		
	}
	
}