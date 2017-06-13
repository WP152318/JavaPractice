package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MelonGenreChart {

	public static void main(String[] args) {
		Map<String, List<Music>> map = new HashMap<>();
		
		List<Music> Blist = new ArrayList<Music>();
		Blist.add(new Music("�ȷ�Ʈ", "������"));
		
		List<Music> Dlist = new ArrayList<Music>();
		Dlist.add(new Music("I LUV IT", "PSY"));
		Dlist.add(new Music("����?", "��Ͼ�"));
		
		map.put("�߶��", Blist);
		map.put("��", Dlist);
		
		System.out.println("--<< ��� �帣�� íƮ >>--");
		printMap(map);
		
		Dlist.set(1, new Music("SIGNAL", "Ʈ���̽�"));
		System.out.println("--<< �� 2�� �� ���� >>--");
		printMap(map);
		
		Dlist.remove(0);
		System.out.println("--<< �� 1�� �� ���� >>--");
		printMap(map);
		
		map.clear();
		System.out.println("--<< ��ü ����Ʈ ���� >>--");
		printMap(map);

	}

	public static void printMap(Map<String, List<Music>> map) {
		for(String key : map.keySet()){
			System.out.println("[" + key + "]");
			for(Music s : map.get(key)){
				System.out.println("" + (map.get(key).indexOf(s) + 1) + ". " + s);
			}
		}
		System.out.println();
	}

}
