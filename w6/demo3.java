class demo3 {
	public static void main(String [ ] args){
		int i=0;
		String  greetings[]={"Hello Twinkle", "Hello java", "Hello world"};
	
		while(i<4){
			try{
			System.out.println(greetings [i]);
			i++;
			}
			catch(Exception e){
				System.out.println(e.toString());
			}
			finally{
				System.out.println("hi !");
				if(i<3);
			else {
				System.out.println("you should quit and rest index value");
			break;}
			}
			}  
		}
	} 
