
public class TimeCmplexity {
	public static void main(String[] args) {
		TimeCmplexity tom=new TimeCmplexity();
		double now=System.currentTimeMillis();
		System.out.println(tom.findsum(5));
System.out.println("time taken in millisecs "+(System.currentTimeMillis()-now));
	}
	public int findsum(int n) {
		//int sum=0;
		return (n*(n+1))/2;
	}

}
