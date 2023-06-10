package sayiBulma;

public class Main {

	public static void main(String[] args) {
		int[] numbers= new int [] {1,2,5,7,9,0};
		int aranacak=6;
		boolean varmi=false;
		for(int number : numbers) {
			if(number==aranacak) {
				varmi=true;
				break;
			}
		}
		if(varmi) {
			System.out.println("Sayı mevcuttur");
		}else {System.out.println("Sayı mevcut değildir");}
	}
	

}
