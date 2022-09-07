public class Main {
    public static void main(String[] args) {
       homeWork1();
       homeWork2();
       homeWork3();
       homeWork4();
       homeWork5();
       homeWork6();
       homeWork7();
       homeWork8();
       homeWork9();

    }
    public static void homeWork1(){
        System.out.println("Задача 1");
        for (int i = 1;i <= 10; i++){
            System.out.println("Числа " + i );
        }
        System.out.println();
    }
    public static void homeWork2(){
        System.out.println("Задача 2");
      for (int i = 10; i >= 1; i--){
          System.out.println("Числа " + i);
      }
        System.out.println();
    }
    public static void homeWork3(){
        System.out.println("Задача 3");
        for (int i = 0; i <= 17 ; i++){
            System.out.println("Числа " + i);
        }
        System.out.println();
    }
    public static void homeWork4(){
        System.out.println("Задача 4");
        for (int i = 10; i >= -10 ; i--){
            System.out.println("Числа " + i);
        }

        System.out.println();
    }
    public static void homeWork5(){
        System.out.println("Задача 5");
        for (int i = 1904; i < 2096; i = i+4){
            System.out.println(i +" год является високосным");
        }

        System.out.println();
    }
    public static void homeWork6(){
        System.out.println("Задача 6");
        for (int i =7 ; i<=98 ; i = i + 7){
            System.out.println(i);
        }

        System.out.println();
    }
    public static void homeWork7(){
        System.out.println("Задача 7");
        for (int i = 1 ; i <=512 ; i = i * 2){
            System.out.println(i);
        }
    }
    public static void homeWork8(){
        System.out.println("Задача 8");
        int money = 29000;
        int bank = 0;
        for (int i = 1; i <= 12 ; i ++){
            bank = bank + money;
            System.out.println("Месяц " + i + " ,сумма накоплений равна " + bank + " рублей");
        }
        System.out.println();
    }
    public static void homeWork9(){
        System.out.println("Задача 9");
        int money = 29000;
        double bank = 0;
        double percent = 0.01;
        for (int i = 1; i <= 12 ; i ++) {
            bank = (bank + money) * (1 + percent);

            System.out.println("Месяц " + i + " ,сумма накоплений равна " + bank + " рублей");
        }
        System.out.println();
    }

}