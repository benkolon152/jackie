package test;

import org.junit.Test;

public class JackieTest {
    @Test
    public void testJackie(){
        JackieService service = new JackieService("src/jackie.txt");

        System.out.println("3.feladat: " + service.getLinesLength());
    }
}
