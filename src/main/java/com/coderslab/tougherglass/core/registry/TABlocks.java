package com.coderslab.tougherglass.core.registry;

import com.coderslab.tougherglass.common.blocks.StrongerGlassBlock;
import com.coderslab.tougherglass.common.blocks.StrongerStainedGlassBlock;
import com.coderslab.tougherglass.core.TougherGlass;

import co.eltrut.differentiate.core.registrator.BlockHelper;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.DyeColor;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = TougherGlass.MOD_ID, bus = Bus.MOD)
public class TABlocks {
	
	public static final BlockHelper HELPER = TougherGlass.REGISTRATOR.getHelper(ForgeRegistries.BLOCKS);
	
	public static final RegistryObject<Block> STRONGER_GLASS = HELPER.createSimpleBlock("stronger_glass", () -> new StrongerGlassBlock(Properties.GLASS), ItemGroup.TAB_DECORATIONS);
	public static final RegistryObject<Block> STRONGER_WHITE_STAINED_GLASS = HELPER.createSimpleBlock("stronger_white_stained_glass", () -> new StrongerStainedGlassBlock(DyeColor.WHITE, Properties.GLASS), ItemGroup.TAB_DECORATIONS); 
	public static final RegistryObject<Block> STRONGER_ORANGE_STAINED_GLASS = HELPER.createSimpleBlock("stronger_orange_stained_glass", () -> new StrongerStainedGlassBlock(DyeColor.ORANGE, Properties.GLASS), ItemGroup.TAB_DECORATIONS); 
	public static final RegistryObject<Block> STRONGER_MAGENTA_STAINED_GLASS = HELPER.createSimpleBlock("stronger_magenta_stained_glass", () -> new StrongerStainedGlassBlock(DyeColor.MAGENTA, Properties.GLASS), ItemGroup.TAB_DECORATIONS); 
	public static final RegistryObject<Block> STRONGER_LIGHT_BLUE_STAINED_GLASS = HELPER.createSimpleBlock("stronger_light_blue_stained_glass", () -> new StrongerStainedGlassBlock(DyeColor.LIGHT_BLUE, Properties.GLASS), ItemGroup.TAB_DECORATIONS); 
	public static final RegistryObject<Block> STRONGER_YELLOW_STAINED_GLASS = HELPER.createSimpleBlock("stronger_yellow_stained_glass", () -> new StrongerStainedGlassBlock(DyeColor.YELLOW, Properties.GLASS), ItemGroup.TAB_DECORATIONS); 
	public static final RegistryObject<Block> STRONGER_LIME_STAINED_GLASS = HELPER.createSimpleBlock("stronger_lime_stained_glass", () -> new StrongerStainedGlassBlock(DyeColor.LIME, Properties.GLASS), ItemGroup.TAB_DECORATIONS); 
	public static final RegistryObject<Block> STRONGER_PINK_STAINED_GLASS = HELPER.createSimpleBlock("stronger_pink_stained_glass", () -> new StrongerStainedGlassBlock(DyeColor.PINK, Properties.GLASS), ItemGroup.TAB_DECORATIONS); 
	public static final RegistryObject<Block> STRONGER_GRAY_STAINED_GLASS = HELPER.createSimpleBlock("stronger_gray_stained_glass", () -> new StrongerStainedGlassBlock(DyeColor.GRAY, Properties.GLASS), ItemGroup.TAB_DECORATIONS); 
	public static final RegistryObject<Block> STRONGER_LIGHT_GRAY_STAINED_GLASS = HELPER.createSimpleBlock("stronger_light_gray_stained_glass", () -> new StrongerStainedGlassBlock(DyeColor.LIGHT_GRAY, Properties.GLASS), ItemGroup.TAB_DECORATIONS); 
	public static final RegistryObject<Block> STRONGER_CYAN_STAINED_GLASS = HELPER.createSimpleBlock("stronger_cyan_stained_glass", () -> new StrongerStainedGlassBlock(DyeColor.CYAN, Properties.GLASS), ItemGroup.TAB_DECORATIONS); 
	public static final RegistryObject<Block> STRONGER_PURPLE_STAINED_GLASS = HELPER.createSimpleBlock("stronger_purple_stained_glass", () -> new StrongerStainedGlassBlock(DyeColor.PURPLE, Properties.GLASS), ItemGroup.TAB_DECORATIONS); 
	public static final RegistryObject<Block> STRONGER_BLUE_STAINED_GLASS = HELPER.createSimpleBlock("stronger_blue_stained_glass", () -> new StrongerStainedGlassBlock(DyeColor.BLUE, Properties.GLASS), ItemGroup.TAB_DECORATIONS); 
	public static final RegistryObject<Block> STRONGER_BROWN_STAINED_GLASS = HELPER.createSimpleBlock("stronger_brown_stained_glass", () -> new StrongerStainedGlassBlock(DyeColor.BROWN, Properties.GLASS), ItemGroup.TAB_DECORATIONS); 
	public static final RegistryObject<Block> STRONGER_GREEN_STAINED_GLASS = HELPER.createSimpleBlock("stronger_green_stained_glass", () -> new StrongerStainedGlassBlock(DyeColor.GREEN, Properties.GLASS), ItemGroup.TAB_DECORATIONS); 
	public static final RegistryObject<Block> STRONGER_RED_STAINED_GLASS = HELPER.createSimpleBlock("stronger_red_stained_glass", () -> new StrongerStainedGlassBlock(DyeColor.RED, Properties.GLASS), ItemGroup.TAB_DECORATIONS); 
	public static final RegistryObject<Block> STRONGER_BLACK_STAINED_GLASS = HELPER.createSimpleBlock("stronger_black_stained_glass", () -> new StrongerStainedGlassBlock(DyeColor.BLACK, Properties.GLASS), ItemGroup.TAB_DECORATIONS); 
	
	public static class Properties {
		
		public static final Block.Properties GLASS = Block.Properties.copy(Blocks.GLASS).strength(1, 1200).requiresCorrectToolForDrops().harvestTool(ToolType.PICKAXE).harvestLevel(3);
		
	}
	
}