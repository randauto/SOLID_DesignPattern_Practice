package com.bip.softwarearchitecture.solid.factorypattern

class FactoryMethodDemo {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val car = CarFactory().create()
            val motorcycle = MotorcycleFactory().create()
        }

    }
}