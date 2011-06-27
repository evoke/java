


public class Interview {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Interview().strings();
		//strings();
		//this.strings();
	}
	public void strings(){
		String s1 ="foo";
		String s2 ="foo";
		String s4 = new String("object reference");
		if(s1==s2){
			System.out.println("true?");
		}
		if(s1.equals(s2)){
			System.out.println("why");
		}
		String s3 = new String(s1);
		System.out.println(s3);
		
		String s5 = new String(s4);
		System.out.println(s5);
	}
}
