package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MelonGenreChart {

	public static void main(String[] args) {
		Map<String, List<Music>> map = new HashMap<>();
		
		List<Music> Blist = new ArrayList<Music>();
		Blist.add(new Music("팔레트", "아이유"));
		
		List<Music> Dlist = new ArrayList<Music>();
		Dlist.add(new Music("I LUV IT", "PSY"));
		Dlist.add(new Music("맞지?", "언니쓰"));
		
		map.put("발라드", Blist);
		map.put("댄스", Dlist);
		
		System.out.println("--<< 멜론 장르별 챠트 >>--");
		printMap(map);
		
		Dlist.set(1, new Music("SIGNAL", "트와이스"));
		System.out.println("--<< 댄스 2위 곡 변경 >>--");
		printMap(map);
		
		Dlist.remove(0);
		System.out.println("--<< 댄스 1위 곡 삭제 >>--");
		printMap(map);
		
		map.clear();
		System.out.println("--<< 전체 리스트 삭제 >>--");
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
