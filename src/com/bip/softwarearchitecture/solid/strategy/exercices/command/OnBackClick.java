package com.bip.softwarearchitecture.solid.strategy.exercices.command;

public class OnBackClick implements IBackCommand {
    @Override
    public void execute() {
        System.out.println("Finish screen");
    }
}
