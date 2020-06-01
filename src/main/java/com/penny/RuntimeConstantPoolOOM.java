package com.penny;

import java.util.ArrayList;

/**
 * JDK1.6
 * VM Args: -XX:PermSize=10m -XX:MaxPermSize=10m
 * @author &lt;a href="mailto:Answer1331@163.com"&gt;Lambda&gt;/a&lt;
 * @date 2020/06/01
 * @since
 */
public class RuntimeConstantPoolOOM {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        int i = 0;
        while (i < Integer.MAX_VALUE) {
            list.add(String.valueOf(i++).intern());
            System.out.println(i);
        }
    }
}
