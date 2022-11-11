package apitesting;


import static io.restassured.RestAssured.*;
//import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

public class GetRed {
	@Test
	public void givenThen() {
	    baseURI = "https://reqres.in/api";
	     
		given().
		when().get("/users?page=2").
		then().statusCode(200).
		and().body("data[1].id", equalTo(8)).
		 log().all();
		
	}

}
