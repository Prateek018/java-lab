/*class Bitlogic{
	public static void main(String args[]){
		String binary[]={
			"0000","0001","0010","0011","0100","0101","0110","0111",
			"1000","1001","1010","1011","1100","1101","1110","1111",
		};
		int a=3;
		int b=6;
		int c=a|b;
		int d=a&b;
		int e=a^b;
		int f=(~a & b)|(a &~b);
		int g= ~a & 0x0f;

		System.out.println("	    a =" + binary[a]);
		System.out.println("	    b =" + binary[b]);
		System.out.println("      a|b =" + binary[c]);
		System.out.println("      a&b =" + binary[d]);
		System.out.println("      a^b =" + binary[e]);
		System.out.println("~a&b|a&~b =" + binary[f]);
		System.out.println("       ~a =" + binary[g]);
	}
}*/

// Left Shifting a byte value

/*class Bitlogic{
	public static void main(String args[]){
		byte a=64, b;
		int i;
		 i=a<<2;
		 b=(byte) (a << 2);

		 System.out.println("Original value of a: " + a);
		 System.out.println("i and b: " + i + " " + b);
	}
}*/

//left shifting as a quick way to multiply by 2.

class Bitlogic{
	public static void main(String args[]){
		int i;
		int num=0xFFFFFFE;

		for(i=0;i<4;i++){
			num = num<<1;
			System.out.println(num);
		}
	}
}