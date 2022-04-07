package hepsiburada;

import hepsiburada.Core.Hooks;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.net.MalformedURLException;


@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber/index.html",
                "json:target/cucumber/result.json",
                "junit:target/cucumber/result.xml"},
        features = "classpath:features",
        glue =  {"hepsiburada"}
)

public class Runner extends AbstractTestNGCucumberTests {

    static Hooks hooks = new Hooks();

    @BeforeMethod
    @Parameters({ "deviceName", "platformVersion", "port" })
    public static void startEmulator(String deviceName, String platformVersion, String port) throws MalformedURLException {
        System.out.println("------------ APPIUM Test Started ------------");
        System.out.println(deviceName +  " " + platformVersion +  " " + port);
        hooks.beforeTest(deviceName,platformVersion,port);
    }

    @AfterClass
    public static void stopEmulator() {
        System.out.println("------------ APPIUM Test Stopped ------------");
    }

    @Before(order = 1)
    public void beforeTest(Scenario scenario) {
        System.out.println("--- Start Appium Test Scenario ---");
        System.out.println("\033[1;39;42mSCENARIO NAME : " + scenario.getName() + "\033[0;39;49m");
    }
}
