package org.mylearnings.Facadepattern;

import java.math.BigDecimal;

public class Saving implements IAccount{
    @Override
    public void deposit(BigDecimal amount) {

    }

    @Override
    public void withdraw(BigDecimal amount) {

    }

    @Override
    public void transfer(IAccount account,BigDecimal amount) {

    }

    @Override
    public int getAccountNumber() {
        return 0;
    }
}
