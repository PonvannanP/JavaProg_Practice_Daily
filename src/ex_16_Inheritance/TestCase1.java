package ex_16_Inheritance;

public class TestCase1 extends Commontoall {
    void runningTC1()
    {
        startBrowser();// Extending Commontoall Behaviour
        System.out.println("Running the TC1");
        closeBrowser();// Extending Commontoall Behaviour
    }
}
