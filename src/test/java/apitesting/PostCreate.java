package apitesting;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class PostCreate {

	
	@Test
	public void postMethod() {
		
	    baseURI = "https://reqres.in";
	    
	    JSONObject obj = new JSONObject();
	    obj.put("name", "morpheus");
	    obj.put("job", "leader");
	     
		     
		given().body(obj.toJSONString()).
		when().post("/api/users").
		then(). statusCode(201).log().all();
			
		}
		
		
	}

