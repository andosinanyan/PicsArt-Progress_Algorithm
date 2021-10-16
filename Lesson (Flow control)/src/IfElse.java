public class IfElse {
    public static void main(String[] args) {
        int a = 19;
        int b = 25;
        int c = 100;

        int num1 = 10;
        int num2 = 20;


        num1 = num1 + num2; // 10 + 20 num1 = 30
        num2 = num1 - num2; // 30 - 20 num2 = 10
        num1 = num1 - num2; // 30 - 10 num1 = 20
        num1 = num1 + num2 - (num2 = num1); // swap numbers with one line
        System.out.println("arajin tiv@ havasar e " + num1 + " erkrord tiv@ havasar e " + num2);


        if(a > b && a > c) {
            System.out.println(a);
        }
        else if(b > c){
            System.out.println(b);
        }
        else{
            System.out.println(c);
        }

        // a > b ? chisht tarberaki elqy : hakarak depqum

        System.out.println(a > 0 ? "if is done" : "else is done");


        if(a >= 0 || a < 20 ){
            System.out.println("a drakan tiv e");
        }
       if(a == 0){
            System.out.println("a 0 e");
        }
        else if(a == 8){
            System.out.println("a im sirac tivn e");
        }
        else{
            System.out.println("a bacasakan e");
        }

    }
}
