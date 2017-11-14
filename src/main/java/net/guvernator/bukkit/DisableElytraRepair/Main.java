package net.guvernator.bukkit.DisableElytraRepair;

import org.bukkit.event.EventHandler;
import org.bukkit.event.inventory.PrepareItemCraftEvent;
import org.bukkit.event.Listener;
import org.bukkit.inventory.CraftingInventory;
import org.bukkit.Material;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {
    @Override
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onPlayerCraft(PrepareItemCraftEvent event) {
        if (event.isRepair()) {
            CraftingInventory inventory = event.getInventory();
            if (inventory.getResult().getType() == Material.ELYTRA) {
                inventory.setResult(null);
            }
        }
    }
}
