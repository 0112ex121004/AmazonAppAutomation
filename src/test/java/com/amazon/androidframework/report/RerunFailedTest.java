package com.amazon.androidframework.report;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RerunFailedTest implements IRetryAnalyzer {


    int iterrater = 0;

    @Override
    public boolean retry(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE && iterrater < 1)
            try {
                Thread.sleep(3000);
                System.out.println(String.format("Method name :%s Retry Count : %d", result.getMethod(), iterrater));
                return true;

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        return false;
    }
}
