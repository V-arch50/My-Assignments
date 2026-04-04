package week1.homeassignments;

public class Browser {

    public String launchbrowser(String browsername)
    {
        System.out.println("Browser launched succesfully");
        return browsername;
    }
    public void loadUrl()
    {
        System.out.println("Application url loaded sucessfully");
    }
    public static void main(String[] args) {
        Browser br = new Browser();

        String name = br.launchbrowser("Chrome");
        System.out.println("Launched Browser = " +name);

        br.loadUrl();
    }
}
