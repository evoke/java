
public class Alltypes {
	
	class Base{}
	class Sub extends Base{}
	class sub2 extends Base{
		Base b = new Base();
		Sub a = (Sub)b;
	}

}
