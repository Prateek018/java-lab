//THis program will not compile because it would illegal to have declared the same two variables in the
// same program you cannot do that in java 
class ScopeER{
	public static void main(String args[]){
		int bar=1;
		{
			int bar=2;
		}
	}
}