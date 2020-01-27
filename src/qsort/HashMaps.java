package qsort;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Hashtable;
import java.util.TreeMap;

public class HashMaps {
	public static void main(String[] args) {
		HashMap hs = new HashMap();
		hs.put("name", "张三");
		hs.put("sex", "男");
		hs.put("age", "30");
		hs.put("home", "河北");

		// 测试是否包含关键字"name"
		System.out.println(hs.containsKey("name"));// 返回true
		System.out.println(hs.get("name"));// 返回 张三
		System.out.println(hs.entrySet());// 返回 [home=河北, sex=男, age=30,
											// name=张三]
		System.out.println(hs.hashCode()); // 返回7960688
		System.out.println(hs.keySet()); // 返回 [home, sex, age, name]

		// 1 测试entrySet().的用法
		Iterator it = hs.entrySet().iterator();// 迭代程序
		System.out.println("\n测试entrySet().的用法");
		while (it.hasNext()) {
			System.out.print(it.next() + "\t");
		}

		// 2 Set keySet()返回关键字各值的集合
		it = hs.keySet().iterator();
		System.out.println("\n\nSet keySet()返回关键字各值的集合");
		while (it.hasNext()) {
			System.out.print(hs.get(it.next()) + "\t");
		}

		// 3 测试 values()的用法
		it = hs.values().iterator();
		System.out.println("\n\n测试  values()的用法");
		while (it.hasNext()) {
			System.out.print(it.next() + "\t");
		}

	}

}
