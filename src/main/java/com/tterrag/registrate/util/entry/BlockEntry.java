package com.tterrag.registrate.util.entry;

import com.tterrag.registrate.AbstractRegistrate;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraftforge.fml.RegistryObject;

public class BlockEntry<T extends Block> extends ItemProviderEntry<T> {

    public BlockEntry(AbstractRegistrate<?> owner, RegistryObject<T> delegate) {
        super(owner, delegate);
    }

    public BlockState getDefaultState() {
        return get().getDefaultState();
    }

    public boolean has(BlockState state) {
        return is(state.getBlock());
    }
}
