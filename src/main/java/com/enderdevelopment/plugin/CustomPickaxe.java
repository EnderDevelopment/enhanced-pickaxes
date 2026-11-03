package com.enderdevelopment.plugin;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;
import org.bukkit.plugin.java.JavaPlugin;

public class CustomPickaxe {
    private final JavaPlugin plugin;

    public CustomPickaxe(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    public void registerRecipes() {
        registerCopperPickaxe();
        registerIronPickaxe();
        registerDiamondPickaxe();
        registerNetheritePickaxe();
    }

    private void registerCopperPickaxe() {
        ItemStack pickaxe = new ItemStack(Material.STONE_PICKAXE);
        ItemMeta meta = pickaxe.getItemMeta();
        if (meta != null) {
            meta.setDisplayName("Copper Pickaxe");
            PersistentDataContainer container = meta.getPersistentDataContainer();
            container.set(new NamespacedKey(plugin, "custom_pickaxe"), PersistentDataType.STRING, "copper");
            pickaxe.setItemMeta(meta);
        }

        NamespacedKey key = new NamespacedKey(plugin, "copper_pickaxe");
        ShapedRecipe recipe = new ShapedRecipe(key, pickaxe);
        recipe.shape("CCC", " S ", " S ");
        recipe.setIngredient('C', Material.COPPER_INGOT);
        recipe.setIngredient('S', Material.STICK);
        plugin.getServer().addRecipe(recipe);
    }

    private void registerIronPickaxe() {
        ItemStack pickaxe = new ItemStack(Material.IRON_PICKAXE);
        ItemMeta meta = pickaxe.getItemMeta();
        if (meta != null) {
            meta.setDisplayName("Iron Pickaxe");
            PersistentDataContainer container = meta.getPersistentDataContainer();
            container.set(new NamespacedKey(plugin, "custom_pickaxe"), PersistentDataType.STRING, "iron");
            pickaxe.setItemMeta(meta);
        }

        NamespacedKey key = new NamespacedKey(plugin, "iron_pickaxe");
        ShapedRecipe recipe = new ShapedRecipe(key, pickaxe);
        recipe.shape("III", " S ", " S ");
        recipe.setIngredient('I', Material.IRON_INGOT);
        recipe.setIngredient('S', Material.STICK);
        plugin.getServer().addRecipe(recipe);
    }

    private void registerDiamondPickaxe() {
        ItemStack pickaxe = new ItemStack(Material.DIAMOND_PICKAXE);
        ItemMeta meta = pickaxe.getItemMeta();
        if (meta != null) {
            meta.setDisplayName("Diamond Pickaxe");
            PersistentDataContainer container = meta.getPersistentDataContainer();
            container.set(new NamespacedKey(plugin, "custom_pickaxe"), PersistentDataType.STRING, "diamond");
            pickaxe.setItemMeta(meta);
        }

        NamespacedKey key = new NamespacedKey(plugin, "diamond_pickaxe");
        ShapedRecipe recipe = new ShapedRecipe(key, pickaxe);
        recipe.shape("DDD", " S ", " S ");
        recipe.setIngredient('D', Material.DIAMOND);
        recipe.setIngredient('S', Material.STICK);
        plugin.getServer().addRecipe(recipe);
    }

    private void registerNetheritePickaxe() {
        ItemStack pickaxe = new ItemStack(Material.NETHERITE_PICKAXE);
        ItemMeta meta = pickaxe.getItemMeta();
        if (meta != null) {
            meta.setDisplayName("Netherite Pickaxe");
            PersistentDataContainer container = meta.getPersistentDataContainer();
            container.set(new NamespacedKey(plugin, "custom_pickaxe"), PersistentDataType.STRING, "netherite");
            pickaxe.setItemMeta(meta);
        }

        NamespacedKey key = new NamespacedKey(plugin, "netherite_pickaxe");
        ShapedRecipe recipe = new ShapedRecipe(key, pickaxe);
        recipe.shape("NNN", " S ", " S ");
        recipe.setIngredient('N', Material.NETHERITE_INGOT);
        recipe.setIngredient('S', Material.STICK);
        plugin.getServer().addRecipe(recipe);
    }
}