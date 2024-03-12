package hooks;

import io.cucumber.java.*;

public class AmazonSearchHooks {

    @Before("@Smoke")
    public void setupBrowser() {
        System.out.println("Launch browser");
    }

//    @Before(order = 2) // @Before follows ascending order
//    public void setupUrl() {
//        System.out.println("Launch url");
//    }
//
//    @After(order = 2) // @After follows descending order
//    public void tearDown_logout() {
//        System.out.println("Log out");
//    }

    @After("@Smoke")
    public void tearDown_close(Scenario sc) {
        System.out.println("Close browser");
        System.out.println(sc.getName() + " - " + sc.getStatus());
    }

//    @BeforeStep
//    public void takeScreenshot() {
//        System.out.println("Take the screenshot");
//    }
//
//    @AfterStep
//    public void refreshPage() {
//        System.out.println("Refresh the page");
//    }
}
