package org.example;
/**
 * @author: Chih-Hao Chen
 * @version : 11.0
 * @date: Dec.1/2022
 */

public class TurnOn extends  Command {
    public TurnOn(Light light) {
        super(light);
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}