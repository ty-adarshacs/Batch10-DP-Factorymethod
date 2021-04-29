package com.tyss.dp.factoymethod.plane;

public class GetPlaneFactory {
	 public Plane getPlan(String planType){  
         if(planType == null){  
          return null;  
         }  
       if(planType.equalsIgnoreCase("DOMESTICPLAN")) {  
              return new DomesticPlane();  
            }   
         
       else if(planType.equalsIgnoreCase("INSTITUTIONALPLAN")) {  
             return new Institutionalplan();  
       }  
   return null;  
}  

}
