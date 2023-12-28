package org.mylearnings.statepattern.after;


public interface State {
    public void insertDollar(VendingMachine vendingMachine);
    public void ejectMoney(VendingMachine vendingMachine);
    public  void dispence(VendingMachine vendingMachine);
}
