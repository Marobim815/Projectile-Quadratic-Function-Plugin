package com.io.github.marobim815.projectileQuadraticFunctionPlugin

import org.bukkit.entity.Player
import org.bukkit.entity.Snowball
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.entity.ProjectileLaunchEvent
import org.bukkit.plugin.java.JavaPlugin

class ProjectileListener(
    private val plugin: JavaPlugin
) : Listener {

    @EventHandler
    fun onLaunch(event: ProjectileLaunchEvent) {
        val projectile = event.entity
        val shooter = projectile.shooter

        if (projectile is Snowball && shooter is Player) {
            val velocity = projectile.velocity
            val start = projectile.location

            val trajectory = TrajectoryCalculator.calculate(velocity)
            TrajectoryVisualizer(plugin).draw(start, trajectory)

            TitleSender.sendTitle(
                player = shooter,
                title = "§e투사체 방정식",
                subtitle = trajectory.toEquationString()
            )
        }
    }
}
