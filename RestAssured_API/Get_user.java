package API_Automation;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class Get_user
{
@Test
	void get()
	{
		RestAssured.baseURI="https://gorest.co.in/";
		
		RequestSpecification request=RestAssured.given();
		Response response=request.get("/public/v1/users/1805");
		
		Assert.assertEquals(response.statusCode(), 200);
		
		System.out.println(response.getBody().asPrettyString());
		
	}
}
