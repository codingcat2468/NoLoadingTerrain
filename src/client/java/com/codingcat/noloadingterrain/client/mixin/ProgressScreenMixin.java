package com.codingcat.noloadingterrain.client.mixin;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ProgressScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(ProgressScreen.class)
public class ProgressScreenMixin {
    /**
     * @author codingcat2468
     * @reason Remove screen rendering entirely
     */
    @Overwrite
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {}
}
