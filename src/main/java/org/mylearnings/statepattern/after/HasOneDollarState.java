package org.mylearnings.statepattern.after;

public class HasOneDollarState implements State{

    @Override
    public void insertDollar(VendingMachine vendingMachine) {
        System.out.println("already have one dollar");
        vendingMachine.doReturnMoney();
        vendingMachine.setCurrentState(
                vendingMachine.getIdleState()
        );
    }

    @Override
    public void ejectMoney(VendingMachine vendingMachine) {
        System.out.println("returning money");
        vendingMachine.doReturnMoney();
        vendingMachine.setCurrentState(
                vendingMachine.getIdleState()
        );
    }

    @Override
    public void dispence(VendingMachine vendingMachine) {
        System.out.println("releasing product");
        if (vendingMachine.getCount()>1){
            vendingMachine.doReleaseProduct();
            vendingMachine.setCurrentState(
                    vendingMachine.getIdleState()
            );
        }else{
            vendingMachine.doReleaseProduct();
            vendingMachine.setCurrentState(
                    vendingMachine.getOutOfStockState()
            );
        }
    }
}
