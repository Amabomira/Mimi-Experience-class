package switchcase;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // int bonus = 12000;
		  
		  //switch(bonus) {
		  //case 12000:
		   //System.out.println("Testlead");
		  // break;
		 // case 8000:
			//  System.out.println("QA Engineer");
			 // break;
		  //case 4000:
			//  System.out.println("Senior engineer");
			
		String employeetitle = "testlead";
			  
			switch ("employeetitle") {
	    case "testlead":
	    	System.out.println(12000);
	    	break;
	    case "QA Engineer":
	    	System.out.println(12000);
	    	break;
	    case "Senior engineer":
	    	System.out.println(12000);
	    	break;
	    	default:
	    		System.out.println("position not available");
	    }
			
		}

	}
	  

