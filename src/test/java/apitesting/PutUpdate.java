package apitesting;

import static io.restassured.RestAssured.*;
//import static io.restassured.matcher.RestAssuredMatchers.*;
//import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

public class PutUpdate {
	
	@Test
	public void PutMethod() {
		
	    baseURI = "https://reqres.in";
	     
		given().body(toString()).
		when().put("/api/users/2").
		then(). statusCode(200).log().all();
		
	}

}
	
