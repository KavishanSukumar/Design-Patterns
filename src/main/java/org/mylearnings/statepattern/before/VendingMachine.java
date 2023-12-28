package org.mylearnings.statepattern.before;

public class VendingMachine {
    private State currentState;
    private int count;
    public VendingMachine(int count){
        if (count > 0) {
            currentState=State.Idle;
            this.count=count;
        }else {
            currentState=State.OutOfStock;
            this.count=0;
        }
    }
    public void insertDollar(){
        if (currentState == State.Idle) {
            currentState=State.HasOneDollar;
        } else if (currentState==State.HasOneDollar) {
            ejectMoney();
            currentState=State.Idle;
        } else if (currentState==State.OutOfStock) {
            ejectMoney();
        }
    }
    public void ejectMoney(){

    }
    public void dispence(){

    }
}
