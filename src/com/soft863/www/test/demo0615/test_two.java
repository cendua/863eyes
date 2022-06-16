package com.soft863.www.test;

import org.junit.Test;

import java.util.Random;
import java.util.Scanner;

public class test_two {
    @Test
    public void theAandB(){

        Scanner sc=new Scanner(System.in);
        System.out.println("请输入字符串，格式为（111，222）");
        String input_str=sc.nextLine();

        String[] tmpArr=input_str.split(",");
        int a=Integer.parseInt(tmpArr[0]);
        int b=Integer.parseInt(tmpArr[1]);
        int tmp_num=a;

        if (a>b){
            tmp_num=a;
            a=b;
            b=tmp_num;
        }

        System.out.println("a="+a+"b="+b+"插值"+(a-b));

    }

    @Test
    public void guessNumber(){
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        //使用随机数进行测试  40-50
        int bingo= rand.nextInt(11)+40;
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
