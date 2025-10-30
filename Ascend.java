public class Ascend {
	public static void main(String[] args) {
		int lim= Integer.parseInt(args[0]);
		int a= (int)(Math.random()*(lim+1));
		int b= (int)(Math.random()*(lim+1));
		int c= (int)(Math.random()*(lim+1));
		int big= Math.max(a,b);
		int biggest= Math.max(big,c);
		int minAB= Math.min(a,b);
		int smallest= Math.min(minAB,c);
		int maxAB= Math.max(a,b);
		int d= Math.min (maxAB,c);
		int middle= Math.max (d,minAB);
		System.out.println(a+ " "+ b+ " "+ c);
		System.out.println(smallest+ " "+ middle+ " "+ biggest);
	}
}
