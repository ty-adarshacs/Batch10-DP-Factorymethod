package com.tyss.dp.factoymethod.plane;

public abstract class Plane {
	 public double rate;  
     abstract void getRate();  

     public void calculateBill(int units){  
          System.out.println(units*rate);  

}
}