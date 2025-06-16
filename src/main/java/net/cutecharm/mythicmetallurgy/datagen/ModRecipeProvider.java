package net.cutecharm.mythicmetallurgy.datagen;

import net.cutecharm.mythicmetallurgy.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import nourl.mythicmetals.item.MythicItems;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {

    private static final List<ItemConvertible> ADAMANTITE = List.of(ModItems.CRUSHED_RAW_ADAMANTITE);
    private static final List<ItemConvertible> AQUARIUM = List.of(ModItems.CRUSHED_RAW_AQUARIUM);
    private static final List<ItemConvertible> BANGLUM = List.of(ModItems.CRUSHED_RAW_BANGLUM);
    private static final List<ItemConvertible> CARMOT = List.of(ModItems.CRUSHED_RAW_CARMOT);
    private static final List<ItemConvertible> KYBER = List.of(ModItems.CRUSHED_RAW_KYBER);
    private static final List<ItemConvertible> MANGANESE = List.of(ModItems.CRUSHED_RAW_MANGANESE);
    private static final List<ItemConvertible> MIDAS_GOLD = List.of(ModItems.CRUSHED_RAW_MIDAS_GOLD);
    private static final List<ItemConvertible> MYTHRIL = List.of(ModItems.CRUSHED_RAW_MYTHRIL);
    private static final List<ItemConvertible> ORICHALCUM = List.of(ModItems.CRUSHED_RAW_ORICHALCUM);
    private static final List<ItemConvertible> PALLADIUM = List.of(ModItems.CRUSHED_RAW_PALLADIUM);
    private static final List<ItemConvertible> PROMETHEUM = List.of(ModItems.CRUSHED_RAW_PROMETHEUM);
    private static final List<ItemConvertible> QUADRILLUM = List.of(ModItems.CRUSHED_RAW_QUADRILLUM);
    private static final List<ItemConvertible> RUNITE = List.of(ModItems.CRUSHED_RAW_RUNITE);
    private static final List<ItemConvertible> STORMYX = List.of(ModItems.CRUSHED_RAW_STORMYX);

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }



    @Override
    public void generate(Consumer<RecipeJsonProvider> consumer) {

        RecipeProvider.offerSmelting(
                consumer,
                ADAMANTITE,
                RecipeCategory.MISC,
                MythicItems.ADAMANTITE.getIngot(),
                0.1f,
                200,
                "crushed_smelting");
        RecipeProvider.offerSmelting(
                consumer,
                AQUARIUM,
                RecipeCategory.MISC,
                MythicItems.AQUARIUM.getIngot(),
                0.1f,
                200,
                "crushed_smelting");
        RecipeProvider.offerSmelting(
                consumer,
                BANGLUM,
                RecipeCategory.MISC,
                MythicItems.BANGLUM.getIngot(),
                0.1f,
                200,
                "crushed_smelting");
        RecipeProvider.offerSmelting(
                consumer,
                CARMOT,
                RecipeCategory.MISC,
                MythicItems.CARMOT.getIngot(),
                0.1f,
                200,
                "crushed_smelting");
        RecipeProvider.offerSmelting(
                consumer,
                KYBER,
                RecipeCategory.MISC,
                MythicItems.KYBER.getIngot(),
                0.1f,
                200,
                "crushed_smelting");
        RecipeProvider.offerSmelting(
                consumer,
                MANGANESE,
                RecipeCategory.MISC,
                MythicItems.MANGANESE.getIngot(),
                0.1f,
                200,
                "crushed_smelting");
        RecipeProvider.offerSmelting(
                consumer,
                MIDAS_GOLD,
                RecipeCategory.MISC,
                MythicItems.MIDAS_GOLD.getIngot(),
                0.1f,
                200,
                "crushed_smelting");
        RecipeProvider.offerSmelting(
                consumer,
                MYTHRIL,
                RecipeCategory.MISC,
                MythicItems.MYTHRIL.getIngot(),
                0.1f,
                200,
                "crushed_smelting");
        RecipeProvider.offerSmelting(
                consumer,
                ORICHALCUM,
                RecipeCategory.MISC,
                MythicItems.ORICHALCUM.getIngot(),
                0.1f,
                200,
                "crushed_smelting");
        RecipeProvider.offerSmelting(
                consumer,
                PALLADIUM,
                RecipeCategory.MISC,
                MythicItems.PALLADIUM.getIngot(),
                0.1f,
                200,
                "crushed_smelting");
        RecipeProvider.offerSmelting(
                consumer,
                PROMETHEUM,
                RecipeCategory.MISC,
                MythicItems.PROMETHEUM.getIngot(),
                0.1f,
                200,
                "crushed_smelting");
        RecipeProvider.offerSmelting(
                consumer,
                QUADRILLUM,
                RecipeCategory.MISC,
                MythicItems.QUADRILLUM.getIngot(),
                0.1f,
                200,
                "crushed_smelting");
        RecipeProvider.offerSmelting(
                consumer,
                RUNITE,
                RecipeCategory.MISC,
                MythicItems.RUNITE.getIngot(),
                0.1f,
                200,
                "crushed_smelting");
        RecipeProvider.offerSmelting(
                consumer,
                STORMYX,
                RecipeCategory.MISC,
                MythicItems.STORMYX.getIngot(),
                0.1f,
                200,
                "crushed_smelting");
        RecipeProvider.offerBlasting(
                consumer,
                ADAMANTITE,
                RecipeCategory.MISC,
                MythicItems.ADAMANTITE.getIngot(),
                0.1f,
                100,
                "crushed_blasting");
        RecipeProvider.offerBlasting(
                consumer,
                AQUARIUM,
                RecipeCategory.MISC,
                MythicItems.AQUARIUM.getIngot(),
                0.1f,
                100,
                "crushed_blasting");
        RecipeProvider.offerBlasting(
                consumer,
                BANGLUM,
                RecipeCategory.MISC,
                MythicItems.BANGLUM.getIngot(),
                0.1f,
                100,
                "crushed_blasting");
        RecipeProvider.offerBlasting(
                consumer,
                CARMOT,
                RecipeCategory.MISC,
                MythicItems.CARMOT.getIngot(),
                0.1f,
                100,
                "crushed_blasting");
        RecipeProvider.offerBlasting(
                consumer,
                KYBER,
                RecipeCategory.MISC,
                MythicItems.KYBER.getIngot(),
                0.1f,
                100,
                "crushed_blasting");
        RecipeProvider.offerBlasting(
                consumer,
                MANGANESE,
                RecipeCategory.MISC,
                MythicItems.MANGANESE.getIngot(),
                0.1f,
                100,
                "crushed_blasting");
        RecipeProvider.offerBlasting(
                consumer,
                MIDAS_GOLD,
                RecipeCategory.MISC,
                MythicItems.MIDAS_GOLD.getIngot(),
                0.1f,
                100,
                "crushed_blasting");
        RecipeProvider.offerBlasting(
                consumer,
                MYTHRIL,
                RecipeCategory.MISC,
                MythicItems.MYTHRIL.getIngot(),
                0.1f,
                100,
                "crushed_blasting");
        RecipeProvider.offerBlasting(
                consumer,
                ORICHALCUM,
                RecipeCategory.MISC,
                MythicItems.ORICHALCUM.getIngot(),
                0.1f,
                100,
                "crushed_blasting");
        RecipeProvider.offerBlasting(
                consumer,
                PALLADIUM,
                RecipeCategory.MISC,
                MythicItems.PALLADIUM.getIngot(),
                0.1f,
                100,
                "crushed_blasting");
        RecipeProvider.offerBlasting(
                consumer,
                PROMETHEUM,
                RecipeCategory.MISC,
                MythicItems.PROMETHEUM.getIngot(),
                0.1f,
                100,
                "crushed_blasting");
        RecipeProvider.offerBlasting(
                consumer,
                QUADRILLUM,
                RecipeCategory.MISC,
                MythicItems.QUADRILLUM.getIngot(),
                0.1f,
                100,
                "crushed_blasting");
        RecipeProvider.offerBlasting(
                consumer,
                RUNITE,
                RecipeCategory.MISC,
                MythicItems.RUNITE.getIngot(),
                0.1f,
                100,
                "crushed_blasting");
        RecipeProvider.offerBlasting(
                consumer,
                STORMYX,
                RecipeCategory.MISC,
                MythicItems.STORMYX.getIngot(),
                0.1f,
                100,
                "crushed_blasting");

    }
}
