import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        GeneralCultureQuestions gcq = new GeneralCultureQuestions();
        String[] questions = gcq.getGeneralCultureQuestions();
        test(questions);
    }
    public static void test(String[] generalCultureQuestions){
        int score = 0;
        Scanner keyboardInput = new Scanner(System.in);
        for(int i = 0; i < generalCultureQuestions.length; i++){
            String[] parts = generalCultureQuestions[i].split("\n");
            System.out.println(parts[0]);
            String correctAnswer = parts[1].substring(0, 1);
            String answer = keyboardInput.nextLine();
            if(answer.equalsIgnoreCase(correctAnswer)){
                score++;
            }
        }
        System.out.println("You got: " + score + "/" + generalCultureQuestions.length);
    }
}