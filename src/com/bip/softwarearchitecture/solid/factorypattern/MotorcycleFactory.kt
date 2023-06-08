package com.bip.softwarearchitecture.solid.factorypattern

class MotorcycleFactory : MotorVehicleFactory() {
    override fun createMotorVehicle(): MotorVehicle {
        return Motorcycle()
    }
}