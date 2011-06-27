import java.util.ArrayList;
import java.util.List;

class Animal{
	
}
class Dogs extends Animal{
	
}
public class Generics {
	
	 
	public static void main(String args[]){
		List<Animal> ani = new ArrayList<Animal>();
		ani.add(new Dogs());
	}
}
