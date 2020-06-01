package com.penny;

/**
 * VM Args: -Xss128k
 * @author &lt;a href="mailto:Answer1331@163.com"&gt;Lambda&gt;/a&lt;
 * @date 2020/06/01
 * @since
 */
public class JavaVMStackSOF {
    private int stackLength = 1;

    public void  stackLeak() {
        stackLength++;
        stackLeak();
    }

    public static void main(String[] args) throws Throwable {
        JavaVMStackSOF oom = new JavaVMStackSOF();
        try {
            oom.stackLeak();
        } catch (Throwable e) {
            System.out.println("stack length:" + oom.stackLength);
            throw e;
        }
    }
}
