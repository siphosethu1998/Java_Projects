/*
	This program simulates the operation of an I/O buffer using a linked queue data structure
	Author: Siphosethu Shumani
	DAte : 15 March 2022
*/

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Question1 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Queue<String> queue = new LinkedList<String>();

		String line = input.nextLine();

		while(!line.equals("X")){

			if(line.equals("O")) {
				if(queue.isEmpty()) System.out.printf("Buffer empty %n");
				else System.out.printf("Data: %s %n",queue.peek());
				queue.poll();	
			} else {
				queue.offer(line);	
			}

			line = input.nextLine();

		}
	}
}
