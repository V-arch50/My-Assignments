package week1.homeassignments;

public class EdgeBrowser {
    public static void main(String[] args) {
        Browser br = new Browser();

        String name = br.launchbrowser("Edge");
        System.out.println("Lanched Browser = " +name);

        br.loadUrl();

    }

}
