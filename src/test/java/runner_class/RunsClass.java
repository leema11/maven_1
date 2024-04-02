package runner_class;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import base_class.baseClass;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\features_class\\new.feature", glue= "step_class" , dryRun=false)

public class RunsClass extends baseClass {
	@BeforeClass
	public static void start () {
		browserlaunch();
		maximise();
		
	}
	

	
	
	
 



}


