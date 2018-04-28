package mainpackage.main;

import java.io.File;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;11
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.Team;

public class plugin_war extends JavaPlugin 
{

	public void onEnable() 
	{
		File config = new File(getDataFolder() + File.separator + "config.yml");
		if(!config.exists()) 
		{
			getConfig().options().copyDefaults(true);
			saveDefaultConfig();
		}
		
		
		Bukkit.getPluginManager().registerEvents(new Handler(this), this);
		getCommand("kit").setExecutor(new kit(this));
		getCommand("speed").setExecutor(new commands(this));
		getLogger().info("Enabled!");
		
	}
	
	public void onDisable() 
	{
		
		getLogger().info("Disabled!");
		
	}
}
