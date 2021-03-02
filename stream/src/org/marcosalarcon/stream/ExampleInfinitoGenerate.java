package org.marcosalarcon.stream;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class ExampleInfinitoGenerate {
    public static void main(String[] args) {

        AtomicInteger contador = new AtomicInteger(0);
        Stream.generate(() -> {
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return contador.incrementAndGet();
        })
                .limit(5)
                .forEach(System.out::println);

    }
}
