package org.xkmc.polaris.setup;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import org.xkmc.polaris.util.item.ModItems;

public class ModItemGroup {
    public static final ItemGroup TAB_POLARIS_MISCELLANEOUS;

    static {
        TAB_POLARIS_MISCELLANEOUS = new ItemGroup("tab_polaris_miscellaneous") {
            @Override
            public ItemStack makeIcon() {
                return new ItemStack(ModItems.HeartOfOre.get());
            }
        };
    }

    public static final ItemGroup TAB_POLARIS_BLOCKS;

    static {
        TAB_POLARIS_BLOCKS = new ItemGroup("tab_polaris_blocks") {
            @Override
            public ItemStack makeIcon() {
                return new ItemStack(ModItems.LifeOfSeeds.get());
            }
        };
    }

    public static final ItemGroup TAB_POLARIS_ARMORS;

    static {
        TAB_POLARIS_ARMORS = new ItemGroup("tab_polaris_armors") {
            @Override
            public ItemStack makeIcon() {
                return new ItemStack(Items.DIAMOND_HELMET.getItem());
            }
        };
    }
}
