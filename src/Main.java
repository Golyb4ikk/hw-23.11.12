public class Main {
    public static void main(String[] args) {
        //zadacha1
        int sal = 15_000;
        int all = 0;
        int month = 0;
        while (all < 12_000_000) {
            month++;
            int proc = all / 100 * 7;
            all = all + sal + proc;
            System.out.println("Месяц=" + month + " равен " + all);
        }
        //zadacha 2
        int sal2 = 15_000;
        int all2 = 0;
        int month2 = 0;
        while (all2 < 12_000_000) {
            month2++;
            int proc2 = all2 / 100 * 7;
            all2 = all2 + sal2 + proc2;
            if (month2 % 6 == 0) {
                System.out.println("Месяц=" + month2 + " равен " + all2);

                //zadacha 3
                int sal3 = 15_000;
                int all3 = 0;

                int halfYear = 0;
                while (halfYear < 18) {
                    halfYear++;

                    int proc3 = all3 / 100 * 7;
                    all3 = all3 + sal3 + proc3;

                    System.out.println("Полгода=" + halfYear + " равен " + all3);
                }
            }
            //zadacha 4
            int first = 1;
            for (first = 1; first < 31; first = first + 7) {
                System.out.println("Сегодня пятница, "+first+"-е число. Необходимо подготовить отчет.");
            }
        }
    }

    }
