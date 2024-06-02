//package com.fabricmc.testin.datagen;
//
//import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
//import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
//import net.minecraft.data.server.recipe.RecipeExporter;
//import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
//
//import static com.fabricmc.testin.item.ModItems.GREEN_TEA;
//
//public class TeaModRecipeProvider extends FabricRecipeProvider {
//    public TeaModRecipeProvider(FabricDataOutput output) {
//        super(output);
//    }
//
//    @Override
//    public void generate(RecipeExporter exporter) {
//        ShapelessRecipeJsonBuilder.create(RecipeCategory.TEA, DIRT).input(GREEN_TEA).criterion(FabricRecipeProvider.hasItem(DIRT),
//                FabricRecipeProvider.conditionsFromItem(DIRT)).criterion(FabricRecipeProvider.hasItem(GREEN_TEA),
//                FabricRecipeProvider.conditionsFromItem(GREEN_TEA)).offerTo(exporter);
//    }
//}