package com.penny;

import java.util.ArrayList;

/**
 * VM Args: -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 * @author &lt;a href="mailto:Answer1331@163.com"&gt;Lambda&gt;/a&lt;
 * @date 2020/05/29
 * @since
 */
public class HeapOOM {

    static class OOMObject {

    }

    public static void main(String[] args) {
        ArrayList<OOMObject> list = new ArrayList<>();
        while (true) {
            list.add(new OOMObject());
        }
    }
}
