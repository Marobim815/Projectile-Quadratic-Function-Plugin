package com.io.github.marobim815.projectileQuadraticFunctionPlugin

import org.bukkit.Bukkit
import org.bukkit.Location
import org.bukkit.Particle
import org.bukkit.plugin.java.JavaPlugin

class TrajectoryVisualizer(private val plugin: JavaPlugin) {

    fun draw(startLoc: Location, trajectory: Trajectory) {
        Bukkit.getScheduler().runTask(plugin, Runnable {
            for (point in trajectory.points) {
                val loc = startLoc.clone().add(point.x, point.y, point.z)
                startLoc.world?.spawnParticle(Particle.HEART, loc, 1)
                // 만약 색 입자 원하면 아래처럼 DUST 쓰셈!
                // val dust = Particle.DustOptions(Color.RED, 1.0f)
                // startLoc.world?.spawnParticle(Particle.REDSTONE, loc, 0, 0.0, 0.0, 0.0, 1.0, dust)
            }
        })
    }
}