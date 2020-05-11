
public class Question {
	private String question;
	private boolean dailyDouble;
	
	public Question() {
		super();
		this.question = "";
		this.dailyDouble = false;
	}
	
	public Question(String question) {
		super();
		this.question = question;
	}
	
	public Question(String question, boolean dailyDouble) {
		super();
		this.question = question;
		this.dailyDouble = dailyDouble;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public boolean isDailyDouble() {
		return dailyDouble;
	}

	public void setDailyDouble(boolean dailyDouble) {
		this.dailyDouble = dailyDouble;
	}
	
}
