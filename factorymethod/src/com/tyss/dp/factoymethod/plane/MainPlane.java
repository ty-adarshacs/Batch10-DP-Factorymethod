package com.tyss.dp.factoymethod.plane;

public class MainPlane {
	public static void main(String[] args) {
		 GetPlaneFactory planFactory = new GetPlaneFactory();  
	      
	      
	       
	    
	      int units=100;
	      String planeName="DOMESTICPLAN";
	      Plane p = planFactory.getPlan(planeName);  
	      //call getRate() method and calculateBill()method of DomesticPaln.  
	  
	       System.out.println("Bill amount for "+planeName+" of  "+units+" units is: ");  
	           p.getRate();  
	           p.calculateBill(units);  
	            }  
	}


