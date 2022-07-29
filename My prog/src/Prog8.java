import java.util.Scanner;
public class Prog8 {

	public static void main(String args[]) {

		double costPrice = 0;
		double sellingPrice = 0;
		double profit = 0;
		double loss = 0;

		Scanner ad = new Scanner(System.in);
		System.out.println("Enter Resource Billing Rate: ");
		double resourceBillingRate = ad.nextDouble();
		
		System.out.println("Enter Time contributed: ");
		double timeContributed = ad.nextDouble();
		
		System.out.println("Hardware Input used(true/false): ");
		boolean hardwareInputUsed = ad.nextBoolean();
		
		System.out.println("Hardware Input costs: ");
		double hardwareInputCosts = ad.nextDouble();
		
		System.out.println("Frequency (true/false): ");
		boolean frequency = ad.nextBoolean();
		
		System.out.println("Software cost: ");
		double slCost = ad.nextDouble();
		
		System.out.println("Software cost new: ");
		double slCostv = ad.nextDouble();
		
		System.out.println("External Consultancy Used(true/false): ");
		boolean externalConsultancyUsed = ad.nextBoolean();
		
		System.out.println("Enter External Consultant Cost: ");
		double externalConsultantCost = ad.nextDouble();
		ad.close();
		
		costPrice = resourceBillingRate * timeContributed;
		
		if (hardwareInputUsed) {
			hardwareInputCosts = 0.7 * hardwareInputCosts;
			costPrice = costPrice + hardwareInputCosts;
		}
		if (frequency) {
			slCost = 0.5 * slCost;
			costPrice = costPrice + slCost;
		} else {
			slCost = 0.0;
			costPrice = costPrice + slCost;
		}
		
		if (externalConsultancyUsed) {
			externalConsultantCost = resourceBillingRate * timeContributed;
			costPrice = costPrice + externalConsultantCost;
		}
		
		if (frequency) {
			slCostv = 0.5 * slCostv;
		} 
		
		sellingPrice = (resourceBillingRate * timeContributed) + (0.3 * hardwareInputCosts) + slCostv;
		
		if(sellingPrice>costPrice){
			profit = sellingPrice - costPrice;
			System.out.println("The Profit earned by the Company is: " + profit);
		}
		else{
			loss = costPrice - sellingPrice;
			System.out.println("The Loss borne by the Company is: " + loss);
		}
	}
}

