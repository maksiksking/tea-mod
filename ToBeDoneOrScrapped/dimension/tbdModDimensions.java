package com.fabricmc.testin.world.dimension;

import com.fabricmc.testin.Main;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionOptions;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.dimension.DimensionTypes;

import java.util.OptionalLong;

public class tbdModDimensions {
    public static final RegistryKey<DimensionOptions> MICROCOSM_KEY = RegistryKey.of(RegistryKeys.DIMENSION,
            new Identifier(Main.MOD_ID, "microcosm"));
    public static final RegistryKey<World> MICROCOSM_LEVEL_KEY = RegistryKey.of(RegistryKeys.WORLD,
            new Identifier(Main.MOD_ID, "microcosm"));
    public static final RegistryKey<DimensionType> MICROCOSM_DIM_TYPE = RegistryKey.of(RegistryKeys.DIMENSION_TYPE,
            new Identifier(Main.MOD_ID, "microcosm_type"));



    public static void bootstrapType(Registerable<DimensionType> context) {
        context.register(MICROCOSM_DIM_TYPE, new DimensionType(
                OptionalLong.of(12000), // fixedTime
                false, // hasSkylight
                false, // hasCeiling
                false, // ultraWarm
                true, // natural
                1.0, // coordinateScale
                false, // bedWorks
                false, // respawnAnchorWorks
                0, // minY
                256, // height
                256, // logicalHeight
                BlockTags.INFINIBURN_OVERWORLD, // infiniburn
                DimensionTypes.OVERWORLD_ID, // effectsLocation
                1.0f, // ambientLight
                new DimensionType.MonsterSettings(false, false, UniformIntProvider.create(0, 0), 0)));
    }
}
