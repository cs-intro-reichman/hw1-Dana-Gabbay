public class FVCalc {
	public static void main(String[] args){
		int currentValue= Integer.parseInt (args[0]);
		double interestRate= Double.parseDouble (args[1]);
		int years= Integer.parseInt (args[2]);
		double RealRate= interestRate/100;
		double futureValue = currentValue*((Math.pow((RealRate+1), years)));
		System.out.println("After "+ years+ " years, $" + currentValue+ " saved at "+ (double)interestRate + "% will yield $"+ (int)futureValue );
	}
}