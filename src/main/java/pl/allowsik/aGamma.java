package pl.allowsik;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class aGamma extends JavaPlugin {
    @Override
    public void onEnable() {
        Objects.requireNonNull(this.getCommand("gamma")).setExecutor(new Gamma());
    }
}
