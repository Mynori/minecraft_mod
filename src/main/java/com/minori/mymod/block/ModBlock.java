package com.minori.mymod.block;

import net.minecraft.block.Block;
import net.minecraftforge.event.RegistryEvent;

public class ModBlock {
    public static final Block testBlock = TestBlock.getInstance();

    public static void onBlocksRegistry(final RegistryEvent.Register<Block> event) {
        // register a new block here
        event.getRegistry().registerAll(testBlock);
    }
}
