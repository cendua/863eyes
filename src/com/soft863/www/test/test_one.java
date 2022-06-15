package com.soft863.www.test;

import org.junit.Test;

import java.util.Scanner;

public class test_one {
    @Test
    public void methodMaxAndMin(){
        int[] numArr = {123,22,321,98,45};
        int max_num=numArr[0];
        int min_num=numArr[0];

        for (int i = 0; i < numArr.length; i++) {
            if (max_num<numArr[i])
                max_num=numArr[i];
            if (min_num>numArr[i])
                min_num=numArr[i];
        }
        System.out.printf("我是最大值"+max_num);
        System.out.printf("我是最小值"+min_num);
    }

    @Test
    public void guessNumber(){
        Scanner sc=new Scanner(System.in);
        int bingo=50;
        for (int i = 0; i <5 ; i++) {
            System.out.println("请输入你要猜的数字");
            int input_num=sc.nextInt();

            //回答正确
            if (input_num==bingo){
                if (i==0){
                    System.out.printf("你是个天才！");
                    break;
                }
                System.out.printf("恭喜你，回答正确！");
                break;
            }

            //回答小了
            else  if (input_num<bingo){
                if (i==4){
                    System.out.printf("game over!");
                    break;
                }
                System.out.printf("数字过小，您还有"+(4-i)+"次机会");
            }

            //回答大了
            else
                if (i==4){
                    System.out.printf("game over!");
                    break;
                }
                System.out.printf("数字过大，您还有"+(4-i)+"次机会");
            }

    }


}
