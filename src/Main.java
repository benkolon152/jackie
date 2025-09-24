import java.io.FileNotFoundException;

public class Main {
    private static void debugger(){
        int i = 0;
    }

    public static void main(String[] args) throws FileNotFoundException {
        //1.feladat: Jackie

        //2.feladat:
        JackieService service = new JackieService("src/jackie.txt");

        System.out.println("3.feladat: " + service.getLinesLength());
        debugger();
    }
}