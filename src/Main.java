import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int score = 0;

        //Arrays holding questions, options, and answers
        String[] questions ={"First Black South African President?",
                "What comes after 1?",
                "Came up with the formula e=mc2:",
                "Father of Java programming language:",};

        String[] options = {"A. Obama B. Thabo Mbeki C. Thendo D. Nelson Mandela",
                "A. 2 B. 8 C. 9 D. 1",
                "A. Rupert B. Albert Einstein C. Isaac Newton D. Lamark",
                "A. Michael Jordan B. James Gosling C. A D. Both A and B"};

        String[] answers = {"D", "A","B","B"};

        try{
            for(int i=0;i<options.length;i++){
                System.out.println(questions[i]);
                System.out.println(options[i]);
                String response = scan.nextLine();
                if(response.equalsIgnoreCase(answers[i])){
                    score++;
                }
            }
        }catch(Exception e){
            System.out.println("Something went wrong.");
        }
        System.out.println("You have got "+score+" question(s) right.");
    }
}