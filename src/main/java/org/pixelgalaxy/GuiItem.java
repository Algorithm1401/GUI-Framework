package org.pixelgalaxy;

import lombok.Builder;
import lombok.NonNull;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.function.Consumer;

public class GuiItem extends ItemStack implements ClickAction {

    private HashMap<GuiClickType, List<Consumer<ClickAction>>> clickActionsForType = new HashMap<>();

    @Builder(builderMethodName = "create")
    public GuiItem(@NonNull Material material, int amount, int damage, int data, @NonNull String displayName, List<String> lore, boolean enchanted, Consumer<GuiItem> clickAction, ItemFlag... flagsToAdd) {
        super(material, amount == 0 ? 1 : amount, (byte) damage, (byte) data);
        ItemMeta newMeta = super.getItemMeta();
        if (newMeta != null) {
            newMeta.setDisplayName(displayName);
            if (lore != null) {
                newMeta.setLore(lore);
            }
            if(enchanted){
                newMeta.addEnchant(Enchantment.DURABILITY, 0, false);
                newMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
            }
            if (flagsToAdd != null) {
                newMeta.addItemFlags(flagsToAdd);
            }
            super.setItemMeta(newMeta);

            if(clickAction != null) {
                clickActionsForType.put(GuiClickType.LEFT, Arrays.asList(clickAction));
            }
        }
    }

    @Override
    public void action(Player player, InventoryHolder inventoryHolder, int slot, GuiItem item) {

    }

    public void addClickAction(Consumer<GuiItem> action) {
        this.itemActions.add(action);
    }

}
