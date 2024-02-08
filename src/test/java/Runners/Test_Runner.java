package Runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features= "C:\\Users\\Vigneshsubramaniyan\\Desktop\\OrangeAutoDem\\src\\test\\resources\\Features"
, glue ={"Step"},tags = "@001",plugin = {"pretty","junit:target/Cucu.xml","html:target/Cucu.html"})

public class Test_Runner {
}
