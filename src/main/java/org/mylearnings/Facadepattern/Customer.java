package org.mylearnings.Facadepattern;

import java.math.BigDecimal;

public class Customer {
    public static void main(String[] args){
        BankService bankService=new BankService();

        int mySaving=bankService.createNewAccount("saving",new BigDecimal(500.00));
        int myInvestment=bankService.createNewAccount("investment",new BigDecimal(500.00));
        bankService.transferMoney(mySaving,myInvestment,new BigDecimal(300));

    }
}
