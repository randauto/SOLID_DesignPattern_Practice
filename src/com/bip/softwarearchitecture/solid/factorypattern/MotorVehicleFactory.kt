package com.bip.softwarearchitecture.solid.factorypattern

abstract class MotorVehicleFactory {
    fun create(): MotorVehicle {
        val vehicle = createMotorVehicle()
        vehicle.build()
        return vehicle
    }

    protected abstract fun createMotorVehicle(): MotorVehicle
}