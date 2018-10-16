package com.geekbetter.designpattern.relation.command;

public class ConcreteCommand extends Command{

    public ConcreteCommand(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
       receiver.action();
    }
}
