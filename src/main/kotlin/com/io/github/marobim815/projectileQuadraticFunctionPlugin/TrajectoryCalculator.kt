package com.io.github.marobim815.projectileQuadraticFunctionPlugin

import org.bukkit.util.Vector
import kotlin.math.pow

object TrajectoryCalculator {
    private const val GRAVITY = 0.05
    private const val MAX_TIME = 3.0
    private const val DELTA_T = 0.1

    fun calculate(initialVelocity: Vector): Trajectory {
        val points = mutableListOf<Vector3D>()

        var t = 0.0
        while (t < MAX_TIME) {
            val x = initialVelocity.x * t
            val y = initialVelocity.y * t - 0.5 * GRAVITY * t * t
            val z = initialVelocity.z * t
            points.add(Vector3D(x, y, z))
            t += DELTA_T
        }

        val (a, b, c) = fitQuadratic(points)
        return Trajectory(points, a, b, c)
    }

    private fun fitQuadratic(points: List<Vector3D>): Triple<Double, Double, Double> {
        val p1 = points[0]
        val p2 = points[points.size / 2]
        val p3 = points.last()

        val (x1, y1) = p1.x to p1.y
        val (x2, y2) = p2.x to p2.y
        val (x3, y3) = p3.x to p3.y

        val denom = (x1 - x2) * (x1 - x3) * (x2 - x3)
        val a = (x3 * (y2 - y1) + x2 * (y1 - y3) + x1 * (y3 - y2)) / denom
        val b = (x3.pow(2) * (y1 - y2) + x2.pow(2) * (y3 - y1) + x1.pow(2) * (y2 - y3)) / denom
        val c = (x2 * x3 * (x2 - x3) * y1 + x3 * x1 * (x3 - x1) * y2 + x1 * x2 * (x1 - x2) * y3) / denom

        return Triple(a, b, c)
    }
}
