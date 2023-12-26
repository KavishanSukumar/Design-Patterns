package org.mylearnings.assignment.assignment1;

public class CoffeeTouchScreenAdapter implements CoffeeMachineInterface{
     OldCoffeeMachine oldCoffeeMachine;

    public CoffeeTouchScreenAdapter(OldCoffeeMachine oldCoffeeMachine) {
        this.oldCoffeeMachine = oldCoffeeMachine;
    }

    @Override
    public void chooseFirstSelection(String selection) {
        if (selection.equals("A")){
            oldCoffeeMachine.SelectA();;
        }
        if (selection.equals("B")){
            oldCoffeeMachine.SelectB();;
        }

    }

    @Override
    public void chooseSecondSelection(String selection) {
        if (selection.equals("A")){
            oldCoffeeMachine.SelectA();;
        }
        if (selection.equals("B")){
            oldCoffeeMachine.SelectB();;
        }
    }
}
