public class ThereAndBackAgain {
	public static void main (String [] args) {
		System.out.println ( "Here." );
		erbor();
		System.out.println ( "Back first time." );
		erbor(); 
		System.out.println ( "Back second time." );
	}
	
	public static void erbor (){
		System.out.println ( "There." );
	}
} 

/*after commenting line 6 out of the main(), the program will be able to compile and run.
However, once it reaches line 6 it cannot exicute the function call and as a result 
prints
"Here, there, back first time, back second time" 