package week3.day2;

public class CalcIndividualsTax   implements TaxCalculation {

	public void calcDeductions(String name, double HRA, double LTA) {
		System.out.println("calcDeductions is "+name+ HRA + LTA);		
	}

	public void calcGrossIncome(String name, double netIncome, double deductions) {
		System.out.println(netIncome + deductions);
       
	}

	public int taxSlab(String a) {
		// TODO Auto-generated method stub
		System.out.println("taxSlab is "+ "value");		

		return 0;
	}

	public double CalcTaxandPublishValue(double a, int b) {
		System.out.println("CalcTaxandPublishValue is " +a + b);		
		return 0;
	}

	public int Phones() {
		System.out.println("Phone " + "Redmi");
		return 0;


	}

	public int taxSlab() {
		// TODO Auto-generated method stub
		return 0;
	}

	public double CalcTaxandPublishValue() {
		// TODO Auto-generated method stub
		return 0;
	}


}