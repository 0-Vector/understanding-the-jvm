package com.penny;

/**
 * JDK1.6
 * VM Args: -Xss2m
 * 在JDK 1.6及之前的版本中，由于常量池分配在永久代内，我们可以通过-XX:PermSize和-XX:MaxPermSize限制方法区大小，
 * 从而间接限制其中常量池的容量
 * @author &lt;a href="mailto:Answer1331@163.com"&gt;Lambda&gt;/a&lt;
 * @date 2020/06/01
 * @since
 */
public class JavaVMStackOOM {

    private void dontStop() {

    }

    public void stackLeakByThread() {
        while (true) {
            new Thread(() -> dontStop()).start();
        }
    }

    public static void main(String[] args) {
        JavaVMStackOOM oom = new JavaVMStackOOM();
        oom.stackLeakByThread();
    }

}
