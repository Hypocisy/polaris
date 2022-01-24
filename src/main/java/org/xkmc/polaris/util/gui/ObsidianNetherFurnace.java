package org.xkmc.polaris.util.gui;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.TextFieldWidget;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import org.xkmc.polaris.Polaris;

public class ObsidianNetherFurnace extends Screen {
    TextFieldWidget textFieldWidget;
    ResourceLocation OBSIDIAN_FIRST_GUI_TEXTURE = new ResourceLocation(Polaris.MOD_ID, "textures/gui/first_gui.png");
    protected ObsidianNetherFurnace(ITextComponent titleIn) {
        super(titleIn);
    }
}
