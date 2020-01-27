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
		hs.put("name", "����");
		hs.put("sex", "��");
		hs.put("age", "30");
		hs.put("home", "�ӱ�");

		// �����Ƿ�����ؼ���"name"
		System.out.println(hs.containsKey("name"));// ����true
		System.out.println(hs.get("name"));// ���� ����
		System.out.println(hs.entrySet());// ���� [home=�ӱ�, sex=��, age=30,
											// name=����]
		System.out.println(hs.hashCode()); // ����7960688
		System.out.println(hs.keySet()); // ���� [home, sex, age, name]

		// 1 ����entrySet().���÷�
		Iterator it = hs.entrySet().iterator();// ��������
		System.out.println("\n����entrySet().���÷�");
		while (it.hasNext()) {
			System.out.print(it.next() + "\t");
		}

		// 2 Set keySet()���عؼ��ָ�ֵ�ļ���
		it = hs.keySet().iterator();
		System.out.println("\n\nSet keySet()���عؼ��ָ�ֵ�ļ���");
		while (it.hasNext()) {
			System.out.print(hs.get(it.next()) + "\t");
		}

		// 3 ���� values()���÷�
		it = hs.values().iterator();
		System.out.println("\n\n����  values()���÷�");
		while (it.hasNext()) {
			System.out.print(it.next() + "\t");
		}

	}

}
