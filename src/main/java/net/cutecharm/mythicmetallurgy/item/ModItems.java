package net.cutecharm.mythicmetallurgy.item;

import net.cutecharm.mythicmetallurgy.CreateMythicMetallurgy;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item CRUSHED_RAW_ADAMANTITE = registerItem("crushed_raw_adamantite", new Item(new FabricItemSettings()));
    public static final Item CRUSHED_RAW_AQUARIUM = registerItem("crushed_raw_aquarium", new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(CreateMythicMetallurgy.MOD_ID, name), item);
    }

    public static void registerModItems() {
        CreateMythicMetallurgy.LOGGER.info("Registering Mod Items for " + CreateMythicMetallurgy.MOD_ID);


    }
}
