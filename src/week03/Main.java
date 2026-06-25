package week03;
public class Main {
    public static void main(String[] args) {

        //90、80、70、60、50 if else 练习
        String status;
        int grades = 76;
        if(grades>=90){
            status = "brilliant";
        }else if(grades>=80){
            status = "good";
        } else if(grades>=70){
            status = "not bad";
        } else if(grades>=60){
            status = "pass";
        } else if(grades>=50){
            status = "retry";
        } else{
            status = "failed";
        }
        System.out.println("Your grades is " + grades + ", You are " + status);


        //星期几练习
        String day;
        int w = 4;
        switch(w){
            case 1:
                day = "Monday";
                System.out.println("Today is " + day);
                break;
            case 2:
                day = "Tuesday";
                System.out.println("Today is " + day);
                break;
            case 3:
                day = "Wednesday";
                System.out.println("Today is " + day);
                break;
            case 4:
                day = "Thursday";
                System.out.println("Today is " + day);
                break;
            case 5:
                day = "Friday";
                System.out.println("Today is " + day);
                break;
            case 6:
                day = "Saturday";
                System.out.println("Today is " + day);
                break;
            case 7:
                day = "Sunday";
                System.out.println("Today is " + day);
                break;
        }

    }
}
