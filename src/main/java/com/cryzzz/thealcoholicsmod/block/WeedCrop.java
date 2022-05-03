package com.cryzzz.thealcoholicsmod.block;
import com.cryzzz.thealcoholicsmod.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;


public class WeedCrop extends CropBlock {
    public WeedCrop(Properties p_52247_) {
        super(p_52247_);
    }


    @Override
    protected ItemLike getBaseSeedId(){
        return ModItems.WEED_LEAF.get();
    }

    @Override
    protected boolean mayPlaceOn(BlockState p_52302_, BlockGetter p_52303_, BlockPos p_52304_) {
        return p_52302_.is(Blocks.GRASS_BLOCK) || p_52302_.is(Blocks.DIRT);
    }
}




