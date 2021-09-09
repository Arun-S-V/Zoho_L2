package com.zoho;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeValue extends Object{
    public static void main(String args[]){
        Map<Member,String> map = new HashMap<>();
        Member obj = new Member(1,1);
        Member obj1 = new Member(1,1);
        System.out.println("Code : "+obj.hashCode());
        System.out.println("Code : "+obj1.hashCode());
        map.put(obj,"cpp");
        map.put(obj1,"python");
        System.out.println(map.size());

        Map<Integer,String> map1 = new HashMap<>();
            Integer obj2 = new Integer("289");
            Integer obj3 = new Integer(1);
            System.out.println("Code : " + obj2.hashCode());
            System.out.println("Code : " + obj3.hashCode());
            map1.put(obj2, "oops");
            map1.put(obj3, "java");
            System.out.println(map1.size());
            String sr = "Ea";
            Object str = sr.hashCode();
            System.out.println(str.getClass().getSimpleName());
    }
}
class Member {
    int id;
    int value;

    public Member(int id, int value) {
        this.id = id;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return id == member.id && value == member.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, value);
    }
}