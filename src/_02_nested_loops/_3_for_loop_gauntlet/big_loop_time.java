package _02_nested_loops._3_for_loop_gauntlet;

public class big_loop_time {
	int firstInt=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<101; i++) {
			System.out.print(i+",");
		}
		System.out.println("");
		for(int i=100;i>0;i--) {
			System.out.print(i+",");
		}
		System.out.println("");
		for(int i=2; i<101;i=i+2) {
			System.out.print(i+",");
		}
		System.out.println("");
		for(int i=1; i<101;i=i+2) {
			System.out.print(i+",");
		}
		System.out.println("");
		for(int i=1;i<501;i++) {
			boolean oddOrEven=false;
			if(i%2==0) {
				System.out.println(i+" is even");
			}
			else {
				System.out.println(i+" is odd");
			}
		}
		for(int i=0; i<778;i=i+7) {
			System.out.print(i+",");
			
		}
		for(int i=2005;i<2021;i++) {
			System.out.println("in "+i+" I was "+ (-2006 + i) +" years old!");
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.println(i+" " +j);
			}
		}
		for(int i=1;i<8;i=i+3) {
			for(int j=2;j<10;j+=3)
			 System.out.println(i+" "+j);
		}
	
	}

}
