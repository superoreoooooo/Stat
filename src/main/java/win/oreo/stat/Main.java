package win.oreo.stat;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;
import win.oreo.stat.util.Color;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage(getConfigMessage("messages.enable", new String[0]));
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage(getConfigMessage("messages.disable", new String[0]));
    }

    public static String getConfigMessage(String path, String[] args) {
        FileConfiguration config = JavaPlugin.getPlugin(Main.class).getConfig();
        String text = config.getString(path);
        String prefix = config.getString("prefix");
        if (text == null) {
            return ChatColor.RED +"ERROR";
        }

        boolean open = false;
        StringBuilder chars = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (c == '%') {
                if (open) {
                    final char[] CHARACTERS = chars.toString().toCharArray();
                    if (CHARACTERS[0] == 'a' && CHARACTERS[1] == 'r' && CHARACTERS[2] == 'g') {
                        final int ARG = Integer.parseInt(String.valueOf(CHARACTERS[3]));

                        text = text.replace(chars.toString(), args[ARG]);

                        chars = new StringBuilder();
                    }
                    open = false;
                } else {
                    open = true;
                }
                continue;
            }

            if (open) {
                chars.append(c);
            }
        }

        return Color.format(prefix + " " + text.replace("%", ""));
    }
}
