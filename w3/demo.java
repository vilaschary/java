class demo{
public static void main(String args[]) throws java.io.IOException{

char choice;
do {
	System.out.println("Help on:");
	System.out.println("1. if:");
	System.out.println("2. switch:");
	System.out.println("3. while");
	System.out.println("4. do while");
	System.out.println("5. f or/n");
	System.out.println("Choose one");
	choice =(char) System.in.read();
} while(  choice < '1' || choice >'5');
	System.out.println("\n");
	switch(choice) {
		case '1':
			System.out.println("The if:\n");
			System.out.println("if(condtion) statement");
			break ;
			case '2':
		System.out.println("the switch;\n");
	    System.out.println("switch(expression) {");
	    System.out.println("case constant :");
	    System.out.println("Statement sequence");
	    System.out.println("break:" );
	    System.out.println("//...");
		System.out.println("}");
		break ;
		case '3':
		System.out.println("the while:\n" );
	    System.out.println("whiel(Condtion)");
		
		break ;
		case '4':
		System.out.println("To do while:\n" );
	    System.out.println("do {");
		System.out.println("Statement;");
		System.out.println("} while condition ");
		break ;
		case '5':
		System.out.println("the for:\n" );
	    System.out.print("for (init; condtion )");
		System.out.println("Statement;");
		break ;
	}  
}
}