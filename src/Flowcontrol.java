
public class Flowcontrol {

	public static void main(String[] args) {
		
//int a = 5, b = 3;
//if (a>b) {
//System.out.println("Inside if  block is greater than b ");

	//}else{
	//	System.out.println("a>b");
		int a = 5, b = 4, c=3, d=2, e =1;
		if(a<c) {
			System.out.println("inside if block is less than b");
		}else if (c<d) {
			System.out.println("inside first else block - is less than c");
		}else if (c<d) {
			System.out.println ("inside second block -c is less than d");
		}else {
			System.out.println("inside else block e - is least number");
		}
	}

	}

