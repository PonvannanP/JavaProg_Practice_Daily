package ex_16_Inheritance;

public class TestCase2 extends Commontoall {
    void runningTC2()
    {
        startBrowser();// Extending Commontoall Behaviour
        System.out.println("Running the TC2");
        readExcelFile();// Extending Commontoall Behaviour
        readDataBaseFile();// Extending Commontoall Behaviour
        closeBrowser(); //Extending Commontoall Behaviour
    }
}
