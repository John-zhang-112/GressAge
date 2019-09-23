import java.util.Scanner;
/*

*/
public class GuessAge{
	public static void main(String[] args){
		 
		 Scanner scan = new Scanner(System.in);
		 
		 System.out.println("请输入你姐姐的年龄：");
		 
		 int age = scan.nexrInt();
		 
		 int check = age/18;
		 
		 switch(check){
		    case 0:
			   System.out.println("小姐姐")；
			   break;
			
			case 1:
			   System.out.println("大姐姐")；
			   break;
			   
			default:
			     System.out.println("请再试一次");
			
		 }
	}
	
	
}