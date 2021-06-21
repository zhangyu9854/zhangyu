package com.hspedu.Homework01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Homework01 {
    public static void main(String[] args) {
        String str;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new News("新闻一:新冠确诊病例超千万，数百万的印度教徒奔赴恒河”洗浴“引民众担忧"));
        arrayList.add(new News("新闻二:男子突然想起2个月前钓的鱼还在网兜里，捞起一看赶紧放生"));
        Collections.reverse(arrayList);
        for (Object newsTitle : arrayList) {
           if ((str=( (News)newsTitle).getTitle()).length()>15){
               StringBuffer stringBuffer = new StringBuffer(str);
               stringBuffer.replace(15,str.length(),"...");
               System.out.println(stringBuffer);

           }else {
            System.out.println(newsTitle);}
        }
    }
}
class News{
    private String title;
    private String content;

    public News(String title) {
        this.title = title;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "News{" +
                "title='" + title + '\'' +
                '}';
    }
}