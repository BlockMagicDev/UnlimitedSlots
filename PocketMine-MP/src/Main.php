<?php

namespace BlockMagicDev\UnlimitedSlot;

use pocketmine\event\Listener;
use pocketmine\event\server\QueryRegenerateEvent;
use pocketmine\plugin\PluginBase;

class Main extends PluginBase implements Listener{

    protected function onEnable() : void{
        $this->getServer()->getPluginManager()->registerEvents($this, $this);
    }

    public function onQuery(QueryRegenerateEvent $event) : void{
        $event->getQueryInfo()->setMaxPlayerCount(count($this->getServer()->getOnlinePlayers())+1);
    }
}