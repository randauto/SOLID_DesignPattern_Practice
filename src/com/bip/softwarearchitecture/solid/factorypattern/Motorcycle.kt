package com.bip.softwarearchitecture.solid.factorypattern

class Motorcycle : MotorVehicle {
    override fun build() {
        println("Build Motorcycle")
    }
}