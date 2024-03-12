package com.self.gamingsimulationproblem;

import java.util.Random;
public class GamblingSimlation {


		private static final int STACK_PER_DAY = 100;
		private static final int BET_PER_GAME = 1;
		private static final int WIN = 1;
		private static final int LOOSE = 0;
		
		private static final int MONTHLY_STACK = 20; 
		
		private static int[] winningAmount_PerDay = new int[20];
		private static int[] loosingAmount_PerDay = new int [20];
		
		public static void gameStatus() {
			System.out.println("The Stake per day is: " +STACK_PER_DAY);
			System.out.println("The Bet per game is: " +BET_PER_GAME);
			//System.out.println("The Bet per game is: " +LOOSE);
		}
		
		public static void gamePlay() {
			
			
		for(int i =0; i < MONTHLY_STACK; i++) 
		{
			
			System.out.println("Day = "+(i+1));
			gameStatus();
			int winStack = 0;
			int looseStack = 0;
			while(true) {
				
				Random random = new Random();
				int playStatus = random.nextInt(9)%2;
				if(playStatus != WIN) {
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
				if(winStack == 50) {
					break;
				}
				if(looseStack == 50) {
					break;
				}
			}
			
			winningAmount_PerDay[i] = winStack;
			loosingAmount_PerDay[i] = looseStack;
			
			
			System.out.println("Winnig Stack "+(i+1)+" :  " +winStack);
			System.out.println("Loosing Stack "+(i+1)+" : " +looseStack);	
			System.out.println("------------------------");
			
			}
		}
		public static void main(String[] args) {
			System.out.println("Welcome to Gambling Simulation Problem developed by Mohammad Husain");
			gamePlay();
			
			

		}
}


