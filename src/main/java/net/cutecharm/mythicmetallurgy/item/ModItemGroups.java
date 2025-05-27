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
    public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(CreateMythicMetallurgy.MOD_ID, "crushed_metals"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.crushed_metals"))
                    .icon(() -> new ItemStack(ModItems.CRUSHED_RAW_ADAMANTITE)).entries((displayContext, entries) -> {
                        entries.add(ModItems.CRUSHED_RAW_ADAMANTITE);
                        entries.add(ModItems.CRUSHED_RAW_AQUARIUM);

                    }).build());

    public static void registerItemGroups() {
        CreateMythicMetallurgy.LOGGER.info("Registering item groups for" + CreateMythicMetallurgy.MOD_ID);
    }
}
