package week3.day2;

public class Execution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CalcIndividualsTax Cal = new CalcIndividualsTax();
		Cal.calcDeductions("Nanda = ", 453.25, 45863.45);
		Cal.calcGrossIncome("Nanda = ", 8000, 4000);
		Cal.CalcTaxandPublishValue(100.52, 5);
		Cal.taxSlab();
		//own
		Cal.Phones();


	}

}
