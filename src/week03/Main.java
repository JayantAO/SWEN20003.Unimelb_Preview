package week03;

import java.util.Random;

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

//        数组定义练习
        double[] num = new double[10];
        for(int i = 0; i < 10; i++){
            num[i] = Math.random();
            System.out.println(num[i]);
        }
//        随机数函数
        Random random = new Random();
        int numInt = random.nextInt(10);
        System.out.println(numInt);

//        数组循环增强
        for(double i:num){
//            这里的i是num[i]而不是index
//            也可以是for(double item:num){}
            System.out.println(num);
            System.out.println(i);
        }
        System.out.println(num[1]);

//        找最大元素
        int[] arrInt = new int[10];
//        遍历初始化数组
        for(int i = 0; i < arrInt.length; i++){
//            数组.length    java有类函数，所以有这种类似python的方法
            arrInt[i] = random.nextInt(100);
        }
//        遍历找最大值
//        int result = 0;
//        for(int i = 0; i < (arrInt.length-1); i++){
//            if(arrInt[i]<arrInt[i+1]){
//                result = arrInt[i+1];
//            }
//        }这里逻辑有问题
        int result = arrInt[0];
        for(int i = 1; i < arrInt.length; i++){
            if(result<arrInt[i]){
                result = arrInt[i];
            }
        }
        System.out.println(result);


//        找最大值优化
        int[] arrIntV2 = new int[10];
        int resultV2 = arrIntV2[0];
        //        当数组内部没有放入值的时候，里面的元素是0
        int indexV2 = 0;
        System.out.println(resultV2);
//        遍历初始化数组
        for(int i = 0; i < arrIntV2.length; i++){
            arrIntV2[i] = random.nextInt(100);
            if(resultV2<arrIntV2[i]){
                resultV2 = arrIntV2[i];
                indexV2 = i;
            }
        }
        System.out.println(resultV2);
        System.out.println(indexV2);

//        统计数组中超过平均值的元素个数
        int[] arrIntV3 = new int[20];
        int sumV3 = 0;
        int avgV3 = 0;
//        遍历初始化数组并求和求平均
        for(int i = 0; i < arrIntV3.length; i++){
            arrIntV3[i] = random.nextInt(100);
            sumV3 = sumV3 + arrIntV3[i];
        }
        avgV3 = sumV3/arrIntV3.length;
//        遍历找超过平均值的元素
        int jV3 = 0;
        for(int item:arrIntV3){
            if(item > avgV3){
                jV3 = jV3 + 1;
            }
        }
        System.out.println(jV3);


//        分别找出数组中的奇偶数(并各自存储输出)
        int[] arrIntV4 = new int[50];
        int iOdd = 0;
        int iEve = 0;
//        遍历初始化数组,统计奇偶数各自个数(目前还没有学习类似python的不需要知道index的容器)
        for(int i = 0; i < arrIntV4.length; i++){
            arrIntV4[i] = random.nextInt(200);
            if(arrIntV4[i]%2 == 0){
                iEve = iEve + 1;
            }else{
                iOdd = iOdd + 1;
            }
        }

        int[] arrOdd = new int[iOdd];
        int[] arrEve = new int[iEve];

        int pointOdd = 0;
        int pointEve = 0;

        for(int item:arrIntV4){
            if(item%2 != 0){
                arrOdd[pointOdd] = item;
                pointOdd++;
            }else{
                arrEve[pointEve] = item;
                pointEve++;
                }
        }

//        二维数组
        int [][]arr2Division = new int[4][7];

        int [][]arr2DivisionV2 = {{2,4,6,8,5},{0,0,1,1,4},{3,5,7,1,1},{1,1,1,2,4}};

        for(int i = 0; i<arr2DivisionV2.length;i++){
            for(int j = 0; j<arr2DivisionV2[i].length;j++){
                System.out.print(arr2DivisionV2[i][j]);
            }
            System.out.println(" ");
        }
    }
}
