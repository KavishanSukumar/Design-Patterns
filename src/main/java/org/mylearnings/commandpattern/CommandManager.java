package org.mylearnings.commandpattern;

import java.util.ArrayList;
import java.util.List;

public class CommandManager {
    private final List<Command> history = new ArrayList<>();
    private final List<Command> redoList = new ArrayList<>();

    public void executeCommand(Command command) {
        command.execute();
        history.add(command);
        redoList.clear();
    }

    public void undo() {
        if (!history.isEmpty()) {
            Command command = history.remove(history.size() - 1);
            command.unexecute();
            redoList.add(command);
        }
    }

    public void redo() {
        if (!redoList.isEmpty()) {
            Command command = redoList.remove(redoList.size() - 1);
            command.execute();
            history.add(command);
        }
    }
}
