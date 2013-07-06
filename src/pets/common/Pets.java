package pets.common;

import java.util.logging.Logger;

import org.bukkit.entity.Chicken;
import org.bukkit.entity.Cow;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.MushroomCow;
import org.bukkit.entity.Player;
import org.bukkit.entity.Sheep;
import org.bukkit.entity.Wolf;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class Pets  extends JavaPlugin
implements Listener
{
public final Logger logger = Logger.getLogger("Minecraft");
public static Pets plugin;

public void onDisable()
{
  PluginDescriptionFile pdfFile = getDescription();
  this.logger.info(pdfFile.getName() + " Has been disabled!");
}
public void onEnable() {
  PluginDescriptionFile pdfFile = getDescription();
  this.logger.info(pdfFile.getName() + " Version " + pdfFile.getVersion() + " Has been enabled!");
  getServer().getPluginManager().registerEvents(this, this);
 
  getConfig().options().copyDefaults(true);
  saveConfig();
}
Player p;

@EventHandler
public void onCreatureSpawn(CreatureSpawnEvent event) {
  if ((event.getEntity().getType() == EntityType.SHEEP) && (
    (event.getSpawnReason() == CreatureSpawnEvent.SpawnReason.SPAWNER_EGG) || (event.getSpawnReason() == CreatureSpawnEvent.SpawnReason.BREEDING))) {

    Sheep sheep = (Sheep)event.getEntity();
    sheep.setBaby();
    sheep.setTarget(p);
    sheep.setCustomName(getConfig().getString("Names.Sheep"));
    sheep.setCustomNameVisible(true);
  }
  if ((event.getEntity().getType() == EntityType.SHEEP) && (
		    (event.getSpawnReason() == CreatureSpawnEvent.SpawnReason.SPAWNER_EGG) || (event.getSpawnReason() == CreatureSpawnEvent.SpawnReason.BREEDING))) {

		    Sheep sheep = (Sheep)event.getEntity();
		    sheep.setBaby();
		    sheep.setTarget(p);
		    sheep.setCustomName(getConfig().getString("Names.Sheep"));
		    sheep.setCustomNameVisible(true);
		    
  }
  if ((event.getEntity().getType() == EntityType.WOLF) && (
		    (event.getSpawnReason() == CreatureSpawnEvent.SpawnReason.SPAWNER_EGG) || (event.getSpawnReason() == CreatureSpawnEvent.SpawnReason.BREEDING) || (event.getSpawnReason() == CreatureSpawnEvent.SpawnReason.CUSTOM))) {

		    Wolf wolf = (Wolf)event.getEntity();
		    wolf.setBaby();
		    wolf.setTarget(p);
		    wolf.setCustomName(getConfig().getString("Names.Wolf"));
		    wolf.setCustomNameVisible(true);
  }
  if ((event.getEntity().getType() == EntityType.CHICKEN) && (
		    (event.getSpawnReason() == CreatureSpawnEvent.SpawnReason.SPAWNER_EGG) || (event.getSpawnReason() == CreatureSpawnEvent.SpawnReason.BREEDING))) {

		    Chicken chicken = (Chicken)event.getEntity();
		    chicken.setBaby();
		    chicken.setTarget(p);
		    chicken.setCustomName(getConfig().getString("Names.Chicken"));
		    chicken.setCustomNameVisible(true);
  }
  if ((event.getEntity().getType() == EntityType.COW) && (
		    (event.getSpawnReason() == CreatureSpawnEvent.SpawnReason.SPAWNER_EGG) || (event.getSpawnReason() == CreatureSpawnEvent.SpawnReason.BREEDING))) {

		    Cow cow = (Cow)event.getEntity();
		    cow.setBaby();
		    cow.setTarget(p);
		    cow.setCustomName(getConfig().getString("Names.Cow"));
		    cow.setCustomNameVisible(true);
  }
  if ((event.getEntity().getType() == EntityType.MUSHROOM_COW) && (
		    (event.getSpawnReason() == CreatureSpawnEvent.SpawnReason.SPAWNER_EGG) || (event.getSpawnReason() == CreatureSpawnEvent.SpawnReason.BREEDING))) {

		    MushroomCow m = (MushroomCow)event.getEntity();
		    m.setBaby();
		    m.setTarget(p);
		    m.setCustomName(getConfig().getString("Names.Mooshroom"));
		    m.setCustomNameVisible(true);
  }
}
}