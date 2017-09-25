public class Invest {
	public static void main(String[] args){
		float total = 14000;
		System.out.println("Original Invesment : $" + total);
		
		// Inceases by 40% the first year total = total + (total * .4F);
		System.out.println("After one year : $" + total);
		// Loses $1,500 the second year total = total - 1500F;
		System.out.println("After two year : $" + total);
		
		// Increases by 12% the third year total = total + (total *.12F);
		System.out.println("After third year : $" + total);
		
	}
}