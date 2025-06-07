package com.io.github.marobim815.projectileQuadraticFunctionPlugin

import org.bukkit.plugin.java.JavaPlugin

class ProjectileQuadraticFunctionPlugin : JavaPlugin() {
    // java -Xmx4G -Xms2G -jar paper-1.21.4-231.jar nogui
    // cd C:\ChristmasServer

    override fun onEnable() {
        logger.info("Hello world!")
        server.pluginManager.registerEvents(ProjectileListener(this), this)
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}
