public class HeronsFormulaNoFunctionSD {
	public static void main (String[] args) {
		int a, b, c;
		double s, A;

		a = 3;
		b = 3;
		c = 3;
		s = (a+b+c) / 2.0;
		A = Math.sqrt( s*(s-a)*(s-b)*(s-c) );
		System.out.println("A triangle with sides 3,3,3 has area " + A );

		a = 3;
		b = 4;
		c = 5;
		s = (a+b+c) /2.0;
		A = Math.sqrt ( s*(s-a)*(s-b)*(s-c) );
		System.out.println("A triangle with sides 3,4,5 has area " + A );

		a = 7;
		b = 8;
		c = 9;
		s = (a+b+c) /2.0;
		A = Math.sqrt ( s*(s-a)*(s-b)*(s-c) );
		System.out.println("A triangle with sides 7,8,9 has area " + A );

		a = 5;
		b = 12;
		c = 13;
		s = (a+b+c) /2.0;
		A = Math.sqrt ( s*(s-a)*(s-b)*(s-c) );
		System.out.println("A triangle with sides 5,12,13 has area " + A );

		a = 10;
		b = 9;
		c = 11;
		s = (a+b+c) /2.0;
		A = Math.sqrt ( s*(s-a)*(s-b)*(s-c) );
		System.out.println("A triangle with sides 10,9,11 has area " + A );

		a = 8;
		b = 15;
		c = 17;
		s = (a+b+c) /2.0;
		A = Math.sqrt ( s*(s-a)*(s-b)*(s-c) );
		System.out.println("A triangle with sides 8,15,17 has area " + A );

		a = 9; 
		b = 9;
		c = 9;
		s = (a+b+c) /2.0;
		A = Math.sqrt ( s*(s-a)*(s-b)*(s-c) );
		System.out.println("A triangle with sides 9,9,9 has area "  + A );

	}
}

/*Study Drill #1: The version of this code that is written with functions is considerably shorter and 
much much simpler and far less tedious to write. Why anyone would choose to code this 
particular program (and any others like it) without using the function command is beyond me*/

/*Study Drill #2: It woul have been much more efficent to change this particular aspect of the code
in the version of the program using function commands stricly due to the number of lines 
that, "(a+b+c) / 2" need to be modified. In this version there are 6 lines that needed to be 
modified, where as in the version using function commands there is only one*/

/*Study Drill #3: In this particular instance, it was actually less timely and more straight forward to add the code in this version
as opposed to the version using function commands. I rescind my earlier comment trashing non function code. */