package com.infinite;

import java.math.BigInteger;
import java.util.concurrent.CompletableFuture;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class MyService {
	@Async
	public CompletableFuture<String> asyncMethod()
	{
		BigInteger result = BigInteger.valueOf(1);
        for (int i = 2; i <= 5; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return CompletableFuture.completedFuture("Result: " + result.toString());
	}
	
	@Async
	public CompletableFuture<String> asyncMethod2()
	{
		BigInteger result = BigInteger.valueOf(1);
        for (int i = 2; i <= 5; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return CompletableFuture.completedFuture("Result: " + result.toString());
	}
	
}