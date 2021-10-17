package com.phoenix.stacks;

import java.util.ArrayDeque;

public class NumStarrayDequeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<Integer> stack = new ArrayDeque<Integer>();
		stack.addLast(40);
		stack.addLast(20);
		stack.addLast(70);
		stack.addLast(10);
		stack.addLast(80);
		
		System.out.println("Top of Stack : " + stack.peekLast());
		
		System.out.println("Pop the Top : " + stack.pollLast());
		
		System.out.println("Top of Stack : " + stack.peekLast());
		
		while(!stack.isEmpty()) {
			System.out.println("Pop the Top : " + stack.pollLast());
		}
	}

}
