package quack.itemmeta.utils.trims;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.Registry;
import org.bukkit.inventory.meta.trim.TrimMaterial;
import org.bukkit.inventory.meta.trim.TrimPattern;

public enum TrimMaterialEnum {
    QUARTZ(TrimMaterial.QUARTZ),
    IRON(TrimMaterial.IRON) ,
    NETHERITE(TrimMaterial.NETHERITE),
    REDSTONE(TrimMaterial.REDSTONE),
    COPPER (TrimMaterial.COPPER),
    GOLD (TrimMaterial.GOLD),
    EMERALD (TrimMaterial.EMERALD),
    DIAMOND (TrimMaterial.DIAMOND),
    LAPIS (TrimMaterial.LAPIS),
    AMETHYST(TrimMaterial.AMETHYST);

    public final TrimMaterial material;

    TrimMaterialEnum(TrimMaterial pattern) {
        this.material = pattern;
    }
}
