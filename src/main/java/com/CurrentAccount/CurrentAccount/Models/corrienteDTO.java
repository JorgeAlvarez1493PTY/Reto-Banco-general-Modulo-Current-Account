package com.CurrentAccount.CurrentAccount.Models;

public class corrienteDTO {
    private String Account_Name;
    private String Account_number;
    private double Balance;
 

    public  corrienteDTO() {}

    public corrienteDTO (String Account_Name,String Account_number,double Balance) {

        this.setAccount_Name(Account_Name);
        this.setAccount_number(Account_number);
        this.setBalance(Balance);

    }

    

    public String getAccount_Name() {
        return Account_Name;
    }

    public void setAccount_Name(String Account_Name) {
        this.Account_Name = Account_Name;
    }


    public String getAccount_number() {
        return Account_number;
    }

    public void setAccount_number(String Account_number) {
        this.Account_number = Account_number;
    }

       public double getBalance() {
        return Balance;
    }

    public void setBalance(double Balance) {
        this.Balance = Balance;
    }

    
    @Override
    public String toString() {
        return "Modelocorriente{" +
                " Account_Name='" + Account_Name + '\'' +
                ", Account_number='" + Account_number + '\'' +
                ", Balance='" + Balance + '\'' +
                '}';
    }
    
}
