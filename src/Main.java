public class Main {
    public static void main(String[] args) {
        //zadacha1
        int yearStart=1850;
        int yearFinish=2100;
        int year=0;

        while(year<yearFinish){
            year=year+79;
            if(yearStart<year&&year<yearFinish){
                System.out.println("Нужный год "+year);
            }

        }
        //zadacha2
        int a=2;
        int y=0;
        int c;
        for(int i=0;i<10;i++){
            y++;
            c=a*y;
            System.out.println(a+""+"*"+y+"="+c);
        }

     }
    }
