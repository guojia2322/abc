package com.sinosfot;

/**
 * Created by guojia
 */
public class TestDemo {
    public static void main(String[] args) {
        System.out.println(2222233); System.out.println(2222233);
        System.out.println(3333);
        //Step Over (F8)：步过，一行一行地往下走，如果这一行上有方法不会进入方法。
        //Step Into (F7)：步入，如果当前行有方法，可以进入方法内部，一般用于进入自定义方法内，不会进入官方类库的方法，如第25行的put方法。
        for (int i = 0; i <5 ; i++) {
            a();
            System.out.println(22444);
        }

    }
    static void a(){
        System.out.println(111);
    }
}
