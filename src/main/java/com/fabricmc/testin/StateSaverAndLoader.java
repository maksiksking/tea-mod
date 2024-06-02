package com.fabricmc.testin;

import com.fabricmc.testin.event.SleepAfterMicrocosmTeaDrunkHandler;
import com.fabricmc.testin.item.custom.MicrocosmTeaItem;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.world.PersistentState;

public class StateSaverAndLoader extends PersistentState {
    boolean ifSleepTeleports = MicrocosmTeaItem.ifSleepTeleports;
    boolean ifTickForSleep = SleepAfterMicrocosmTeaDrunkHandler.ifTickForSleep;

    @Override
    public NbtCompound writeNbt(NbtCompound nbt) {
        nbt.putBoolean("ifSleepTeleports", ifSleepTeleports);
        nbt.putBoolean("ifTickForSleep", ifTickForSleep);
        return nbt;
    }

    public static StateSaverAndLoader createFromNbt(NbtCompound tag, RegistryWrapper.WrapperLookup registryLookup) {
        StateSaverAndLoader state = new StateSaverAndLoader();
        state.ifSleepTeleports = tag.getBoolean("ifSleepTeleports");
        return state;
    }

}
