package apitesting;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class PatchUpdate {
	
		@Test
		public void patchMethod() {
			
		    baseURI = "https://reqres.in";
		     
			given().body(toString()).
			when().patch("/api/users/2").
			then(). statusCode(200).log().all();
			
		}

}