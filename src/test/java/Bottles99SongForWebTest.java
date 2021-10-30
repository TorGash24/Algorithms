import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.List;

public class Bottles99SongForWebTest {

    private static final String URL = "http://www.99-bottles-of-beer.net/lyrics.html";
    private static final String BOTTLES = " bottles of beer";
    private static final String BOTTLE = " bottle of beer";
    private static final String WALL = " on the wall";
    private static final String NO_MORE = "No more";
    private static final String TAKE = "Take one down and pass it around";
    private static final String GO = "Go to the store and buy some more";
    private static final String COMMA_SPACE = ", ";
    private static final String DOT = ".";
    private static final String ENTER = "\n";
    protected WebDriver driver;

    @BeforeMethod
    public void beforeMethod () {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void afterMethod () {
        driver.close();
        driver.quit();
    }

    public static String getBottles (int index, String bottles) {
        StringBuilder result = new StringBuilder();
        return String.valueOf(result.append(index).append(bottles));
    }

    public static String getBottles (String noMore, String bottles) {
        StringBuilder result = new StringBuilder();
        return String.valueOf(result.append(noMore).append(bottles));
    }

    public static String getWall (String punctuation) {
        StringBuilder result = new StringBuilder();
        return String.valueOf(result.append(WALL).append(punctuation));
    }

    public static String getText (int i, String bottles) {
        StringBuilder result = new StringBuilder();
        result.append(TAKE)
                .append(COMMA_SPACE)
                .append(getBottles(i, bottles))
                .append(getWall(DOT))
                .append(getBottles(i, bottles))
                .append(getWall(COMMA_SPACE))
                .append(getBottles(i, bottles))
                .append(DOT)
                .append(ENTER);
        return String.valueOf(result);
    }
    public static String getText () {
        StringBuilder result = new StringBuilder();
        result.append(TAKE)
                .append(COMMA_SPACE)
                .append(getBottles(NO_MORE.toLowerCase(), BOTTLES))
                .append(getWall(DOT))
                .append(getBottles(NO_MORE, BOTTLES))
                .append(getWall(COMMA_SPACE))
                .append(getBottles(NO_MORE.toLowerCase(), BOTTLES))
                .append(DOT)
                .append(ENTER);
        return String.valueOf(result);
    }

    private static String songLyric () {
        StringBuilder expectedResult = new StringBuilder();
        for (int i = 99; i >=0; i--) {
            if (i ==99) {
                expectedResult
                        .append(getBottles(i, BOTTLES))
                        .append(getWall(COMMA_SPACE))
                        .append(getBottles(i, BOTTLES))
                        .append(DOT)
                        .append(ENTER);
            } else if (i == 0) {
                expectedResult.append(getText());
                expectedResult
                        .append(GO)
                        .append(COMMA_SPACE)
                        .append(99)
                        .append(BOTTLES)
                        .append(getWall(DOT));
            } else if (i != 1) {
                expectedResult.append(getText(i, BOTTLES));
            } else if (i ==1) {
                expectedResult.append(getText(i, BOTTLE));
            }
        }
        return String.valueOf(expectedResult);
    }

    @Test
    public void testBottles99Song () {
        driver.get(URL);
        List<WebElement> pAllTags = driver.findElements(By.xpath("//div[@id = 'main']/p"));
        String expectedResult = songLyric();

        String actualResult = "";
        for (int i = 0; i < pAllTags.size(); i++) {
            actualResult += pAllTags.get(i).getText();
        }

        Assert.assertEquals(actualResult, expectedResult);
    }
}
