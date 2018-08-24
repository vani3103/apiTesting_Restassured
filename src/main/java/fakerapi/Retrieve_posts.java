package fakerapi;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Retrieve_posts {
@Test
public void get_01()
{
	String url="http://localhost:3000/posts";
	RestAssured.baseURI=url;
	Response response=given().when().get();
	System.out.println(response.asString());
}
}
