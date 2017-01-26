import java.util.Scanner;

public class DictionaryOrder {
	public static void main (String [] args) {
		Scanner keyboard = new Scanner (System.in);
		String name ;

		System.out.print ( "Make up the name of a programming language! " );
		name = keyboard.nextLine();

		if (name.compareTo ( "c++" ) < 0 )
			System.out.println ( name + " comes BEFORE c++ " );
		if (name.compareTo ( "c++ ") ==0 )
			System.out.println ( " c++ isn't a made-up language!" );
		if ( name.compareTo( "c++" ) > 0 )
			System.out.println( name + " Comes AFTER c++" );

		if (name.compareTo ( "go" ) < 0 )
			System.out.println (name + " comes BEFORE go " );
		if (name.compareTo ( "go" ) == 0 )
			System.out.println ( "go isn't a made-up langauage! " );
		if (name.compareTo ( "go ") > 0 )
			System.out.println ( name + " Comes AFTER go " );

		if (name.compareTo ( "java" ) < 0 ) 
			System.out.println (name + " comes BEFORE java " );
		if (name.compareTo ( "java" ) == 0 )
			System.out.println ("java isn't a made-up langauge! " );
		if (name.compareTo ( "java" ) > 0 )
			System.out.println ( name + "comes AFTER java " );

		if (name.compareTo ( "lisp" ) < 0 )
			System.out.println (name + " comes BEFORE lisp " );
		if (name.compareTo ( "lisp" ) == 0 )
			System.out.println ( " lisp isn't a made-up langauge! " );
		if (name.compareTo ( "lisp" ) > 0 ) 
			System.out.println ( name + " comes AFTER list " );

		if (name.compareTo ( "python" ) < 0 )
			System.out.println ( name + " comes BEFORE python " );
		if (name.compareTo ( "python" ) == 0 )
			System.out.println ( " python isn't a made-up langauge! " );
		if (name.compareTo( "python" ) > 0 )
			System.out.println ( name + " comes AFTER python " );

		if (name.compareTo( "ruby" ) < 0 )
			System.out.println ( name + " comes BEFORE ruby " );
		if (name.compareTo ( "ruby") == 0 )
			System.out.println ( " ruby isn't a made-up langauge! " );
		if (name.compareTo( "ruby") > 0 )
			System.out.println ( name + " comes AFTER ruby " );

		if (name.compareTo( "visual basic") < 0 )
			System.out.println ( name + " comes BEFORE visual basic " );
		if (name.compareTo( "visual basic") == 0 )
			System.out.println ( " visual basic isn't a made-up langauge " );
		if (name.compareTo( "visual basic") > 0 )
			System.out.println ( name + " comes AFTER visual basic " );
	}
}