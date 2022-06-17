package com.soft863.www.test.demo0617;

import com.soft863.www.entity.User;
import org.junit.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Random;
import java.util.Date;

public class virtualUserBuilder {

    @Test
    public void userBuilder() throws IOException {
        HashMap<Integer, User> userMap =  new HashMap();
        Random rd=new Random();
        String[] lastName={"赵","钱","孙","李","周","吴","郑","王","钱","唐","楚","魏","齐","鲁","韩","杨","冯","陈","白","蒋","沈","朱","秦","尤","许","何","吕","张","苏","潘","韦","马","袁","史"};
        String[] secondName={"盈","凝","芯","雁","佩","畅","楚","飒","颖","清","琦","暮","嘉","环","妃","熙","蜜","景","悦","淑","灵","双","嫔","念","玫","竹","雯","卿","月","娇","云","茜","雨","夜","湘","南","蕊","芮","琬","黛","莹","安","彬","斌","波","超","成","维","伟","卫","德","飞","峰","锋","福","刚","光","国","海","浩","宏","洪","辉","家","建","剑","健","江","杰","金","军","凯","磊","立","利","良","亮","林","龙","伦","民","明","鹏","强","清","庆","生","胜","世","松","涛","祥","新","鑫","兴","旭","学","阳","永","勇","元","振","志","智","忠"};
        String[] bloodType={"AB","B","A","O"};
        File file=new File("E:\\2virtualUserINFO\\user.txt");
        file.delete();




        for (int i = 0; i < 100 ; i++) {


            User user = new User();


//id & faceid
            int userId=411421+rd.nextInt(1000)+1000;
            if (!userMap.containsKey(userId))
                user.setId(userId);
            else
                continue;

            user.setFaceId(Integer.toString(rd.nextInt(100000) + rd.nextInt(10000) + rd.nextInt(1000) + rd.nextInt(100) + rd.nextInt(10)));

            System.out.println("this is tests！！！！！");
//name & sex &education
            int filter = rd.nextInt(10);
            if (filter < 5) {//两个字名字
                user.setName(lastName[rd.nextInt(lastName.length)] + secondName[rd.nextInt(secondName.length)]);
                if (filter % 2 == 0)
                    user.setSex(1);
                else
                    user.setSex(0);
            } else {//三个字名字
                user.setName(lastName[rd.nextInt(lastName.length)] + secondName[rd.nextInt(secondName.length)]+ secondName[rd.nextInt(secondName.length)]);
                if (filter % 2 == 0)
                    user.setSex(1);
                else
                    user.setSex(0);
            }


//weight & height
            Double height=(rd.nextInt(10)+10)*10+rd.nextInt(100)*0.01;
            Double weight=(rd.nextInt(10)+5)*10+rd.nextInt(100)*0.01;
            user.setHeight(height);
            user.setWeight(weight);



//age & birthday
            int age = 11+rd.nextInt(70);
            user.setAge(age);
            Date data=new Date();
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy");
            String birthday=(Integer.valueOf(sdf.format(data))-age)+"/"+String.valueOf(rd.nextInt(12));
            user.setBirthday(birthday);


//tel education job birthplace
//            String tel="1"+String.valueOf(rd.nextInt(6)+3)+String.valueOf(r);


            userMap.put(user.getId(),user);
            FileWriter fw=new FileWriter(file,true);
            fw.write(user.getId()+"\t"+user.getFaceId()+"\t"+user.getName()+"\t"+user.getAge()+"\t"+user.getBirthday()+"\t"+user.getSex()+"\t"+user.getHeight()+"\t"+user.getWeight()+"\r\n");
            fw.close();

            System.out.println(i);


        }


    }

    @Test
    public void method(){
        HashMap<Integer, User> userMap =  new HashMap();
        Random rd=new Random();
        String[] lastName={"赵","钱","孙","李","周","吴","郑","王","钱","唐","楚","魏","齐","鲁","韩","杨","冯","陈","白","蒋","沈","朱","秦","尤","许","何","吕","张","苏","潘","韦","马","袁","史"};
        String[] secondName={"盈","凝","芯","雁","佩","畅","楚","飒","颖","清","琦","暮","嘉","环","妃","熙","蜜","景","悦","淑","灵","双","嫔","念","玫","竹","雯","卿","月","娇","云","茜","雨","夜","湘","南","蕊","芮","琬","黛","莹","安","彬","斌","波","超","成","维","伟","卫","德","飞","峰","锋","福","刚","光","国","海","浩","宏","洪","辉","家","建","剑","健","江","杰","金","军","凯","磊","立","利","良","亮","林","龙","伦","民","明","鹏","强","清","庆","生","胜","世","松","涛","祥","新","鑫","兴","旭","学","阳","永","勇","元","振","志","智","忠"};


        //age & birthday
        int age = 11+rd.nextInt(70);
        Date data=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy");
        String birthdayYear=(Integer.valueOf(sdf.format(data))-age)+"/"+String.valueOf(rd.nextInt(12));

        System.out.println(birthdayYear);
        System.out.println(age);
    }


}
