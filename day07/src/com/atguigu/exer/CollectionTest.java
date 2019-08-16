package com.atguigu.exer;

import org.junit.Test;

import java.net.URL;
import java.util.*;

/**
 * @author shkstart
 * @create 2019 上午 9:36
 */
public class CollectionTest {
    @Test
    public void test1(){

        Set set=new HashSet();


        Collection coll = new ArrayList();

        coll.add(123);
        coll.add(456);
        coll.add(343);
        coll.add(343);
    set.addAll(coll);
        System.out.println("coll = " + set);
        coll.forEach(System.out::println);
    }


    //练习：在List内去除重复数字值，要求尽量简单
    public static List duplicateList(List list) {
        HashSet set = new HashSet();
        set.addAll(list);
        return new ArrayList(set);
    }
    @Test
    public void test2(){
        List list = new ArrayList();
        list.add(new Integer(1));
        list.add(new Integer(2));
        list.add(new Integer(2));
        list.add(new Integer(4));
        list.add(new Integer(4));
        List list2 = duplicateList(list);
        for (Object integer : list2) {
            System.out.println(integer);
        }
    }

    @Test
    public void test3(){
        HashSet set = new HashSet();
        Person p1 = new Person(1001,"AA");
        Person p2 = new Person(1002,"BB");

        set.add(p1);
        set.add(p2);
        System.out.println(set);

        p1.name = "CC";
        set.remove(p1);
        System.out.println(set);
        set.add(new Person(1001,"CC"));
        System.out.println(set);
        set.add(new Person(1001,"AA"));
        System.out.println(set);

    }
  @Test
    public void test5(){
      URL url = null;
      try {
          url = new URL("http://news.baidu.com/");
          url.openConnection();


      } catch (Exception e) {
          e.printStackTrace();
      }

  }

}
