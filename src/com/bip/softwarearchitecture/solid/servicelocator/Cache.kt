package com.bip.softwarearchitecture.solid.servicelocator

class Cache {

    private val listService = mutableListOf<Service>()

    fun addService(service: Service) {
        listService.add(service)
    }

    fun getService(serviceName: String): Service? {
        listService.forEach {
            if (it.getName() == serviceName) {
                return it
            }
        }

        return null
    }
}