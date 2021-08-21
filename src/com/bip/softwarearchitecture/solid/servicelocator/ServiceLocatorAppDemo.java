package com.bip.softwarearchitecture.solid.servicelocator;

public class ServiceLocatorAppDemo {
    public static void main(String[] args) {
        Service service = ServiceLocator.Companion.getService("databaseService");
        service.execute();

        service = ServiceLocator.Companion.getService("messagingService");
        service.execute();
        service = ServiceLocator.Companion.getService("messagingService");
        service.execute();

    }
}
