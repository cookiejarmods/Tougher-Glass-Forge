package com.coderslab.tougherglass.core.registry;

import com.coderslab.tougherglass.common.blocks.StrongerStainedGlassBlock;
import com.coderslab.tougherglass.core.TougherGlass;
import com.teamabnormals.blueprint.core.util.registry.BlockSubRegistryHelper;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.block.GlassBlock;
import net.minecraft.world.level.block.StainedGlassBlock;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fmllegacy.RegistryObject;

@Mod.EventBusSubscriber(modid = TougherGlass.MOD_ID, bus = Bus.MOD)
public class TABlocks {
	
	public static final BlockSubRegistryHelper HELPER = TougherGlass.REGISTRY_HELPER.getBlockSubHelper();

	public static final RegistryObject<Block> STRONGER_GLASS = HELPER.createBlock("stronger_glass", () -> new GlassBlock(Properties.GLASS), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Block> STRONGER_WHITE_STAINED_GLASS = HELPER.createBlock("stronger_white_stained_glass", () -> new StainedGlassBlock(DyeColor.WHITE, Properties.GLASS), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Block> STRONGER_ORANGE_STAINED_GLASS = HELPER.createBlock("stronger_orange_stained_glass", () -> new StainedGlassBlock(DyeColor.ORANGE, Properties.GLASS), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Block> STRONGER_MAGENTA_STAINED_GLASS = HELPER.createBlock("stronger_magenta_stained_glass", () -> new StainedGlassBlock(DyeColor.MAGENTA, Properties.GLASS), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Block> STRONGER_LIGHT_BLUE_STAINED_GLASS = HELPER.createBlock("stronger_light_blue_stained_glass", () -> new StainedGlassBlock(DyeColor.LIGHT_BLUE, Properties.GLASS), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Block> STRONGER_YELLOW_STAINED_GLASS = HELPER.createBlock("stronger_yellow_stained_glass", () -> new StainedGlassBlock(DyeColor.YELLOW, Properties.GLASS), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Block> STRONGER_LIME_STAINED_GLASS = HELPER.createBlock("stronger_lime_stained_glass", () -> new StainedGlassBlock(DyeColor.LIME, Properties.GLASS), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Block> STRONGER_PINK_STAINED_GLASS = HELPER.createBlock("stronger_pink_stained_glass", () -> new StainedGlassBlock(DyeColor.PINK, Properties.GLASS), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Block> STRONGER_GRAY_STAINED_GLASS = HELPER.createBlock("stronger_gray_stained_glass", () -> new StainedGlassBlock(DyeColor.GRAY, Properties.GLASS), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Block> STRONGER_LIGHT_GRAY_STAINED_GLASS = HELPER.createBlock("stronger_light_gray_stained_glass", () -> new StainedGlassBlock(DyeColor.LIGHT_GRAY, Properties.GLASS), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Block> STRONGER_CYAN_STAINED_GLASS = HELPER.createBlock("stronger_cyan_stained_glass", () -> new StainedGlassBlock(DyeColor.CYAN, Properties.GLASS), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Block> STRONGER_PURPLE_STAINED_GLASS = HELPER.createBlock("stronger_purple_stained_glass", () -> new StainedGlassBlock(DyeColor.PURPLE, Properties.GLASS), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Block> STRONGER_BLUE_STAINED_GLASS = HELPER.createBlock("stronger_blue_stained_glass", () -> new StainedGlassBlock(DyeColor.BLUE, Properties.GLASS), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Block> STRONGER_BROWN_STAINED_GLASS = HELPER.createBlock("stronger_brown_stained_glass", () -> new StainedGlassBlock(DyeColor.BROWN, Properties.GLASS), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Block> STRONGER_GREEN_STAINED_GLASS = HELPER.createBlock("stronger_green_stained_glass", () -> new StainedGlassBlock(DyeColor.GREEN, Properties.GLASS), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Block> STRONGER_RED_STAINED_GLASS = HELPER.createBlock("stronger_red_stained_glass", () -> new StainedGlassBlock(DyeColor.RED, Properties.GLASS), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Block> STRONGER_BLACK_STAINED_GLASS = HELPER.createBlock("stronger_black_stained_glass", () -> new StainedGlassBlock(DyeColor.BLACK, Properties.GLASS), CreativeModeTab.TAB_DECORATIONS);
	
	public static class Properties {
		
		public static final Block.Properties GLASS = Block.Properties.copy(Blocks.GLASS).strength(1, 1200).requiresCorrectToolForDrops();
		
	}
	
}