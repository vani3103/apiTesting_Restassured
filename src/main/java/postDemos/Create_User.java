package postDemos;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
public class Create_User {
@BeforeClass
public void setup()
{
	RestAssured.baseURI="https://reqres.in";
}
@Test
public void createuser()
{
	Response response=given().body("{ \"name\":\"illeana dsouza\",\"job\":\"banker\" }").when().contentType(ContentType.JSON).post("/api/users");
			
		//System.out.println(response.getStatusCode());	
		//System.out.println(response.getBody().asString());
		//System.out.println(response.getBody().toString());
		Assert.assertEquals(response.getStatusCode(), 201);
	    
			
}
}
