package ca.ecorte.polisiatools;

import org.bukkit.plugin.java.JavaPlugin;

import ca.ecorte.polisiatools.commands.CommandsTest;

public class polisiatools extends JavaPlugin {
	
	@Override
	public void onEnable() {
		System.out.println("PolisiaTools start");
		getCommand("test").setExecutor(new CommandsTest());
		getCommand("alert").setExecutor(new CommandsTest());
		
	}
	
	@Override
	public void onDisable() {
		System.out.println("PolisiaTolls stop");
	}

}
