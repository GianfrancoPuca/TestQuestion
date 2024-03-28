public class HistoricalQuestions {
    public String question;
    public String answer;
    public HistoricalQuestions(){
        super();
    }

    public HistoricalQuestions(String question, String answer) {
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
