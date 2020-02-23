package Presentation;

import java.util.Scanner;

import Domain.Quiz;

public class Main {
	static Scanner choixMenu = new Scanner(System.in);
	static Quiz laq = new Quiz();
	static int i = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		laq.ajoutDesQuestion();
		
		menu();
		
	}
	
	
	static private void menu() {
		// TODO Auto-generated method stub
		if(i == 1) {
			System.out.println("1- Commencer le Jeux");
			System.out.println("2- Voir Mon Score");
			System.out.println("3- Quitter le Jeux");
			int clv = choixMenu.nextInt();
			
			if(clv <= 3 ) {
				validationChoix(clv);
			}else {
				System.out.println("Veuillez Saisir un Choix...");
				menu();
			}
		}else {
			laq.creationJoueur();
			i++;
		}
		
		
		
		System.out.println("1- Commencer le Jeux");
		System.out.println("2- Voir Mon Score");
		System.out.println("3- Quitter le Jeux");
		int clv = choixMenu.nextInt();
		
		if(clv <= 3 ) {
			validationChoix(clv);
		}else {
			System.out.println("Veuillez Saisir un Choix...");
			menu();
		}
		
	}
	
	
	public static void commencerLeJeux() {
		for (int i = 0; i < 5; i++) {
			laq.choixDeQuestion();
		}
	
		System.err.println("Le Jeux est Terminé...");
		menu();
		
	}
	
	
	public static void validationChoix(int choix) {
		switch(choix){
		case 1 :
			System.out.println("Vous Aurez 5 Question Soyez Prêt !!! ");
			commencerLeJeux();
			break;
		case 2 :
			voirLeScore();
			break;
		case 3 :
			
		}
	}
	
	
	public static void voirLeScore() {
		System.out.println("Voici ton Score" + " " + laq.getScore() + " " + "/50");
	}

}
