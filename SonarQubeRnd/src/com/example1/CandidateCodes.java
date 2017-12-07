package com.example1;

public class CandidateCodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int output = 0;
		//output = parseString("10 abc 20 abc 30 4");
		output = parseString("4 ab 2 cd 45 10");
		//output = parseString("abc ddsds sdd");
		//output = parseString("10 abc 20 abc 30 4 22 22");
        System.out.println(String.valueOf(output));

	}

	
	 public static int parseString(String input1)
	    {
			//Write code here				
			String temp = null;
			String retunData = null;
			int smallData = 0;
			
			if(isNumericArray(input1)){				
			
				if(charCount(input1) <=20){
					
					String strTempArr[] = input1.split(" ");
					
					for(int i =0; i<strTempArr.length;i++)
					{				    
					    retunData = strTempArr[i];					 
					    if(isNumericArray2(retunData)){					    	
					    	 if(0 == smallData){					    		 
					    		 smallData = Integer.parseInt(retunData);
					    		 temp = Integer.toString(smallData);
					    	 }
					    	 else if(Integer.parseInt(retunData) <= smallData ){					    		
					    		smallData = Integer.parseInt(retunData);					    		
					    		temp = Integer.toString(smallData);
					    	}
					    }
					}
				}
				else{
					temp = "-1";				
				}		
			}else{
				
				temp = "0";
			}
			return Integer.parseInt(temp);
	    }
	 //counts character in string
	 private static int charCount(String input1){
		 int count = 0;
		 for(int i=0;i<input1.length();i++){		
				
				count = count +1;		
		 }		
		 return count;
	 }
	 
	 //check numeric
	 private static boolean isNumericArray(String input1) {
		  boolean isNum = true;
		  
		 	String strTempArr[] = input1.split(" ");
		    for (int i=0;i<strTempArr.length;i++){		    	
		    	isNum = strTempArr[i].matches("[0-9]+");		    	
		    }
		  return isNum;
	 
	 }	 
	 
	 //check numeric2
	 private static boolean isNumericArray2(String input1) {
		  boolean isNum = true;		  
		    	isNum = input1.matches("[0-9]+");	
		    return isNum;
	 
	 }	 
}
