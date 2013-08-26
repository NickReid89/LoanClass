/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package loanclass;

import java.lang.Math.*;
/**
 *
 * @author Nickolas Reid
 */
public class Loan {
    private double loanAmount;
    private double interestRate;
    private int durationYears;
    /**
     * 
     */
    Loan(){
       this.loanAmount = 0;
       this.interestRate = 0;
       this.durationYears = 0;
    }
    /**
     * 
     * @param loanAmount
     * @param interestRate
     * @param durationYears 
     */
    Loan(double loanAmount, double interestRate,int durationYears){
     this.loanAmount=loanAmount;
     this.interestRate =interestRate;
     this.durationYears=durationYears;
    } 
    /**
     * 
     * @return monthly payment
     * @throws InvalidDurationException
     * @throws NegativeLoanFieldException 
     */
     public double monthlyPayment() throws InvalidDurationException,NegativeLoanFieldException{
         
         double monthlyPayment;
         if( interestRate > 0){  
         monthlyPayment = loanAmount * ((interestRate / 100) / 12) / (1 - Math.pow((1 + (interestRate / 100) / 12 ),(-durationYears * 12)) );
         }
         else{
         monthlyPayment = loanAmount / (durationYears * 12); 
         }
         return monthlyPayment;
     }
     /**
      * 
      * @return monthly interest
      * @throws InvalidDurationException
      * @throws NegativeLoanFieldException 
      */
     public double monthlyTotalInterest() throws InvalidDurationException,NegativeLoanFieldException{
         double monthlyInterest;    
        // monthlyInterest = (interestRate / (durationYears / 100) * 12);
         monthlyInterest = monthlyPayment() * (durationYears * 12) - getLoanAmount();
         return monthlyInterest;
     }
       /**
        * 
        * @return biweekly payment
        * @throws InvalidDurationException
        * @throws NegativeLoanFieldException 
        */
     public double biweeklyPayment()throws InvalidDurationException,NegativeLoanFieldException{
         double biPayment;
         //biPayment = ((interestRate * 100) * 12) / 26;
         if( interestRate > 0){  
         biPayment = loanAmount * ((interestRate / 26) / 100) / (1 - Math.pow((1 + (interestRate / 26) / 100 ),(-durationYears * 26)) );
         }
         else{
         biPayment = loanAmount / (durationYears * 26); 
         }
         return biPayment;
     }
        /**
         * 
         * @return biweekly interest rate
         * @throws InvalidDurationException
         * @throws NegativeLoanFieldException 
         */
     public double biweeklyTotalInterest()throws InvalidDurationException,NegativeLoanFieldException{
         double biInterest;
         
         biInterest = biweeklyPayment() * (durationYears * 26) - getLoanAmount();
         return biInterest;
     }
     /**
      * 
      * @return weekly payment
      * @throws InvalidDurationException
      * @throws NegativeLoanFieldException 
      */
     public double weeklyPayment()throws InvalidDurationException,NegativeLoanFieldException{
         double weeklyPayment;
         if( interestRate > 0){  
         weeklyPayment = loanAmount * ((interestRate / 100) / 52) / (1 - Math.pow((1 + (interestRate / 100) / 52 ),(-durationYears * 52)) );
         }
         else{
         weeklyPayment = loanAmount / (durationYears * 52); 
         }
         return weeklyPayment;
         
     }
    /**
     * 
     * @return weekly interest
     * @throws InvalidDurationException
     * @throws NegativeLoanFieldException 
     */
     public double weeklyTotalInterest()throws InvalidDurationException,NegativeLoanFieldException{
         double weeklyInterest;
         
         weeklyInterest = weeklyPayment() * (durationYears * 52) - getLoanAmount();
         return weeklyInterest;
     }

    /**
     * 
     * @return loan amount
     */
    public double getLoanAmount() {
        return loanAmount;
    }

    /**
     * @param loanAmount the loanAmount to set
     */
    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    /**
     * @return the interest Rate
     */
    public double getInterestRate() {
        return interestRate;
    }

    /**
     * @param interestRate the interestRate to set
     */
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    /**
     * @return the durationYears
     */
    public int getDurationYears() {
        return durationYears;
    }

    /**
     * @param durationYears the durationYears to set
     */
    public void setDurationYears(int durationYears) {
        this.durationYears = durationYears;
    }
    
    
}
