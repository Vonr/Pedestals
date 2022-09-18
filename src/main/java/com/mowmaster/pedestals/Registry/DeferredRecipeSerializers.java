package com.mowmaster.pedestals.Registry;

import com.mowmaster.pedestals.Recipes.BottlerRecipe;
import com.mowmaster.pedestals.Recipes.CobbleGenRecipe;
import com.mowmaster.pedestals.Recipes.FluidConverterRecipe;
import com.mowmaster.pedestals.Recipes.UnBottlerRecipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.mowmaster.pedestals.PedestalUtils.References.MODID;

public final class DeferredRecipeSerializers
{
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, MODID);

    public static final RegistryObject<RecipeSerializer<CobbleGenRecipe>> COBBLEGEN_SERIALIZER =
            SERIALIZERS.register("cobblegen", () -> CobbleGenRecipe.Serializer.INSTANCE);

    public static final RegistryObject<RecipeSerializer<BottlerRecipe>> BOTTLER_SERIALIZER =
            SERIALIZERS.register("bottler", () -> BottlerRecipe.Serializer.INSTANCE);

    public static final RegistryObject<RecipeSerializer<UnBottlerRecipe>> UNBOTTLER_SERIALIZER =
            SERIALIZERS.register("unbottler", () -> UnBottlerRecipe.Serializer.INSTANCE);

    public static final RegistryObject<RecipeSerializer<FluidConverterRecipe>> FLUIDCONVERTER_SERIALIZER =
            SERIALIZERS.register("fluidconverter", () -> FluidConverterRecipe.Serializer.INSTANCE);

    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
    }
}
