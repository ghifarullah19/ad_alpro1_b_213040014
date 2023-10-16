package Record;
import java.util.Scanner;
public class kelolatitik {
	public static void main(String[] args) {
		titik T= new titik();
		
		Scanner sc= new Scanner (System.in);
		// TODO Auto-generated method sturb
		System.out.print("x= "); T.x=sc.nextInt();
		System.out.print("y= "); T.y=sc.nextInt();
		
		System.out.println("x= "+T.x+","+T.y);
	}
}
