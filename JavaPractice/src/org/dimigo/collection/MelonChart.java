package org.dimigo.collection;

import java.util.ArrayList;
import java.util.List;

public class MelonChart {
	
	public static void main(String args[]){
		List<Music> list = new ArrayList<Music>();
		
		list.add(new Music("I LUV IT", "PSY"));
		list.add(new Music("맞지?", "언니쓰"));
		System.out.println("--<<멜론 챠트>>--");
		printList(list);
		
		list.add(1, new Music("SIGNAL", "트와이스"));
		System.out.println("--<<2위 곡 추가>>--");
		printList(list);
		
		list.set(2, new Music("팔레트", "아이유"));
		System.out.println("--<<3위 곡 변경>>--");
		printList(list);
		
		list.remove(1);
		System.out.println("--<<2위 곡 삭제>>--");
		printList(list);
	}

	private static void printList(List<Music> list) {
		for(Music s : list){
			System.out.println("" + (list.indexOf(s) + 1) + ". " + s);
		}
	}
}
