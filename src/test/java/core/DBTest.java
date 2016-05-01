package core;

import net.sf.testng.databinding.DataBinding;
import net.sf.testng.databinding.TestInput;
import net.sf.testng.databinding.TestOutput;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static java.lang.Integer.parseInt;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

@Test
public class DBTest {
    ///**********************CSV************************************
    @DataBinding
    public void testSumCSV(
            @TestInput(name = "x") int x,
            @TestInput(name = "y") int y,
            @TestOutput(name = "sum") int sum) {
        assertThat(x + y, is(equalTo(sum)));
        System.out.println("groups csv passed");
    }

    @DataBinding
    public void testSubstructCSV(
            @TestInput(name = "first") int a,
            @TestInput(name = "second") int b,
            @TestOutput(name = "result") int resultS) {
        assertThat(a - b, is(equalTo(resultS)));

        System.out.println("groups csv test SubstructCSV method is passed");
    }

    @DataBinding
    public void testMultiplyCSV(
            @TestInput(name = "first") int a,
            @TestInput(name = "second") int b,
            @TestOutput(name = "result") int resultM) {
        assertThat(a * b, is(equalTo(resultM)));

        System.out.println("groups csv testMultiplyCSV method is passed");
    }

    @DataBinding
    public void testDivideCSV(
            @TestInput(name = "first") int a,
            @TestInput(name = "second") int b,
            @TestOutput(name = "result") int resultD) {
        assertThat(a / b, is(equalTo(resultD)));

        System.out.println("groups csv test DivideCSV method is passed");
    }

    ///**********************PRPOPERTIES************************************

    @DataBinding
    public void testSumProperties(
            @TestInput(name = "x") int x,
            @TestInput(name = "y") int y,
            @TestOutput(name = "sum") int sum) {
        assertThat(x + y, is(equalTo(sum)));
        System.out.println("groups Sum properties passed");
    }


    @DataBinding
    public void testGetTitleProperties(
            @TestInput(name = "url") String url,
            @TestInput(name = "title_expected") String title_expected
    ) {

        WebDriver driver = new FirefoxDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        System.out.println();
        String title_actual =
                driver.getTitle();
        assertThat(title_expected, is(equalTo(title_actual)));

        System.out.println("groups TitleValidation method properties passed");
        driver.quit();
    }

    @DataBinding
    public void testCircleProperties(
            @TestInput(name = "radius") Double r,
            //  @TestInput(name = "y") int y,
            @TestOutput(name = "aria") Double aria) {
        assertThat(Math.PI * r * r, is(equalTo(aria)));
        System.out.println("groups Get Circle Aria  properties passed");
    }

    ///*******************XML***************************************

    @DataBinding
    public void testSumXML(
            @TestInput(name = "x") int x,
            @TestInput(name = "y") int y,
            @TestOutput(name = "sum") int sum) {
        assertThat(x + y, is(equalTo(sum)));

        System.out.println("groups testSumXML method with xml passed");
    }

    @DataBinding
    public void testDivideXML(
            @TestInput(name = "x") int x,
            @TestInput(name = "y") int y,
            @TestOutput(name = "sum") int resultD) {
        assertThat(x / y, is(equalTo(resultD)));

        System.out.println("groups testDivideXML method with xml passed");
    }


    @DataBinding
    public void testMultipleTitleXML(
            @TestInput(name = "url") String url,
            @TestInput(name = "title") String title_expected
    ) {
        WebDriver br = new FirefoxDriver();
        br.get(url);
        br.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        System.out.println();
        String title_actual = br.getTitle();
        assertThat(title_expected, is(equalTo(title_actual)));

        System.out.println("groups test MultipleTitleXML method with xml passed");
        br.quit();
    }

    ///*******************TEXT***************************************

    @DataBinding
    public void testSumText(
            @TestInput(name = "x") String x,
            @TestInput(name = "y") String y,
            @TestOutput(name = "sum") String sum) {
        assertThat(parseInt(x) + parseInt(y), is(equalTo(parseInt(sum))));
        System.out.println("groups text passed");
    }

    ///*********************JSON*************************************

    @DataBinding
    public void testSumJSON(
            @TestInput(name = "x") int x,
            @TestInput(name = "y") int y,
            @TestOutput(name = "sum") int sum) {
        assertThat(x + y, is(equalTo(sum)));
        System.out.println("groups json passed");
    }

    @DataBinding
    public void testMultipleTitleJSON(
            @TestInput(name = "url") String url,
            @TestInput(name = "title") String title_expected
    ) {
        WebDriver br = new FirefoxDriver();
        br.get(url);
        br.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        System.out.println();
        String title_actual = br.getTitle();
        assertThat(title_expected, is(equalTo(title_actual)));

        System.out.println("groups test MultipleTitleJSON method with xml passed");
        br.quit();
    }
}