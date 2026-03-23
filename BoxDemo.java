class Box{
	double length, width, height;
 	
}
class BoxDemo{
 public static void main(String[] args){
	Box b = new Box();
	b.length=12.0;
	b.height=24.4;
	b.width=32.4;
	System.out.println("length "+b.length);
	System.out.println("width  "+b.width);
 	System.out.println("height "+b.height);

	System.out.println("VALUME: "+b.length*b.height*b.width);
   }
}