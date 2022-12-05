package org.example;
/**
 * @author: Chih-Hao Chen
 * @version : 11.0
 * @date: Dec.1/2022
 */

public abstract class Command {

    Light light;

    public Command(Light light){
        this.light = light;
    }

    public abstract void execute();
}