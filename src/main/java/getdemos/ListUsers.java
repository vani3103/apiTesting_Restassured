package getdemos;
/*
 * displaying data on the page,pagenos are reading from the excel sheet using data provider
 * 
 */
import static io.restassured.RestAssured.*;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
public class ListUsers {
@DataProvider
public Integer[][] getpagenos() throws Exception
{
	Integer[][] data=Demo.testdataread();
	return data;
	
}
	
	@Test(dataProvider="getpagenos")
	public void getListOfUsers(int pageno) {
		String url = "https://reqres.in/api/users?page=" + pageno;
		RestAssured.baseURI = url;
		Response response = given().when().get(url);
		//System.out.println("Status code  :  " + response.getStatusCode());
		// System.out.println("Headers are : "+response.getHeaders());
		//System.out.println("Response Body  :" + response.body().asString());
		Assert.assertEquals(response.statusCode(), 200);

	}
}
