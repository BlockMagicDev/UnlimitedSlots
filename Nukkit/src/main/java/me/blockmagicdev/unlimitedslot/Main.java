package me.blockmagicdev.unlimitedslot;

import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.server.QueryRegenerateEvent;
import cn.nukkit.plugin.PluginBase;

public class Main extends PluginBase implements Listener {

    @Override
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onQuery(QueryRegenerateEvent event){
        event.setMaxPlayerCount(this.getServer().getOnlinePlayers().size()+1);
        System.out.println("Current max player: "+this.getServer().getMaxPlayers());
        System.out.println("Current max slot: "+event.getMaxPlayerCount());
    }
}
