package me.shalev.customcrafttingg;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        ItemStack result1 = new ItemStack(Material.NETHERITE_SWORD, 1);

        ItemMeta meta1 = result1.getItemMeta();

        ((ItemMeta) meta1).setDisplayName(ChatColor.DARK_RED + "God Sword");

        result1.setItemMeta(meta1);
        result1.addEnchantment(Enchantment.DURABILITY, 3);
        result1.addEnchantment(Enchantment.MENDING, 1);
        result1.addEnchantment(Enchantment.DAMAGE_ALL, 5);
        result1.addEnchantment(Enchantment.DAMAGE_UNDEAD, 5);
        result1.addEnchantment(Enchantment.FIRE_ASPECT, 2);
        result1.addEnchantment(Enchantment.LOOT_BONUS_MOBS, 3);
        result1.addEnchantment(Enchantment.SWEEPING_EDGE, 3);

        NamespacedKey key1 = new NamespacedKey(this, "god_sword");

        ShapedRecipe recipe1 = new ShapedRecipe(key1, result1);

        recipe1.shape("DSD"," O "," O ");

        recipe1.setIngredient('S', Material.NETHERITE_SWORD);
        recipe1.setIngredient('D', Material.DIAMOND_BLOCK);
        recipe1.setIngredient('O', Material.OBSIDIAN);

        Bukkit.addRecipe(recipe1);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
