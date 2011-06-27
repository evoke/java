class Top{
	{
		System.out.println("T");
	}
	public Top(){
		System.out.println("TConstructor");
	}
}

class middle extends Top{
	{
		System.out.println("m");
	}
	public middle(){
		System.out.println("mConstructor");
	}
}

public class blocks extends middle{

	{
		System.out.println("b");
	}
	public blocks(){
		System.out.println("BContstructor");
	}
	public static void main(String[] args) {
		new blocks();

	}

}
