package org.mylearnings.statepattern.before;

final class State {
    private State(){

    }
    public final static State Idle=new State();
    public final static State HasOneDollar=new State();
    public final static State OutOfStock=new State();

}
