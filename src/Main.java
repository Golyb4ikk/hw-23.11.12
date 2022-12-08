public class Main {
    public static void main(String[] args) {
        //zadacha1
        int sal=15000;
        int all=0;
        int month=0;
        while(all<2459000){
            month++;
            all=all+sal;
            System.out.println("Месяц "+month+" , сумма накоплений равна "+all+" рублей");

        }
        //zadacha2
        int i=0;
        while(i<10){
            i++;
            System.out.print(i+" ");
        }
        System.out.println();
        for(int p=10;p>0;p--){
            System.out.print(p+" ");
        }
        //zadacha3
        System.out.println();
        int sal2 = 12_000_000;

        int year = 0;
        int die=all / 1000 * 8;
        int life=all / 1000 * 17;
        while (year < 10) {
            year++;
            sal2 = sal2 - die + life;
            System.out.println("Год " + year + " равен " + sal2);
        }

    }
}