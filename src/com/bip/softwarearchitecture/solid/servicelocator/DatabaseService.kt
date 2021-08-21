package com.bip.softwarearchitecture.solid.servicelocator

class DatabaseService: Service {
    init {
        println("Init DatabaseService called")
    }

    companion object {
        const val NAME = "databaseService"
    }
    override fun getName(): String {
        return NAME
    }

    override fun execute() {
        println("Database service executing...")
    }
}