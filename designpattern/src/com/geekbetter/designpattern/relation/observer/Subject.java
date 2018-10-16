package com.geekbetter.designpattern.relation.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    private List<Observer> observers = new ArrayList<>();

    /**
     * 增加观察者
     * @param observer
     */
    public void attach(Observer observer){
        observers.add(observer);
    }

    /**
     * 移除观察者
     * @param observer
     */
    public void delete(Observer observer){
        observers.remove(observer);
    }

    /**
     * 通知所有观察者
     */
    public void notifyObserver(){
        for (Observer o:observers) {
            o.update();
        }
    }
}
