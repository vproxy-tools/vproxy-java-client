package vproxy.client;

import java.util.concurrent.atomic.AtomicInteger;

public class TestUtils {
    public static String randomName(String n) {
        int time = (int) (System.currentTimeMillis() % 3600_000);
        int rand = (int) (Math.random() * 1000);
        return n + "-" + time + "-" + rand;
    }

    private static final int portMin = 30000;
    private static final int portMax = 40000;
    private static AtomicInteger port = new AtomicInteger((int) (
        Math.random() * (portMax - portMin) + portMin
    ));

    public static int randomPort() {
        int x = port.incrementAndGet();
        return (x - portMin) % (portMax - portMin) + portMin;
    }
}
