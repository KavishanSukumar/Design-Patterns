package org.mylearnings.commandpattern;

public interface Command {
    void execute();
    void unexecute();
    boolean isReversible();
}
