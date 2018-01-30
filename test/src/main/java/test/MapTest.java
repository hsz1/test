package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 在不知道map中key的值和类型时，怎样获取这个map中所有的key
 * @author Lj
 *
 */
public class MapTest {

	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("a", "1");
		map.put("b", "2");
		map.put("n", "3");
		map.put(1, 4);
		
		Iterator it = map.keySet().iterator();
		while(it.hasNext()){
			Object o = it.next();
			System.out.print(o + " ");
		}
		
		System.out.println();
		
		Iterator it2 = map.values().iterator();
		while(it2.hasNext()){
			Object o = it2.next();
			System.out.print(o + " ");
		}
		

	}

}
