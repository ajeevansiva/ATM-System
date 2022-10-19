package com.ajeevan;

import java.util.HashMap;
import java.util.Map;

public class AtmImplementation implements AtmOperation{

    Atm atm = new Atm();
    Map<Double,String> statement = new HashMap<>();
    @Override
    public void viewBalance() {
        System.out.println("Available Balance is : "+ atm.getBalance());
    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
        if(withdrawAmount <= atm.getBalance()){
            statement.put(withdrawAmount," Withdrawn! ");
            System.out.println("collect the your cash : " + withdrawAmount);
            atm.setBalance(atm.getBalance() - withdrawAmount);
            viewBalance();
        }
        else{
            System.out.println("Insufficient Funds!! ");
        }
    }

    @Override
    public void depositAmount(double depositAmount) {
        statement.put(depositAmount," Deposited! ");
        System.out.println(depositAmount + " Deposited Successfully!!");
        atm.setBalance(atm.getBalance()+ depositAmount);
        viewBalance();

    }

    @Override
    public void viewStatement() {
        for (Map.Entry<Double,String> s:statement.entrySet()) {
            System.out.println(s.getKey()+ "" +s.getValue() );
        }
    }
}
