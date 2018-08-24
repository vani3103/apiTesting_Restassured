package getdemos;
import static io.restassured.RestAssured.*;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class List_Users1 {
	
	@DataProvider(name="pagenos")
	public Object[][] pagenos()
	{
		return new Object[][] {
			{"1"},{"2"},{"3"},{"4"}
		};
	}
	@Test(dataProvider="pagenos")
	public void getListOfUsers(String pageno) {
		String url = "https://reqres.in/api/users?page=" + pageno;
		RestAssured.baseURI = url;
		Response response = given().when().get(url);
		System.out.println("Status code  :  " + response.getStatusCode());
		// System.out.println("Headers are : "+response.getHeaders());
		System.out.println("Response Body  :" + response.body().asString());

	}
}
