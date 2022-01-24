package org.xkmc.polaris.util.block;

import java.util.function.Supplier;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import org.xkmc.polaris.setup.ModItemGroup;
import org.xkmc.polaris.util.Registration;

public class ModBlocks {

    public static final RegistryObject<Block> AlloySmithingTable = register("alloy_smithing_table", () ->
            new Block(AbstractBlock.Properties.of(Material.STONE).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)));
    public static final RegistryObject<Block> ObsidianNetherFurnace = register("obsidian_nether_furnace", () ->
            new Block(AbstractBlock.Properties.of(Material.STONE).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)));
    public static void register(){

    };
    private static <T extends Block> RegistryObject<T> registerNoItem(String name, java.util.function.Supplier<T> block) {
        return Registration.BLOCKS.register(name, block);
    }

    protected static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block) {
        RegistryObject<T> registryObject = registerNoItem(name, block);
        Registration.ITEMS.register(name, () -> new BlockItem(registryObject.get(), new Item.Properties().tab(ModItemGroup.TAB_POLARIS_BLOCKS)));
        return registryObject;
    }

}
