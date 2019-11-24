package org.pixelgalaxy;

import org.bukkit.entity.Player;
import org.bukkit.inventory.InventoryHolder;

@FunctionalInterface
public interface ClickAction {
    void action(Player player, InventoryHolder inventoryHolder, int slot, GuiItem item);
}
