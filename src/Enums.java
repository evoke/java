
public class Enums {

	
	enum Days {M,T,W,TH,F,SA,SU};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Days d1 = Days.TH;
		Days d2 = Days.M;
		
		for(Days d : Days.values()){
			if(d.equals(Days.F)) break;
			d2=d;
		}
		System.out.println((d1==d2)? "same old":"newly new");
		
		int count=0;
		int mask=0;
		if(((5<7)||(++count < 10)) | mask++ < 10) {
			System.out.println(count +" "+mask);
		}
		if ( (6>8) ^ false){
			++mask;
			System.out.println(count +" "+mask);
		}
	}

}
