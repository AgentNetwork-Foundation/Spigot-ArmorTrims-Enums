package quack.itemmeta.utils.trims;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.Registry;
import org.bukkit.inventory.meta.trim.TrimPattern;

public enum TrimPatternEnum {
    SENTRY(TrimPattern.SENTRY),
    DUNE(TrimPattern.DUNE),
    COAST(TrimPattern.COAST),
    WILD(TrimPattern.WILD),
    WARD(TrimPattern.WARD),
    EYE(TrimPattern.EYE),
    VEX (TrimPattern.VEX),
    TIDE (TrimPattern.TIDE),
    SNOUT(TrimPattern.SNOUT),
    RIB (TrimPattern.RIB),
    SPIRE(TrimPattern.SPIRE);

    public final TrimPattern pattern;

    TrimPatternEnum(TrimPattern pattern) {
        this.pattern = pattern;
    }
}
