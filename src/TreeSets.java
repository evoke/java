import java.util.Set;
import java.util.TreeSet;


public class TreeSets {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int index=1;
		int [][] dd = {{9,8,7},{6,5,4},{3,2,1,0}};
		System.out.println(dd[index++][index++]+ " "+index);
		//System.out.print(args[0]);
		Set<Integer> ints = new TreeSet<Integer>();
		ints.add(10);
		ints.add(5);
		ints.add(-3);
		ints.add(-1);
		
		for(int q: ints)
		{
			System.out.println(q);
		}
	}

}
