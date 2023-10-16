package Record;
import java.util.Scanner;
public class kelastitikdua {

		public static void main(String[] args){
			titik T= new titik();
			titik T2= new titik();
			
			Scanner sc= new Scanner (System.in);
			//TODO Auto-generated method stub
			System.out.print("x= "); T.x=sc.nextInt();
			System.out.print("y= "); T.y=sc.nextInt();
			System.out.println("titik ");
			System.out.println("x= "+T.x+","+T.y);
			
			System.out.print("x "); T2.x=sc.nextInt ();
			System.out.print("y "); T2.y=sc.nextInt ();
			System.out.println("titik ");
			System.out.println("x= "+T2.x+","+T2.y);
			
			
		}
}
