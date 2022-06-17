package com.soft863.www.test.demo0616;

import com.soft863.www.entity.Medical;
import com.soft863.www.entity.Patient_test;
import com.soft863.www.entity.Resume;
import com.soft863.www.entity.Student_test;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class test {
    @Test
    public void findThe1001(){
        Scanner sc=new Scanner(System.in);
        ArrayList<Student_test> stList=new ArrayList();



        while (true){
            System.out.println("请输入学生信息（格式如：1001,jojo,23）,‘#’结束！");
            String inputStr=sc.nextLine();
            if (inputStr.equals("#"))
                break;

            String[] stuInfoStr=inputStr.split(",");
            Student_test st=new Student_test();
            st.setId(stuInfoStr[0]);
            st.setName(stuInfoStr[1]);
            st.setAge(Integer.parseInt(stuInfoStr[2]));

            stList.add(st);
        }

        for (int i = 0; i < stList.size(); i++) {
//            System.out.println(stList.get(i).getName());
            if (stList.get(i).getId().equals("1001"))
                System.out.println(stList.get(i).getName());
            else
                System.out.println("无人id为1001！！！");
        }

    }

    @Test
    public void findThePatient(){

        ArrayList<Patient_test> ptList=new ArrayList();
        Random random =new Random();

        for (int i = 0; i <10 ; i++) {
//            Patient_test pt=new Patient_test();
            if (random.nextInt(11)<=4) {//小于4表示阳性
                Patient_test pt=new Patient_test();
                pt.setId(String.valueOf(i));
                pt.setName("张"+String.valueOf(i));
                pt.setIfSick(1);//1表示阳性
                ptList.add(pt);
            }
        }

        if (ptList.size()!=0){
            for (int i = 0; i <ptList.size() ; i++) {
                System.out.printf(ptList.get(i).getId());
                System.out.println(ptList.get(i).getName());
            }
        }
        else
            System.out.println("密接人员全部阴性！！");

    }

    @Test
    public void resumeTable(){
        ArrayList<Resume> rsList=new ArrayList();
        Random rd=new Random();
        String[] Province={"河北","河南","浙江","陕西","湖北","江西","宁夏"};
        String resumeStr="-";
        String dataStr=null;

        for (int i = 0; i <10 ; i++) {
            Resume rs=new Resume();
            //身份证号和id号
            rs.setUserId("412303111111112"+String.valueOf(rd.nextInt(1000)));
            rs.setId(i);

            //履历
            for (int j = rd.nextInt(Province.length-1); j <Province.length-1 ; j++) {
//                rs.setResume(Province[j]+Province[j]);
                int afterCount=rd.nextInt(Province.length-1%7);
                if (afterCount==0)
                    continue;
                resumeStr=resumeStr+"--->";
                resumeStr=resumeStr+Province[afterCount];
            }
            rs.setResume(resumeStr);
            resumeStr="-";

            //日期
            dataStr="2022/"+Integer.toString(rd.nextInt(12)+1)+"/"+Integer.toString(rd.nextInt(30)+1);
            rs.setTime(dataStr);

            rsList.add(rs);

        }

        for (int i = 0; i < rsList.size(); i++) {
            System.out.printf(rsList.get(i).getId()+"号 ");
            System.out.printf("身份证号"+rsList.get(i).getUserId());
            System.out.printf("于"+rsList.get(i).getTime()+"日 ");
            System.out.printf("途径了"+rsList.get(i).getResume());
            System.out.println();
        }


    }

    @Test
    public void method(){

        ArrayList<Medical> mdList=new ArrayList();
        Random rd=new Random();
        String[] hospitalList={"中山医院","郑大附属","北京协和","解放军二甲","武南中心医院"};

        for (int i = 0; i <10 ; i++) {
            Medical md=new Medical();
            //身份证号和id号
            md.setUserId("412303111111112"+String.valueOf(rd.nextInt(1000)));
            md.setId(i);

            //是否确诊
            if (rd.nextInt(2)==1)
                md.setDiagnosis("是");
            else
                md.setDiagnosis("否");

            //配置医院
            md.setHospital(hospitalList[rd.nextInt(5)]);

            mdList.add(md);
        }

        for (int i = 0; i < mdList.size(); i++) {
            System.out.printf(mdList.get(i).getId()+"号");
            System.out.printf("病号"+mdList.get(i).getUserId());
            System.out.printf("是否确诊"+mdList.get(i).getDiagnosis());
            System.out.printf("就诊于"+mdList.get(i).getHospital());
            System.out.println();
        }


    }
}
