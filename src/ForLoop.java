
public class ForLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		for(int i =0;i<=3;i++){
			System.out.println(i);
		}
		System.out.println("-------");
		for(int i =0;i<3;i++){
			System.out.println(i);
		}
		System.out.println("-------");
		for(int i =0;++i<3;++i){
			System.out.println(i);
		}
		System.out.println("-------");
		for(int i =0;i<0;++i){
			System.out.println(i);
		}
		System.out.println("-------");
		
		String stuff= "martin";
		stuff= stuff.concat("me");
		System.out.println(stuff);
	}

}
