import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String q1 = "Di che colore era il cavallo bianco di Napoleone?\n" + "(a)Bianco\n(b)Verde\n(c)Nero\n(d)Rosso\n";
        String q2 = "Di che colore è la mela?\n" + "(a)Bianco\n(b)Verde\n(c)Nero\n(d)Rosso\n";
        Question[] questions = {new Question(q1, "a"), new Question(q2, "d")};
        test(questions);
    }
    public static void test(Question[] questions){
        int score = 0;
        Scanner keyboardInput = new Scanner(System.in);
        for(int i = 0; i < questions.length; i++){
            System.out.println(questions[i].getQuestion());
            String answer = keyboardInput.nextLine();
            if(answer.equals(questions[i].getAnswer())){
                score++;
            }
        }
        System.out.println("You got: " + score + "/" + questions.length);
    }
}