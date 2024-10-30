package me.astrozdenek

fun main() {
    // Defining constants
    val au = 149597870700.0 // m
    val c = 299792458.0 // m/s

    // Calculating for Earth
    val result = au / c
    val resultInMinutes = result / 60

    // Calculating for all planets
    val mercury = resultInMinutes * 0.39
    val venus = resultInMinutes * 0.72
    val earth = resultInMinutes
    val mars = resultInMinutes * 1.52
    val jupiter = resultInMinutes * 5.2
    val saturn = resultInMinutes * 9.54
    val uranus = resultInMinutes * 19.2
    val neptune = resultInMinutes * 30.06

    // Printing result
    println("======================")
    println("$result s")
    println("$resultInMinutes min")
    println("======================")

    // Planets of the solar system
    println("Mercury: $mercury min")
    println("Venus: $venus min")
    println("Earth: $earth min")
    println("Mars: $mars min")
    println("Jupiter: $jupiter min")
    println("Saturn: $saturn min")
    println("Uranus: $uranus min")
    println("Neptune: $neptune min")
}