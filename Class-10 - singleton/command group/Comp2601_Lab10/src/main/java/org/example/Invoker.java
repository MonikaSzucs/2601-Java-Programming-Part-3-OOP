package org.example;

import java.util.ArrayList;
import java.util.List;
/**
 * @author: Chih-Hao Chen
 * @version : 11.0
 * @date: Dec.1/2022
 */

public class Invoker {

    private List<Command> commandList = new ArrayList<>();

    public void addCommand(Command command) {
        commandList.add(command);
    }

    public void execute(){
        for (Command command :
                commandList) {
            command.execute();
        }
    }

}
