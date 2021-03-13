package ui;
public class Main {
	public static int[] array;
	
	public static void main(String[]args) {
		
	}

	public int binarySearch(int[] N, int[] M, int book1, int book2) {
		int position = -1;
		int i = 0;
		int j = N.length-1;
		//Intente hacer el ciclo con un for pero no me funciono.
		while(i<=j&&position<0) {
			int m = (i+j)/2;
			if(N[m]==book1){
				position = m;
				if(N[m]==book2) {
					position = m;
				}
				else if(N[m]>book2) {
					j = m-1;
				}
				else {
					i=m+1;
				}
			}
			else if(N[m]>book1) {
				j = m-1;
			}
			else {
				i=m+1;
			}
		}
		return position;
	}
	
}
