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
		
		private static int winDays = 0;
		private static int lostDays = 0;
		private static int looseStatus[] = new int [  MONTHLY_STACK ];
		private static int winStatus[] = new int [  MONTHLY_STACK ];
		public static void gameStatus() {
			System.out.println("The Stake per day is: " +STACK_PER_DAY);
			System.out.println("The Bet per game is: " +BET_PER_GAME);
			
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
				if(playStatus == LOOSE) {
					looseStack += 1;
				}else {
					winStack += 1;
				}
				if(winStack == STACK_PER_DAY / 2) {
					winDays ++;
					break;
				}
				if(looseStack == STACK_PER_DAY / 2) {
					lostDays ++;
					break;
				}
			}
			
			winningAmount_PerDay[i] = winStack;
			loosingAmount_PerDay[i] = looseStack;
			
			
			//System.out.println("Winnig Stack on Day"+(i+1)+" :  " +winStack);
			//System.out.println("Loosing Stack on Day "+(i+1)+" : " +looseStack);
			System.out.println("Winning Amount"+winningAmount_PerDay[i]);
			System.out.println("Loosing Amount"+loosingAmount_PerDay[i]);
			
			
			System.out.println("------------------------");
			
			}
				System.out.println("Wining days in month "+winDays);
				System.out.println("Loosing days in month "+lostDays);
				
				int luckiestDay = winStatus[0];
				int unluckiestDay = looseStatus[0];
				
				
				for(int i = 1; i < MONTHLY_STACK; i++) {
					winStatus[i] = winningAmount_PerDay[i] - loosingAmount_PerDay[i];
					if(winStatus[i] > luckiestDay) {
						luckiestDay = winStatus[i];
					}
					looseStatus[i] = loosingAmount_PerDay[i] - winningAmount_PerDay[i];
					if(looseStatus[i] > unluckiestDay) {
						unluckiestDay = looseStatus[i];
					}
				}
				System.out.println("Luckiest Day = "+luckiestDay);
				System.out.println("Unlckiest Day = "+unluckiestDay);
		}
		public static void main(String[] args) {
			System.out.println("Welcome to Gambling Simulation Problem developed by Mohammad Husain");
			gamePlay();
			
			

		}
}


