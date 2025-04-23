package ex_17_Polymorphism;

public class Methodoverriding_RealExample_Automation {
    public static void main(String[] args) {
        ChromeTC c1=new ChromeTC();
        c1.openBrowser(); // chromeBrowser function will execute

        Firefox f1=new Firefox();
        f1.openBrowser(); // Firefox function will execute

        CommontoAll c2=new CommontoAll();
        c2.openBrowser();// // Commontoall function will execute

        // Dynamic Dispatch
        CommontoAll c3=new ChromeTC();
        c3.openBrowser(); // Chrome function will execute

        CommontoAll c4=new Firefox();
        c4.openBrowser(); // Firefox function will execute

        // Firefox f2=new ChromeTC(); // Not possible because there is no relation


    }
}

class CommontoAll
{
    void openBrowser()
    {
        System.out.println("Open the IE Browser!...");
    }
}

class ChromeTC extends CommontoAll
{
    @Override
    void openBrowser() { // Overrides the CommontoAll class function
        System.out.println("Chrome will open now!...");
    }
}

class Firefox extends CommontoAll
{
    void openBrowser() // Overrides the CommontoAll class function
    {
        System.out.println("Firefox will start!...");
    }
}

