class point
{
int x,y;
void setPoint( int a ,int b){
	x=a;
	y=b;
}
}

class e3 
{
	
	public static void main(String  args [ ]){
	point p1=new point( );
	point p2=new point( );
	p1.setPoint(15,20);
	p2.setPoint(0,0);
	System.out.println(" x  "+p1.x);
	System.out.println(" y  "+p1.y);
	System.out.println(" x  "+p2.x);
	System.out.println(" y  "+p2.y);
	}
}
	
	 