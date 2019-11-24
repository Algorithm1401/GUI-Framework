package org.pixelgalaxy;

import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;

public class Gui<T> {

    private GuiHolder customHolder;
    private Inventory gui;

    public Gui(int rows, String title) {
        if(rows > 6 || rows < 0) {
            throw new IllegalArgumentException("Rows have to be between 0 and 6 (inclusive) for InventoryType chest");
        }
        this.gui = Bukkit.createInventory(customHolder, rows * 9, title);
    }

}
