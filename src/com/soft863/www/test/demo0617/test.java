package com.soft863.www.test.demo0617;

import com.soft863.www.entity.Medical;
import com.soft863.www.entity.Student;
import org.junit.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Date;
import java.util.Scanner;

public class test {
    @Test
    public void method() throws IOException {
        ArrayList<Medical> mdList=new ArrayList();
        File file=new File("E:\\1\\Medical.txt");
        file.delete();
        Random rd=new Random();
        String[] hospitialList={"中山医院","南京医院","解放军第二附属医院","郑州大学第二附属医院","北京协和医院"};

        for (int i = 0; i < 10 ; i++) {

            Medical md=new Medical();
            md.setId(rd.nextInt(1000)+1000+i);
            md.setUserId("411421"+new Date().getTime());
            md.setHospital(hospitialList[rd.nextInt(hospitialList.length)]);

            if (rd.nextInt(100)>80)
                md.setDiagnosis("否");
            else
                md.setDiagnosis("是");

            mdList.add(md);
        }

        for (Medical medical : mdList) {
            FileWriter fw=new FileWriter(file,true);
            fw.write(medical.getId() +"号,身份证为"+medical.getUserId()+"就诊于"+medical.getHospital()+",是否确诊："+medical.getDiagnosis()+"\r\n");


            fw.close();
        }
    }

    @Test
    public void findStudenIsPassed(){

        Scanner sc=new Scanner(System.in);
        ArrayList<Student> stList = new ArrayList();
        Random rd=new Random();
        String[] lastNameStr={"赵","钱","孙","李","周","吴","郑"};

        for (int i = 0; i < 10 ; i++) {
            Student st=new Student();
            st.setStuId(Integer.toString(rd.nextInt(1000)+1000+i));
            st.setName(lastNameStr[rd.nextInt(lastNameStr.length)]+i);

            if (rd.nextInt(100)>80)
                st.setIsPass("否");
            else
                st.setIsPass("是");

         stList.add(st);
        }

        for (Student student : stList) {
            if (student.getIsPass().equals("是"))
                System.out.println(student.getName()+"需要进行补考");
        }

    }

    @Test
    public void randomCheck() throws InterruptedException, IOException {
        int cout=10;
        String[] nameList={"张三","李四","王五","赵六","陈七"};
        File file=new File("E:\\1\\check.txt");
        file.delete();
        Random rd=new Random();

        while (cout>0) {
            FileWriter fw=new FileWriter(file,true);
            fw.write(nameList[rd.nextInt(nameList.length)]+"\r\n");
            fw.close();


            cout--;
            Thread.sleep(3000);

        }

    }


}
