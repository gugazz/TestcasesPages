package week1day2homework;

public class Learningtwodimensionalarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] studentlist= {"Venkat","Shanmuga","Arockia"};
		
		char[][] graDes= {{'O','A','B','C','D'},{'A','B','C','D','E'},{'A','A','A','A','A'}};
		int[] aGes= {24,25,28};
		
				// for(char[] stgrade:graDes)
	    		  //   for(int staGes:aGes)
	    		    //	 for(String stnaMes :studentlist)
	    					 
		/*{
			// System.out.println(studentlist[index]+" "+graDes[index][0]+" "+graDes[index][1]+" "+graDes[index][2]);
			// System.out.println(stgrade);
			//System.out.println(staGes);
			
			
			//System.out.println(stnaMes);
			 
		 }*/{
			//Scanner obj = null;
					//System.out.println("Enter the student number to be displayed");
				//Scanner obj =new Scanner(System.in);
					//int index=obj.nextInt();
						//int index = index-1;
						
								for( int index=0;index<3;index++)
					    		 {
					    			 System.out.println(studentlist[index]+" who is " +aGes[index]+ " years old scored "+ graDes[index][0]+","+graDes[index][1]+","+graDes[index][2]+","+graDes[index][3]+","+graDes[index][4]);	
					     	 
					    		 }
					    
						}
		}

	

	}




