package cn.tedu;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class bean {
    public static void main(String[] args) {
        System.out.println("module11");
        List<String> list=new ArrayList<>();
        list.add("11");
        list.add("11");
        list.add("11");
        Iterator lt=list.iterator();
        while(lt.hasNext()){
            System.out.println(lt.next());
        }

        Date date = new Date();
    }
}
