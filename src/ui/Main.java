package ui;

public class Main {
    
	public static void main(String[] args) {

	}
	public int factorial(int indice) {
		if(indice==0) {
            return 1;
		}else{
			return indice*factorial(indice-1);
		}
	}
	public int suma(int n, int[] a) {
		if(n==0) {
			return a[0];
		}else {
			return a[n]+suma(n-1,a);
		}
	}
	public long fibonachi(long n) {
		if(n==0||n==1) {
			return n;
		}else {
			return fibonachi(n-1)+fibonachi(n-2);
		}
	}
}
