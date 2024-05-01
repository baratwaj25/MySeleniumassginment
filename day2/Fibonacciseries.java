package week1.day2;

public class Fibonacciseries {

	public static void main(String[] args) {
		int i = 0;
		int j = 1;
		System.out.println(i);
		System.out.println(j);
		for (int m =1; m<= 8;m++)
		{
			int k = i+j;
			i =j;
			j=k;
			System.out.println(k);
					
			
		}

}
}
