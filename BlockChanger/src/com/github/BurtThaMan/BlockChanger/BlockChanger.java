package com.github.BurtThaMan.BlockChanger;

import java.util.logging.Logger;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class BlockChanger extends JavaPlugin implements Listener
{
	Logger log = Logger.getLogger("Minecraft");
	
	@Override
	public void onDisable() 
	{
		log.info("[BlockChanger] has been disabled.");
		
	}

	@Override
	public void onEnable() 
	{
		log.info("[BlockChanger] has been enabled.");
		getServer().getPluginManager().registerEvents(this, this);
	}
	
	@EventHandler
	public void normalLogin(PlayerLoginEvent event)
	{
		String msg = "[BLockChanger] A Player has Logged in!";
		log.info(msg);
	}

}
