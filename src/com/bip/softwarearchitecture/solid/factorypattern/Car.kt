package com.bip.softwarearchitecture.solid.factorypattern

class Car : MotorVehicle {
    override fun build() {
        println("Build Car")
    }
}