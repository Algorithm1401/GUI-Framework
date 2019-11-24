package org.pixelgalaxy;

import org.bukkit.Material;

import java.util.Arrays;

public class GuiTest {

    public void testGuiItems(){
        GuiItem guiItem = GuiItem.create()
                .material(Material.BOOK)
                .enchanted(true)
                .displayName("SUPER SPECIAL BOOK")
                .lore(Arrays.asList("Don't read it, seriously", "it's too special for u"))
                .build();


    }

}
