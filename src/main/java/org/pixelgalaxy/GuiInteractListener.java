package org.pixelgalaxy;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryAction;
import org.bukkit.event.inventory.InventoryClickEvent;

public class GuiInteractListener implements Listener {

    @EventHandler
    public void onGuiClick(InventoryClickEvent e){
        if(e.getView().getTopInventory().getHolder() instanceof GuiHolder){
            e.setCancelled(true);

            GuiHolder guiHolder = (GuiHolder) e.getView().getTopInventory().getHolder();

            switch(e.getAction()) {
                case PICKUP_ALL:


                    break;

                case PICKUP_HALF:

                    break;
            }

        }
    }

}
