package Domain;

import java.util.Scanner;

public class Quiz extends LeJoueur {
	Question questionReponse = new Question();
	Question[] lesQuestions = new Question[11];
	Scanner laReponse = new Scanner(System.in);
	Scanner clv = new Scanner(System.in);
	LeJoueur unJoueur;

	public void ajoutDesQuestion() {
		// TODO Auto-generated method stub
		questionReponse.setLaQuestion("Quel est la Capital de la Guinée?");
		questionReponse.setLaReponse("Conakry");
		questionReponse.setScore(10);
		lesQuestions[0] = new Question(questionReponse);

		questionReponse.setLaQuestion("Qui est le President de la Guinée?");
		questionReponse.setLaReponse("Alpha Condé");
		questionReponse.setScore(10);
		lesQuestions[1] = new Question(questionReponse);
		
		questionReponse.setLaQuestion("Qui est le Nom de ma Societé ?");
		questionReponse.setLaReponse("Satina Technologie");
		questionReponse.setScore(10);
		lesQuestions[2] = new Question(questionReponse);
		
		questionReponse.setLaQuestion("Qui est le Meilleur Formateur JAVA ?");
		questionReponse.setLaReponse("Otman");
		questionReponse.setScore(10);
		lesQuestions[3] = new Question(questionReponse);
		
		
		questionReponse.setLaQuestion("Qui est le Meilleur Codeur de la Classe ?");
		questionReponse.setLaReponse("Mamadou Saliou Diallo");
		questionReponse.setScore(10);
		lesQuestions[4] = new Question(questionReponse);
		
		questionReponse.setLaQuestion("Qui est le Premier Ministre de la Guinée?");
		questionReponse.setLaReponse("Kassory Fofana");
		questionReponse.setScore(10);
		lesQuestions[5] = new Question(questionReponse);
		
		questionReponse.setLaQuestion("Qui est le nom l'entité qui Grève tout le temps?");
		questionReponse.setLaReponse("FNDC");
		questionReponse.setScore(10);
		lesQuestions[6] = new Question(questionReponse);
		
		questionReponse.setLaQuestion("Qui est le Directeur Général de Satina Technologie ?");
		questionReponse.setLaReponse("Souleymane Diallo");
		questionReponse.setScore(10);
		lesQuestions[7] = new Question(questionReponse);
		
		questionReponse.setLaQuestion("Qui est le plus Gentil de la Classe ?");
		questionReponse.setLaReponse("Souleymane Bah");
		questionReponse.setScore(10);
		lesQuestions[8] = new Question(questionReponse);
		
		questionReponse.setLaQuestion("Qui est le Nouveau Marié de la classe ?");
		questionReponse.setLaReponse("Nouhou Souaré");
		questionReponse.setScore(10);
		lesQuestions[9] = new Question(questionReponse);
		
		questionReponse.setLaQuestion("Quel est le Meilleur language Informatique ?");
		questionReponse.setLaReponse("Java");
		questionReponse.setScore(10);
		lesQuestions[10] = new Question(questionReponse);
	}
	
	public void choixDeQuestion() {
		int choix = questionReponse.choixQuestion();
		System.out.println(lesQuestions[choix]);
		String reponseTemporaire = laReponse.nextLine();
		verificationDeReponse(reponseTemporaire,lesQuestions[choix].getLaReponse());
		
		
	}
	
	public void verificationDeReponse(String reponse, String reponseAlaQuestion) {
		
		//System.out.println(reponse);
		
		if(reponse.equals(reponseAlaQuestion) == true) {
			System.out.println("Vous avez trouvé");
			super.ajoutScore();
		}else {
			System.err.println("Pas Trouvé...");
			System.out.println("Desormais la Reponse est : " + " ' " + reponseAlaQuestion + " ' ");
		}
		
	}
	
	public void creationJoueur() {
		System.out.println("Quel est votre nom ?");
		String nom = clv.next();
		System.out.println("Quel est votre Prenom ?");
		String prenom = clv.next();
		
		unJoueur = new LeJoueur(nom,prenom,0);
	}
}
