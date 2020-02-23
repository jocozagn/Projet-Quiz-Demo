package Domain;

import java.util.Random;

public class Question {
	private String laQuestion;
	private String laReponse;
	private int score;

	// DEBUT GETTER ET SETTERS

	public Question(Question questionReponse) {
		this.laReponse = questionReponse.getLaReponse();
		this.laQuestion = questionReponse.getLaQuestion();
		this.score = questionReponse.getScore();
	}

	public Question() {
		// TODO Auto-generated constructor stub
	}

	public String getLaQuestion() {
		return laQuestion;
	}

	public void setLaQuestion(String laQuestion) {
		this.laQuestion = laQuestion;
	}

	public String getLaReponse() {
		return laReponse;
	}

	public void setLaReponse(String laReponse) {
		this.laReponse = laReponse;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	// FIN GETTER AND SETTERS

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return laQuestion;
	}
	
	public int choixQuestion() {
		// TODO Auto-generated method stub
		Random alea = new Random();
		int chiffre = alea.nextInt(9);
		return chiffre;
		
	}
}
