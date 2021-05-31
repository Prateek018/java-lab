package Mypack;
class Balance{
	String name;
	double bal;

	Balance(String  n, double b){
		name=n;
		bal=b;
	}
	void show(){
		if(bal<0)
		System.out.print("-->");
		System.out.println(name +":$"+bal);
	}
}
class Accountbalance{
	public static void main(String args[]){
		Balance current[]=new Balance[3];

		current[0]=new Balance("prateek",123.23);
		current[1]=new Balance("pranjal",157.33);
		current[2]=new Balance("raghav",-34.23);

		for(int i=0;i<3;i++) current[i].show();
	}
}