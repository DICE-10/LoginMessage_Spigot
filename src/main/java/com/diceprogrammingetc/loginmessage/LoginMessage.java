package com.diceprogrammingetc.loginmessage;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class LoginMessage extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("プラグインが読み込まれました！！");   //---1
        getServer().getConsoleSender().sendMessage(ChatColor.AQUA+"プラグインが読み込まれました！！");  //---2

        getServer().getPluginManager().registerEvents(this,this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("プラグインを終了します。");   //---1
        getServer().getConsoleSender().sendMessage(ChatColor.YELLOW+"プラグインを終了します。");  //---2
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent event){
        Player player = event.getPlayer();
        player.sendMessage("ようこそ！"+"§a"+player.getName()+"さん！");
        player.sendTitle("ようこそ！","§a"+player.getName()+"さん！",20,200,20);
    }
}
