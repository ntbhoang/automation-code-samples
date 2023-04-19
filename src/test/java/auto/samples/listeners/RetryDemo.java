package auto.samples.listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryDemo implements IRetryAnalyzer {
    @Override
    public boolean retry(ITestResult iTestResult) {
        return true;
    }
}
