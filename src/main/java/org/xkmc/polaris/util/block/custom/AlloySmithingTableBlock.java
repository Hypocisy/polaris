package org.xkmc.polaris.util.block.custom;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.SmithingTableBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.inventory.container.SimpleNamedContainerProvider;
import net.minecraft.inventory.container.SmithingTableContainer;
import net.minecraft.stats.Stats;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.IWorldPosCallable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;


public class AlloySmithingTableBlock extends SmithingTableBlock {
    private static final ITextComponent CONTAINER_TITLE = new TranslationTextComponent("block.polaris.upgrade");

    public AlloySmithingTableBlock(AbstractBlock.Properties properties) {
        super(properties);
    }


   @Override
   public INamedContainerProvider getMenuProvider(BlockState blockState, World world, BlockPos blockPos) {
       return new SimpleNamedContainerProvider((menuConstructor, blockPoss, CONTAINER_TITLE) -> new SmithingTableContainer(menuConstructor, blockPoss, IWorldPosCallable.create(world, blockPos)), CONTAINER_TITLE);
   }

   @Override
   public ActionResultType use(BlockState blockState, World world, BlockPos blockPos, PlayerEntity playerEntity, Hand hand, BlockRayTraceResult blockRayTraceResult) {
       if (world.isClientSide) {
           return ActionResultType.SUCCESS;
       } else {
           playerEntity.openMenu(blockState.getMenuProvider(world, blockPos));
           playerEntity.awardStat(Stats.INTERACT_WITH_SMITHING_TABLE);
           return ActionResultType.CONSUME;
       }
}

}
