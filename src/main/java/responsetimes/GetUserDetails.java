package responsetimes;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;


public class GetUserDetails {
@Test(priority=1)
public void getuser()
{
	String url="https://reqres.in/api/users/2";
	RestAssured.baseURI=url;
	Response response=given().
			get(url);
	Assert.assertEquals(response.statusCode(), 200);
	System.out.println("Responsetime "+response.time()+" milliseconds");
	//System.out.println(response.timeIn(TimeUnit.SECONDS));
	
}
@Test(priority=2)
public void getuser_delayedtimes()
{
	String url="https://reqres.in/api/users?delay=3";
	RestAssured.baseURI=url;
	Response response=given().
			get(url);
	Assert.assertEquals(response.statusCode(), 200);
	System.out.println("Responsetime "+response.time()+" milliseconds");
	//System.out.println(response.timeIn(TimeUnit.SECONDS));
	
}
	
	
}
