package com.CurrentAccount.CurrentAccount.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.Table;

@Entity
@Table(name = "taccounts1")
@NamedStoredProcedureQueries(value= {
    @NamedStoredProcedureQuery(name= "procedure-two", procedureName= "getcurrentaccounts")})

public class corriente {
  


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String Account_Name;
    private String Account_number;
    private double Balance;
      private String savingac;
      private String currentac;

    public corriente(){}
    public corriente (int id,String Account_Name,String Account_number,double Balance,String savingac,String currentac) {

        this.setId(id);
        this.setAccount_Name(Account_Name);
        this.setAccount_number(Account_number);
        this.setBalance(Balance);
        this.setsavingac(savingac);
        this.setcurrentac(currentac);
         


    }

  
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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


    public String getsavingac() {
        return savingac;
    }

    public void setsavingac(String savingac) {
        this.savingac = savingac;
    }

    public String getcurrentac() {
        return currentac;
    }

    public void setcurrentac(String currentac) {
        this.currentac = currentac;
    }

    @Override
    public String toString() {
        return "Entidadcorriente{" +
                "id=" + id +
                 ", Account_Name='" + Account_Name + '\'' +
                ", Account_number='" + Account_number + '\'' +
                ", Balance='" + Balance + '\'' +
                ", savingac='" + savingac + '\'' +
                ", currentac='" + currentac + '\'' +
                '}';
    }


}

