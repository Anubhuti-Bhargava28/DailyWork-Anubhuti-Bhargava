package com.cts.task.thread.tennis;;
public class GameStart {
	

		public static void main(String[] args) {
			Thread.currentThread().setPriority(Thread.MAX_PRIORITY - 2);
			
			PlayerOne threadOne = new PlayerOne(); // New Born State
			PlayerTwo threadTwo = new PlayerTwo();
			Thread t1 = new Thread(threadOne);
			Thread t2 = new Thread(threadTwo);
			
			t1.start();
			
			t2.start(); // ready state

			

		}

	}
