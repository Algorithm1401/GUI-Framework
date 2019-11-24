package org.pixelgalaxy;

import lombok.Builder;
import lombok.Getter;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;

@Getter
public class GuiHolder<T> implements InventoryHolder {

    private T holder;

    @Builder
    public GuiHolder(T holder) throws IllegalArgumentException {
        this.holder = holder;
    }

    @Override
    public Inventory getInventory() {
        return null;
    }
}
