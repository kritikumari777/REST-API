package apitesting;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class DeletDestroy {

	
	@Test
	public void DeletMathod() {
		
	    baseURI = "https://reqres.in";
	     
		given().delete("/api/users/2").
		then(). statusCode(204).
		and().log().all();
		
	}
}
