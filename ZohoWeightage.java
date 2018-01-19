import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

/**
 * 
 */

/**
 * @author balajim
 *
 */
public class Weightage {
	public static void main(String[] args) {
		int[] a= {10,36,81,24};
		Map<Integer,Integer> map=new TreeMap<>();
		for (int i : a) {
			map.put(i, calculateWeight(i));
		}
		ValueComparator vc=new ValueComparator(map);
		Map<Integer, Integer> sm= new TreeMap<>(vc);
		sm.putAll(map);
		System.out.println(sm);


	}
	public static int calculateWeight(int num) {
		int weight=0;
		if(isPerfectSquare(num))
			weight=weight+5;
		if(divisibleBy6AndMultiplyBy4(num))
			weight=weight+4;
		if(isEven(num))
			weight=weight+3;
		return weight;
	}
	public static boolean isPerfectSquare(int num) {
		int root=(int) Math.sqrt(num);
		return ((root)*(root)==num);
	}

	public static boolean divisibleBy6AndMultiplyBy4(int num) {
		return ((num%4==0) && (num%6)==0);	
	}

	public static boolean isEven(int num) {
		return ((num&1)==0);
	}

}
class ValueComparator implements Comparator<Integer>{
	Map<Integer, Integer> base;

	public ValueComparator(Map<Integer, Integer> base) {
		this.base = base;
	}
	@Override
	public int compare(Integer o1, Integer o2) {
		if (base.get(o1) <= base.get(o2)) {
			return -1;
		} else {
			return 1;
		}
	} 
}

