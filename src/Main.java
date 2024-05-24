import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int ch,op,a,b,result,count,c;
        String text;
        Scanner sc = new Scanner(System.in);
        System.out.println("choose between : 1.Calculator 2.Text Analyzer...");
        ch = sc.nextInt();
        Calculator C = new Calculator();
        TextAnalyzer T = new TextAnalyzer();

        switch(ch){
            case 1: System.out.println("Calculator : ");
                    System.out.println("Enter calculator choice : 1.add 2.subtract 3.multiplication 4.division..");
                    op = sc.nextInt();
                    System.out.println("Enter values for a and b : ");
                    a=sc.nextInt();
                    b= sc.nextInt();


                    switch (op){
                        case 1:
                                result = C.add(a,b);
                                System.out.println("Result is : "+ result);
                                break;

                        case 2:
                                result = C.subtract(a,b);
                                System.out.println("Result is : "+ result);
                                break;

                        case 3:
                                result = C.Multiplication(a,b);
                                System.out.println("Result is : "+ result);
                                break;

                        case 4:
                                try {
                                    result = C.Division(a, b);
                                    System.out.println("Result is : "+ result);
                                }
                                catch (RuntimeException e){
                                    System.out.println(e.getMessage());
                                }

                                break;

                        default:System.out.println("Wrong Choice!!!!");

                    }
                    break;
            case 2:System.out.println("Text Analyzer ");
                    System.out.println("Enter the text : ");
                    sc.nextLine();
                    text = sc.nextLine();
                    System.out.println("Enter your choice...1.Word Count 2.Count Characters 3.Count Vowels...");
                    int choice = sc.nextInt();

                    switch (choice){
                        case 1:
                                c = T.wordcount(text);
                                System.out.println("The no.of words are : " + c);
                                break;

                        case 2:
                                count = T.Countcharacters(text);
                                System.out.println("The no.of words are : " + count);
                                break;

                        case 3:
                                int num = T.Countvowels(text);
                                System.out.println("The no.of words are : " + num);
                                break;

                        default: System.out.println("Wrong Choice!!!");
                    }

        }
    }
}