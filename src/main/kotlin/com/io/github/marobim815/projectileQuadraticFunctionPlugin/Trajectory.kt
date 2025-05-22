package com.io.github.marobim815.projectileQuadraticFunctionPlugin

data class Trajectory(
    val points: List<Vector3D>,
    val a: Double,
    val b: Double,
    val c: Double
) {
    fun toEquationString(): String = "y = ${"%.2f".format(a)}x^2 + ${"%.2f".format(b)}x + ${"%.2f".format(c)}"
}