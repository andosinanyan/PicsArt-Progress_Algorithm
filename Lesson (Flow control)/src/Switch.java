import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        String name = "Karen";
        int a = 0;

        switch (name){
                case "Karen" :
                case "Varduhi" :
                    System.out.println("Duq Varduhin eq 24 tarekna");
                    break;
                case "Lusine" :
                    System.out.println("Duq Lusine eq 63 tarekna");
                    break;
                default:
                    System.out.println("Dzuq chkaq mer tvyalneri bazayum");
        }

    }
}
