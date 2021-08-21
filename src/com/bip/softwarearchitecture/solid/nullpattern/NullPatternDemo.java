package com.bip.softwarearchitecture.solid.nullpattern;

public class NullPatternDemo {
    public static void main(String[] args) {
        CustomerFactory customerFactory = new CustomerFactory();

        System.out.println(customerFactory.getCustomer("Meng").getCustomer());
        System.out.println(customerFactory.getCustomer("Tuan").getCustomer());
    }
}
