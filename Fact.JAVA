import java.util.Scanner;
class Fact {
      public static void main(String[] args) {
		Scanner nay=new Scanner(System.in);
		System.out.print("Type the no.: ");
		int no=nay.nextInt();
		int fact=1;
		for (int i=0;i<no;--no) {
			fact=fact*no;
		}
       System.out.println("The factorial is: "+fact);
      }
}
