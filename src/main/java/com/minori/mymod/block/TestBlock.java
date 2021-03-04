package com.minori.mymod.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

import java.util.Objects;

public class TestBlock extends Block {
    private static Item blockItem = null;
    private static TestBlock instance = null;

    public TestBlock() {
        super(Block.Properties.create(Material.ROCK)
                .setLightLevel((light) -> 200)
                .sound(SoundType.WOOD));
        setRegistryName("mymod", "test_block");

        blockItem = new BlockItem(this, (new BlockItem.Properties()).group(ItemGroup.DECORATIONS)).setRegistryName(Objects.requireNonNull(this.getRegistryName()));
    }

    public static TestBlock getInstance() {
        if (instance == null)
            instance = new TestBlock();
        return instance;
    }

    public Item getTestBlockItem() {
        return blockItem;
    }
}
