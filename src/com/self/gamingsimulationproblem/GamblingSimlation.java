package com.self.gamingsimulationproblem;

import java.util.Random;
public class GamblingSimlation {


		private static final int STACK_PER_DAY = 100;
		private static final int BET_PER_GAME = 1;
		private static final int WIN = 1;
		private static final int LOOSE = 0;
		
		private static int winStack = 0;
		private static int looseStack = 0;
		
		public static void gameStatus() {
			System.out.println("The Stake per day is: " +STACK_PER_DAY);
			System.out.println("The Bet per game is: " +BET_PER_GAME);
			System.out.println("Wining Stack"+winStack);
			System.out.println("Loosint Stack"+looseStack);
			System.out.println("----------------------------");
		}
		
		public static void gamePlay() {
			
			while(true) {
				gameStatus();
				Random random = new Random();
				int playStatus = random.nextInt(9)%2;
				if(playStatus == LOOSE) {
					looseStack += 1;
				}else {
					winStack += 1;
				}
				if(winStack == STACK_PER_DAY / 2) {
					break;
				}
				if(looseStack == STACK_PER_DAY / 2) {
					break;
				}
			}
			
		}
		public static void main(String[] args) {
			System.out.println("Welcome to Gambling Simulation Problem developed by Mohammad Husain");
			gamePlay();
			

		}
}


