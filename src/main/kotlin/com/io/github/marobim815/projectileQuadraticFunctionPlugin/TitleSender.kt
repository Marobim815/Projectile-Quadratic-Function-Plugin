package com.io.github.marobim815.projectileQuadraticFunctionPlugin

import net.kyori.adventure.key.Key
import net.kyori.adventure.sound.Sound
import org.bukkit.entity.Player

object TitleSender {
    @Suppress("DEPRECATION")
    fun sendTitle(player: Player, title: String, subtitle: String) {
        player.sendTitle(title, subtitle, 10, 60, 20)
        player.playSound(
            Sound.sound(
                Key.key("minecraft:entity.player.levelup"),
                Sound.Source.MASTER,
                1f,
                1f
            )
        )
    }
}
