package com.bip.softwarearchitecture.solid.factorypattern

class CarFactory : MotorVehicleFactory() {
    override fun createMotorVehicle(): MotorVehicle {
        return Car()
    }
}