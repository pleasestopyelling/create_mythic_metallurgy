package net.cutecharm.mythicmetallurgy.item;

import net.cutecharm.mythicmetallurgy.CreateMythicMetallurgy;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup CRUSHED_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(CreateMythicMetallurgy.MOD_ID, "mythic_metallurgy"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.mythic_metallurgy"))
                    .icon(() -> new ItemStack(ModItems.CRUSHED_RAW_ADAMANTITE)).entries((displayContext, entries) -> {
                        entries.add(ModItems.CRUSHED_RAW_ADAMANTITE);
                        entries.add(ModItems.CRUSHED_RAW_AQUARIUM);
                        entries.add(ModItems.CRUSHED_RAW_BANGLUM);
                        entries.add(ModItems.CRUSHED_RAW_CARMOT);
                        entries.add(ModItems.CRUSHED_RAW_KYBER);
                        entries.add(ModItems.CRUSHED_RAW_MANGANESE);
                        entries.add(ModItems.CRUSHED_RAW_MIDAS_GOLD);
                        entries.add(ModItems.CRUSHED_RAW_MYTHRIL);
                        entries.add(ModItems.CRUSHED_RAW_ORICHALCUM);
                        entries.add(ModItems.CRUSHED_RAW_PALLADIUM);
                        entries.add(ModItems.CRUSHED_RAW_PROMETHEUM);
                        entries.add(ModItems.CRUSHED_RAW_QUADRILLUM);
                        entries.add(ModItems.CRUSHED_RAW_RUNITE);
                        entries.add(ModItems.CRUSHED_RAW_STORMYX);

                    }).build());

    public static void registerItemGroups() {
        CreateMythicMetallurgy.LOGGER.info("Registering item groups for" + CreateMythicMetallurgy.MOD_ID);
    }
}
