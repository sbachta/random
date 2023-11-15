package com.example.random.scratches;
/*
https://reactivemanifesto.org/
https://stackoverflow.com/questions/51786154/what-is-the-difference-between-router-and-annotated-controllers?rq=3
https://spring.io/guides/gs/reactive-rest-service/
https://www.baeldung.com/java-reactive-systems
https://www.baeldung.com/java-8-functional-interfaces
https://www.baeldung.com/spring-webflux
https://www.baeldung.com/java-completablefuture
 */

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class Futures {

    private void someFutureWithReturns() {
        System.out.println("--------------");
        long start = System.currentTimeMillis();
        System.out.println("Start " + start);

        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> {
            try {
                System.out.println("Do some processing");
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            System.out.println("I'll run in a separate thread");
            return "test";
        });
    }

    private void someFuture() {
        System.out.println("--------------");
        long start = System.currentTimeMillis();
        System.out.println("Start " + start);

        IntStream.rangeClosed(1, 5).forEach(i -> CompletableFuture.runAsync(() -> {
            try {
                System.out.println("Do some processing");
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            System.out.println("I'll run in a separate thread");
        }));

        long end = System.currentTimeMillis();
        System.out.println("End " + end);
        System.out.println("Total time elapsed " + (end - start));
    }

    private void notFuture() {
        long start = System.currentTimeMillis();
        System.out.println("Start " + start);
        IntStream.rangeClosed(1, 5).forEach(i -> doProcessing());

        long end = System.currentTimeMillis();
        System.out.println("End " + end);
        System.out.println("Total time elapsed " + (end - start));
    }

    private void doProcessing() {
        System.out.println("Do some processing");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ignored) {

        }

    }
}

/*
@Configuration(proxyBeanMethods = false)
public class GreetingRouter {

    @Bean
    public RouterFunction<ServerResponse> route(GreetingHandler greetingHandler) {

        return RouterFunctions
               .route(GET("/hello").and(accept(MediaType.APPLICATION_JSON)), greetingHandler::hello);
    }
}
 */
