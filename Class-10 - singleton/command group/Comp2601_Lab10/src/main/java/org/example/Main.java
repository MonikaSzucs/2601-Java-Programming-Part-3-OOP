package org.example;
/**
 * @author: Chih-Hao Chen
 * @version : 11.0
 * @date: Dec.1/2022
 */

public class Main {
    public static void main(String[] args) {
        Light light = new Light();

        Command turnOn = new TurnOn(light);
        Command brighter = new Brighter(light);
        Command darker = new Darker(light);

        Invoker invoker = new Invoker();

        invoker.addCommand(turnOn);
        invoker.addCommand(brighter);
        invoker.addCommand(brighter);
        invoker.addCommand(brighter);
        invoker.addCommand(darker);

        invoker.execute();

    }
}