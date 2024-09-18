package part2;

import org.testng.annotations.Test;

public class NavigationTest extends BaseTest{
    @Test
    public void testNavigation(){
        mainPage.navigateToCatalog();
    }
}
