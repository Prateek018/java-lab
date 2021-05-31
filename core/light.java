class light{
	public static void main(String args[]){
		int lightspeed;
		long d;
		long seconds;
		long distance;
		lightspeed = 186000;
		d=1000;
		seconds = d *24*60*60;
		distance=lightspeed*seconds;
		System.out.println("in" + d);
		System.out.println("days light will travel about");
		System.out.println("miles" +distance);
	}
}