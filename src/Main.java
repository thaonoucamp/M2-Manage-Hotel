import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hotel manage = new Hotel();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter quantity Customer: ");
        int quantityCus = sc.nextInt();

        manage.addCustomer(quantityCus);

        manage.showListCustomer();

        System.out.println("Enter Identity want to Find: ");
        String idFind = sc.nextLine();

        double totalMoney = manage.totalMoney(idFind);
        System.out.println(totalMoney);


    }
}
