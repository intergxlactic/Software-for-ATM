/*Приложение идентифицирует пользователя по пин-коду,
показывает ему баланс на карте и выписку по последним операциям.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AtmOperation op = new AtmOperation();

        int ATM_number = 12345;
        int pincode = 1234;

        Scanner sc = new Scanner(System.in);
        System.out.println("Добро пожаловать в наш банкомат");
        System.out.print("Введите номер банкомата: ");
        int input_number_ATM = sc.nextInt();
        System.out.print("Введите ваш пин код: ");
        int input_pincode = sc.nextInt();

        if(input_pincode == pincode && input_number_ATM == ATM_number) {
            while (true) {
                show_Operation();

                Scanner scanner = new Scanner(System.in);
                int operation = scanner.nextInt();

                switch (operation) {
                    case 1:
                        op.showBalance();
                        break;
                    case 2:
                        System.out.print("Введите сумму, которую хотите снять: ");
                        double withdrawAmount = scanner.nextDouble();
                        op.withdraw_amount(withdrawAmount);
                        break;
                    case 3:
                        System.out.print("Введите сумму, которую хотите внести: ");
                        double depositAmount = scanner.nextDouble();
                        op.deposit_amount(depositAmount);
                        break;
                    case 4:
                        op.viewStatement();
                        break;
                    case 5:
                        System.exit(0);
                }
            }
        }
        else {
            System.out.println("Вы ввели неправильный номер банкомата или пинкод");
        }
    }

    public static void show_Operation(){
        System.out.println("Введите операцию, которую вы хотите выполнить: ");
        System.out.println("   1 - Показать баланс на карте\n   2 - Снять деньги\n   3 - Положить деньги\n   4 - Посмотреть выписку\n   5 - Выйти из программы");
    }

}


