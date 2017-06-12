package org.dimigo.collection;

import java.util.ArrayList;
import java.util.List;

public class MelonChart {
	
	public static void main(String args[]){
		List<Music> list = new ArrayList<Music>();
		
		list.add(new Music("I LUV IT", "PSY"));
		list.add(new Music("����?", "��Ͼ�"));
		System.out.println("--<<��� íƮ>>--");
		printList(list);
		
		list.add(1, new Music("SIGNAL", "Ʈ���̽�"));
		System.out.println("--<<2�� �� �߰�>>--");
		printList(list);
		
		list.set(2, new Music("�ȷ�Ʈ", "������"));
		System.out.println("--<<3�� �� ����>>--");
		printList(list);
		
		list.remove(1);
		System.out.println("--<<2�� �� ����>>--");
		printList(list);
	}

	private static void printList(List<Music> list) {
		for(Music s : list){
			System.out.println("" + (list.indexOf(s) + 1) + ". " + s);
		}
	}
}
