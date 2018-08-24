package fakerapi;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class CreateAContact {
	
	Post_Req_Data data=new Post_Req_Data();
	@DataProvider
	public static  Object[][] getauthorinfo() throws Exception{
		Object info[][] = Post_Req_Data.authorinfo();
		return info;
	}
@Test(dataProvider="getauthorinfo")
public void contact(String id,String title,String author)
{
	DataReader datareader=new DataReader();
	datareader.setId(id);
	datareader.setTitle(title);
	datareader.setAuthor(author);
	
	Response response=given().when().contentType(ContentType.JSON).post("http://localhost:3000/posts");
	/*System.out.println(response.getStatusCode());
	System.out.println(response.body().asString());*/
	Assert.assertEquals(response.getStatusCode(), 201);
}
}
