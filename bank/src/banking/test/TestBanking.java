package banking.test;

import banking.domain.Account;
import banking.domain.Bank;
import banking.domain.CheckingAccount;
import banking.domain.Customer;
import banking.domain.SavingsAccount;

public class TestBanking {
  public static void main(String[] args) {
   
   Bank.addCustomer("test1","1111");//save 천원 이자율 0.07%   
   Bank.addCustomer("test2","2222");//saving 1500 0.03%
   Bank.addCustomer("test3","3333");//saving 2000 0.03%
   Bank.addCustomer("test4","4444");//saving 2000 0.03& / checking 900 한도 300
   Bank.addCustomer("test5","5555");//saving 5000 0.03&/ checking 500 3000
   
   Bank.getCustomer(0).addAccount(new SavingsAccount(1000,0.07));
   Bank.getCustomer(1).addAccount(new SavingsAccount(1500,0.03));
   Bank.getCustomer(2).addAccount(new SavingsAccount(2000,0.03));
   Bank.getCustomer(3).addAccount(new SavingsAccount(2000,0.03));
   Bank.getCustomer(3).addAccount(new CheckingAccount(900,300));
   Bank.getCustomer(4).addAccount(new SavingsAccount(5000,0.03));
   Bank.getCustomer(4).addAccount(new CheckingAccount(500,3000));
   
   
   
   Customer test1 = Bank.getCustomer(0);
//   test1.getAccount(0).withdraw(500);
//   test1.getAccount(0).withdraw(500);
//   test1.getAccount(0).withdraw(500);
//   Account test11 = test1.getAccount(0);
//   if(test11 instanceof SavingsAccount) {
//	   ((SavingsAccount) test11).accumulateInterest();;
//   }
   
   
   Customer test2 = Bank.getCustomer(3);
   
   test2.getAccount(1).withdraw(500);
   test2.getAccount(1).withdraw(500);
   test2.getAccount(1).withdraw(500);
   //0번쨰 500원 3번
   //3번쨰 500원 3번 

  }
}

