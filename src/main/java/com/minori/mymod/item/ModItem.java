package com.minori.mymod.item;

import com.minori.mymod.block.TestBlock;
import net.minecraft.item.*;
import net.minecraftforge.event.RegistryEvent;


public class ModItem {

    public static final Item testBlockItem = TestBlock.getInstance().getTestBlockItem();

    public static final Item testItem = new Item(new Item.Properties().food((new Food.Builder()).fastToEat().setAlwaysEdible().hunger(12).build()).group(ItemGroup.COMBAT).defaultMaxDamage(300).maxDamage(300).setNoRepair().rarity(Rarity.EPIC)).setRegistryName("mymod", "test_item");

    public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
        // register a new block here
        event.getRegistry().register(testBlockItem);
        event.getRegistry().register(testItem);
    }
}
