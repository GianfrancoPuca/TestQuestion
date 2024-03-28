import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String q1 = "What is the capital city of Australia?\n" +
                "(a) Sydney\n" +
                "(b) Canberra\n" +
                "(c) Melbourne\n" +
                "(d) Perth\n";

        String q2 = "Who wrote the famous novel 'To Kill a Mockingbird'?\n" +
                "(a) Harper Lee\n" +
                "(b) Ernest Hemingway\n" +
                "(c) Mark Twain\n" +
                "(d) F. Scott Fitzgerald\n";

        String q3 = "What is the chemical symbol for water?\n" +
                "(a) O\n" +
                "(b) W\n" +
                "(c) H2O\n" +
                "(d) H2\n";

        String q4 = "What is the largest organ in the human body?\n" +
                "(a) Heart\n" +
                "(b) Liver\n" +
                "(c) Skin\n" +
                "(d) Brain\n";

        String q5 = "Which planet is known as the 'Red Planet'?\n" +
                "(a) Venus\n" +
                "(b) Mars\n" +
                "(c) Jupiter\n" +
                "(d) Saturn\n";

        String q6 = "Who painted the famous artwork 'The Mona Lisa'?\n" +
                "(a) Leonardo da Vinci\n" +
                "(b) Vincent van Gogh\n" +
                "(c) Pablo Picasso\n" +
                "(d) Michelangelo\n";

        String q7 = "Which country is home to the world's tallest mountain, Mount Everest?\n" +
                "(a) Nepal\n" +
                "(b) China\n" +
                "(c) India\n" +
                "(d) Tibet\n";

        String q8 = "What is the currency of Japan?\n" +
                "(a) Yen\n" +
                "(b) Yuan\n" +
                "(c) Euro\n" +
                "(d) Dollar\n";

        String q9 = "Who was the first person to step foot on the moon?\n" +
                "(a) Neil Armstrong\n" +
                "(b) Buzz Aldrin\n" +
                "(c) Yuri Gagarin\n" +
                "(d) Alan Shepard\n";

        String q10 = "In which year did World War II end?\n" +
                "(a) 1943\n" +
                "(b) 1945\n" +
                "(c) 1950\n" +
                "(d) 1939\n";


        GeneralCultureQuestions[] questions = {new GeneralCultureQuestions(q1, "b"), new GeneralCultureQuestions(q2, "a"), new GeneralCultureQuestions(q3, "c"), new GeneralCultureQuestions(q4, "c"),
        new GeneralCultureQuestions(q5, "b"), new GeneralCultureQuestions(q6, "a"), new GeneralCultureQuestions(q7, "a"), new GeneralCultureQuestions(q8, "a"), new GeneralCultureQuestions(q9, "a"), new GeneralCultureQuestions(q10, "b")};
        test(questions);
    }
    public static void test(GeneralCultureQuestions[] generalCultureQuestions){
        int score = 0;
        Scanner keyboardInput = new Scanner(System.in);
        for(int i = 0; i < generalCultureQuestions.length; i++){
            System.out.println(generalCultureQuestions[i].getQuestion());
            String answer = keyboardInput.nextLine();
            if(answer.equals(generalCultureQuestions[i].getAnswer())){
                score++;
            }
        }
        System.out.println("You got: " + score + "/" + generalCultureQuestions.length);
    }
}