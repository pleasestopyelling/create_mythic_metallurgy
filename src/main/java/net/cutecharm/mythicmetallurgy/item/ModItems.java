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
    public static final Item CRUSHED_RAW_BANGLUM = registerItem("crushed_raw_banglum", new Item(new FabricItemSettings()));
    public static final Item CRUSHED_RAW_CARMOT = registerItem("crushed_raw_carmot", new Item(new FabricItemSettings()));
    public static final Item CRUSHED_RAW_KYBER = registerItem("crushed_raw_kyber", new Item(new FabricItemSettings()));
    public static final Item CRUSHED_RAW_MANGANESE = registerItem("crushed_raw_manganese", new Item(new FabricItemSettings()));
    public static final Item CRUSHED_RAW_MIDAS_GOLD = registerItem("crushed_raw_midas_gold", new Item(new FabricItemSettings()));
    public static final Item CRUSHED_RAW_MYTHRIL = registerItem("crushed_raw_mythril", new Item(new FabricItemSettings()));
    public static final Item CRUSHED_RAW_ORICHALCUM = registerItem("crushed_raw_orichalcum", new Item(new FabricItemSettings()));
    public static final Item CRUSHED_RAW_PALLADIUM = registerItem("crushed_raw_palladium", new Item(new FabricItemSettings()));
    public static final Item CRUSHED_RAW_PROMETHEUM = registerItem("crushed_raw_prometheum", new Item(new FabricItemSettings()));
    public static final Item CRUSHED_RAW_QUADRILLUM = registerItem("crushed_raw_quadrillum", new Item(new FabricItemSettings()));
    public static final Item CRUSHED_RAW_RUNITE = registerItem("crushed_raw_runite", new Item(new FabricItemSettings()));
    public static final Item CRUSHED_RAW_STORMYX = registerItem("crushed_raw_stormyx", new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(CreateMythicMetallurgy.MOD_ID, name), item);
    }

    public static void registerModItems() {
        CreateMythicMetallurgy.LOGGER.info("Registering Mod Items for " + CreateMythicMetallurgy.MOD_ID);


    }
}
