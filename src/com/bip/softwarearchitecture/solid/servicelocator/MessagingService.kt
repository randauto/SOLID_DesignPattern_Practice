package com.bip.softwarearchitecture.solid.servicelocator

class MessagingService : Service {
    init {
        println("Init MessagingService called")
    }

    companion object {
        const val NAME = "messagingService"
    }

    override fun getName(): String {
        return NAME
    }

    override fun execute() {
        println("Messaging service executing...")
    }
}