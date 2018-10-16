package com.geekbetter.designpattern.relation.command;


public abstract class Command {
    protected Receiver receiver;

    public Command(Receiver receiver){
        this.receiver = receiver;

    }

    abstract public void execute();
}
