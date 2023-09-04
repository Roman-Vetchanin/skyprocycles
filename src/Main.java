public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");
        {
            for (int i = 1; i<=10; i++){
                System.out.print(i+" ");
            }
        }
        System.out.println("\nЗадача №2");
        {
            for (int i = 10; i>0; i--){
                System.out.print(i+" ");
            }
        }
        System.out.println("\nЗадача №3");
        {
            for (int i = 0; i<17; i+=2){
                System.out.print(i+" ");
            }
        }
        System.out.println("\nЗадача №4");
        {
            for (int i = 10; i>=-10; i--){
                System.out.print(i+" ");
            }
        }
        System.out.println("\nЗадача №5");
        {
            for (int i = 1904; i<=2096; i +=4) {
                System.out.println(i+" год является високосным");
            }
        }
        System.out.println("Задача №6");
        {
            int num = 0;
            for (int i = 0; i<14; i++){
                num=num+7;
                System.out.print(num+" ");
            }
            System.out.println("\n+++++++++++");
            {
                for (int i = 7; i<=100;i+=7){
                    System.out.print(i+" ");
                }
            }
        }
        System.out.println("\nЗадача №7 ");
        {
            for (int i = 1; i<=512; i*=2){
                System.out.print(i+" ");
            }
        }
        System.out.println("\nЗадача №8");
        {
            int accumulation = 29000;
            int total = 0;
            for (int i = 1; i<=12; i++){
                total = total+accumulation;
                System.out.println("Месяц "+i+", сумма накоплений равна "+total+" рублей");
            }
        }
        System.out.println("Задача №9");
        {
            int accumulation = 29000;
            int total = 0;
            for (int i = 1; i<=12; i++){
                total = total+total/100;
                total = total+accumulation;
                System.out.println("Месяц "+i+", сумма накоплений равна "+total+" рублей");
            }
        }
        System.out.println("Задача №10");
        {
            int num = 0;
            for (int i = 1; i<=10; i++){
                num=num+2;
                System.out.println("2 * "+i+" = "+num);
            }
        }
    }
}