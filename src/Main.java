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
        String qH1 = "Who was the first President of the United States?\n" +
                "(a) Thomas Jefferson\n" +
                "(b) George Washington\n" +
                "(c) Abraham Lincoln\n" +
                "(d) John Adams\n";

        String qH2 = "In which year did World War I end?\n" +
                "(a) 1917\n" +
                "(b) 1918\n" +
                "(c) 1920\n" +
                "(d) 1945\n";

        String qH3 = "Who was the leader of the Soviet Union during the Cuban Missile Crisis?\n" +
                "(a) Joseph Stalin\n" +
                "(b) Vladimir Lenin\n" +
                "(c) Nikita Khrushchev\n" +
                "(d) Mikhail Gorbachev\n";

        String qH4 = "What event marked the beginning of the French Revolution?\n" +
                "(a) Storming of the Bastille\n" +
                "(b) Reign of Terror\n" +
                "(c) Execution of King Louis XVI\n" +
                "(d) Tennis Court Oath\n";

        String qH5 = "Who was the first female Prime Minister of the United Kingdom?\n" +
                "(a) Margaret Thatcher\n" +
                "(b) Theresa May\n" +
                "(c) Indira Gandhi\n" +
                "(d) Angela Merkel\n";

        String qH6 = "What ancient civilization built the Great Pyramids of Giza?\n" +
                "(a) Mesopotamia\n" +
                "(b) Ancient Greece\n" +
                "(c) Ancient Rome\n" +
                "(d) Ancient Egypt\n";

        String qH7 = "Who was the first Emperor of Rome?\n" +
                "(a) Julius Caesar\n" +
                "(b) Augustus\n" +
                "(c) Nero\n" +
                "(d) Constantine\n";

        String qH8 = "What year did the Berlin Wall fall?\n" +
                "(a) 1985\n" +
                "(b) 1989\n" +
                "(c) 1991\n" +
                "(d) 1995\n";

        String qH9 = "Which famous explorer first reached the Americas in 1492?\n" +
                "(a) Christopher Columbus\n" +
                "(b) Vasco da Gama\n" +
                "(c) Ferdinand Magellan\n" +
                "(d) Amerigo Vespucci\n";

        String qH10 = "What was the name of the ship that carried the Pilgrims to America in 1620?\n" +
                "(a) Mayflower\n" +
                "(b) Santa Maria\n" +
                "(c) Golden Hind\n" +
                "(d) Victoria\n";
        HistoricalQuestions[] historicalQuestions = {new HistoricalQuestions(qH1, "b"), new HistoricalQuestions(qH2, "b"), new HistoricalQuestions(qH3, "c"),
        new HistoricalQuestions(qH4, "a"), new HistoricalQuestions(qH5, "a"), new HistoricalQuestions(qH6, "b"), new HistoricalQuestions(qH7, "b"),
        new HistoricalQuestions(qH8, "b"), new HistoricalQuestions(qH9, "a"), new HistoricalQuestions(qH10, "a")};
        testHistoric(historicalQuestions);
    }
    public static void test(GeneralCultureQuestions[] generalCultureQuestions){
        int score = 0;
        Scanner keyboardInput = new Scanner(System.in);
        for(int i = 0; i < generalCultureQuestions.length; i++){
            System.out.println(generalCultureQuestions[i].getQuestion());
            String answer = keyboardInput.nextLine();
            if(answer.equals("a") || answer.equals("b") || answer.equals("c") || answer.equals("d")) {
                if (answer.equals(generalCultureQuestions[i].getAnswer())) {
                    score++;
                }
            } else {
                System.out.println("Chose a option between: A, B, C, D ");
                i--;
            }
        }
        System.out.println("You got: " + score + "/" + generalCultureQuestions.length + " on General Culture Questions!");
    }
    public static void testHistoric(HistoricalQuestions[] historicalQuestions){
        int score = 0;
        Scanner keyboardInput = new Scanner(System.in);
        for(int i = 0; i < historicalQuestions.length; i++){
            System.out.println(historicalQuestions[i].getQuestion());
            String answer = keyboardInput.nextLine();
            if(answer.equals("a") || answer.equals("b") || answer.equals("c") || answer.equals("d")) {
                if(answer.equals(historicalQuestions[i].getAnswer())){
                score++;
                }
            } else {
                System.out.println("Chose a option between: A, B, C, D ");
                i--;
            }
        }
        System.out.println("You got: " + score + "/" + historicalQuestions.length + " on Historical Questions!");
    }
}