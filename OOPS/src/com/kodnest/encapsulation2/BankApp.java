package com.kodnest.encapsulation2;

  class BankApp {
	  //public setter method
  private int money;
  public void setmoney(int amount) {
	  if (amount>0)
	  {
		  money=amount;
	  }
	  else
	  {
		  System.out.println("Kindly Enter positive amount");
		  System.exit(0);
	  }
  }

}
