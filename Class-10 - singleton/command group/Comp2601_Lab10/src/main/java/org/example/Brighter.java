package org.example;
/**
 * @author: Chih-Hao Chen
 * @version : 11.0
 * @date: Dec.1/2022
 */

    public class Brighter extends Command {
        public Brighter(Light light) {
            super(light);
        }

        @Override
        public void execute() {
            light.brighter();
        }
    }