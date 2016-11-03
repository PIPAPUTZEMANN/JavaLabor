public class ControlStructures {

	public static void main(String[] args) {
		
	int x=4;
	int y=5;
	int k=2;
	double p=21.30;
	
	int result=sum(x,y);
	int ergebnisk=calcCubicNumber(k);
	double mehrwert=calcMwSt(p);
	
	System.out.println(result);
	System.out.println(ergebnisk);
	System.out.println(mehrwert);
	
	
	}
	
	
	
	
	
	public static int sum(int a, int b)
	{
	
		int r=a+b;
			
	return r;
		
	} 
	
	public static int calcCubicNumber(int c){
		
		int u= c*c*c;
		
		return u;
		
	}
	
	public static double calcMwSt(double l){
		
		double g=l*0.19;
		
		return g;
		
	}
	
}