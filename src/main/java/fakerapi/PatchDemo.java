package fakerapi;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
public class PatchDemo {
	@Test
	public void test_03() {
		RestAssured.baseURI="https://localhost:3000";
DataReader datareader=new DataReader();
datareader.setId("103.0");
datareader.setTitle("Baahubali");
Response resp=given().when().contentType(ContentType.JSON).body(datareader).patch("/posts/103.0");
System.out.println(resp.body().asString());
System.out.println(resp.getStatusCode());
}
}
