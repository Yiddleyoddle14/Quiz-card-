package Flashcards;
/*
 * Ailsa Mensinger
 * 1-3-19
 */

public class Quiz_Cards {
	//set up fields / attributes of a quiz card
	private String question;
	private String answer;
	

	public Quiz_Cards(String question, String answer) {
		super();
		this.question = question;
		this.answer = answer;
	}
	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}
	
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}

	
	
}
