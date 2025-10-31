public class FVCalc {
	public static void main(String[] args){
		int currentValue= Integer.parseInt (args[0]);
		int interestRate= Integer.parseInt (args[1]);
		int years= Integer.parseInt (args[2]);
		double RealRate= interestRate/100.0;
		double futureValue = currentValue*((Math.pow((RealRate+1), years)));
		System.out.println("After "+ years+ " years, $" + currentValue+ " saved at "+ (double)interestRate + "% will yield $"+ (int)futureValue );
	}
}