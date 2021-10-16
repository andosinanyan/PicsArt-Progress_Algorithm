public class Cycles {
    public static void main(String[] args) {
        int b = 0;

        for(int i = 0; i <= 10; i+= 1){
                if(i == 5) {
                    continue;
                }
            System.out.println(i);
        }

        while(b < 10){
            System.out.println(b);
            b++;
        }



        do{
            System.out.println(b + " Booo");
        }
        while (b > 0);
    }
}
