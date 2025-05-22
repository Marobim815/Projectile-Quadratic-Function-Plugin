package com.io.github.marobim815.projectileQuadraticFunctionPlugin

import org.bukkit.Bukkit
import org.bukkit.Color
import org.bukkit.Particle
import org.bukkit.plugin.java.JavaPlugin

class TrajectoryVisualizer(private val plugin: JavaPlugin) {

    fun draw(startLoc: org.bukkit.Location, trajectory: Trajectory) {
        Bukkit.getScheduler().runTask(plugin, Runnable {
            for (point in trajectory.points) {
                val loc = startLoc.clone().add(point.x, point.y, point.z)
                startLoc.world?.spawnParticle(Particle.HEART, loc, 1, Particle.DustOptions(Color.RED, 1.0f))
            }
        })
    }
}