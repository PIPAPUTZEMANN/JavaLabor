
public class Achterbahn {

	public static void main(String[] args) {
		
		Achterbahn achterbahn=new Achterbahn();
		
		achterbahn.alter=16;
		achterbahn.Koerpergroese=145;
		achterbahn.mitEltern=true;
		achterbahn.nuechtern=true;
		
		
		System.out.println("Berechtigt= " +achterbahn.einlasskontrolle());

	}
	
	int alter;
	int Koerpergroese;
	boolean mitEltern;
	boolean nuechtern;
	
	boolean einlasskontrolle(){
		
		if((alter >= 16 || (alter >= 12 && mitEltern)) && (Koerpergroese >= 145 && 			Koerpergroese <= 205) && (nuechtern)){
		
			
			return true;

		}
		
		return false;
	}
	
}