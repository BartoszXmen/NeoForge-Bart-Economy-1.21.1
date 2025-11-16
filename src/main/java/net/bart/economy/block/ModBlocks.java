package net.bart.economy.block;

import net.bart.economy.EconomyMod;
import net.bart.economy.item.ModItems;
import net.minecraft.client.resources.model.Material;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(EconomyMod.MOD_ID);

    public static final DeferredBlock<Block> ZLOTY_BLOCK = registerBlock("zloty_block",
            () -> new Block(
                    BlockBehaviour.Properties.of()
                            .strength(1f)
                            .requiresCorrectToolForDrops()
                            .sound(SoundType.COPPER)));

    public static final DeferredBlock<Block> TWO_ZLOTY_BLOCK = registerBlock("two_zloty_block",
            () -> new Block(
                    BlockBehaviour.Properties.of()
                            .strength(1f)
                            .requiresCorrectToolForDrops()
                            .sound(SoundType.SCULK)));

    public static final DeferredBlock<Block> HALF_ZLOTY_PLACEABLE =
            BLOCKS.register("half_zloty_placeable",
                    () -> new Block(BlockBehaviour.Properties.of()
                            .noOcclusion()
                            .strength(0.2f)
                    ));

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
