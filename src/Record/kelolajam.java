package Record;
import java.util.Scanner;
public class kelolajam {

	public static void main(String[] args) {
		
		jam T = new jam();
		Scanner sc= new Scanner (System.in);
		//TODO Auto-generated method stub
		System.out.println("jam= ");T.j=sc.nextInt();
		System.out.println("menit= ");T.m=sc.nextInt();
		System.out.println("detik= ");T.d=sc.nextInt();
		
		System.out.println("waktu="+T.j+","+T.m+","+T.d);
		
		do {
			System.out.println("jam= ");
			T.j=sc.nextInt();
		}while(T.m>=0&& T.j<24);
		
		do {
			System.out.println("menit= ");
			T.j=sc.nextInt();
		}while(T.m>=0&& T.m<60);
		
		do {
			System.out.println("detik= ");
			T.j=sc.nextInt();
		}while(T.m>=0&& T.m<60);
		
		do {
			System.out.println("jam= ");
			T.j=sc.nextInt();
		}while(T.m>=0|| T.j<24);
		
		do {
			System.out.println("menit= ");
			T.j=sc.nextInt();
		}while(T.m>=0|| T.m<60);
		
		do {
			System.out.println("detik= ");
			T.j=sc.nextInt();
		}while(T.m>=0|| T.j<60);
			
		
		
		
		
	}
}
