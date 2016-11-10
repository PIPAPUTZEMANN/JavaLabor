
public class DateHelper {

	public static void main(String[] args) {
		
		for(int i=0; i<=2000;i++){
			
			System.out.printf("%d ist %sein Schaltjahr\n",i,checkLeapYear(i) ?"" : "k");
		}

	}
	
	
	
	 static boolean checkLeapYear(int iYear){
		 
		 if(iYear % 4 == 0 && (iYear % 100 != 0 || iYear % 400 == 0)){
			 
			 return true;
		 }
		 return false;
	 }

}


