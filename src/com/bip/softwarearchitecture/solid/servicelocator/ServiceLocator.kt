package com.bip.softwarearchitecture.solid.servicelocator

class ServiceLocator {
    companion object {
        private val cache = Cache()

        fun getService(jndiName: String): Service? {
            val service = cache.getService(jndiName)
            service?.let {
                return it
            }

            val initialContext = InitialContext()
            val s = initialContext.lookup(jndiName) as Service
            cache.addService(s)
            return s
        }
    }
}