package org.mylearnings.statepattern.after;

import org.mylearnings.statepattern.after.VendingMachine;

public class IdleState implements State{
    @Override
    public void insertDollar(VendingMachine vendingMachine) {
        System.out.println("Dollar inserted");
        vendingMachine.setCurrentState(
                vendingMachine.getHasOneDollarState()
        );
    }

    @Override
    public void ejectMoney(VendingMachine vendingMachine) {
        System.out.println("no money to return");
    }

    @Override
    public void dispence(VendingMachine vendingMachine) {
        System.out.println("payment required");
    }
}
