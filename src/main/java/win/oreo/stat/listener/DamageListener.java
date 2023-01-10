package win.oreo.stat.listener;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import win.oreo.stat.damage.Damage;
import win.oreo.stat.stat.StatUtil;

public class DamageListener implements Listener {
    @EventHandler
    public void onHit(EntityDamageByEntityEvent e) {
        if (e.getDamager() instanceof Player player) {
            Entity victim = e.getEntity();
            player.sendMessage("hello!");
            double physicalDamage = Damage.getPhysicalDamage(StatUtil.getStat(player));
            double magicalDamage = Damage.getMagicalDamage(StatUtil.getStat(player));
            double trueDamage = Damage.getTrueDamage(StatUtil.getStat(player));
            e.setDamage(0);
            e.setCancelled(true);
        }
    }
}
