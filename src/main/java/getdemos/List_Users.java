package getdemos;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class List_Users {
	@Parameters({"pageno"})
	@Test
	public void getListOfUsers(int pageno) {
		String url = "https://reqres.in/api/users?page=" + pageno;
		RestAssured.baseURI = url;
		Response response = given().when().get(url);
		System.out.println("Status code  :  " + response.getStatusCode());
		// System.out.println("Headers are : "+response.getHeaders());
		System.out.println("Response Body  :" + response.body().asString());

	}
}
