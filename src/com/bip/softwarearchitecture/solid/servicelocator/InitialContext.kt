package com.bip.softwarearchitecture.solid.servicelocator

class InitialContext {
    fun lookup(jndiService: String): Any? {
        when (jndiService) {
            DatabaseService.NAME -> {
                return DatabaseService()
            }

            MessagingService.NAME -> {
                return MessagingService()
            }
        }

        return null
    }
}