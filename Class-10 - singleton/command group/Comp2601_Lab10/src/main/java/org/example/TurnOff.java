package org.example;
/**
 * @author: Chih-Hao Chen
 * @version : 11.0
 * @date: Dec.1/2022
 */

public class TurnOff extends Command {

    public TurnOff(Light light) {
        super(light);
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}
