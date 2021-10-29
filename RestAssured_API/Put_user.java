package API_Automation;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class Put_user
{
@Test
	void put()
	{
		RestAssured.baseURI="https://gorest.co.in/";
		
		RequestSpecification request=RestAssured.given();
		
		JSONObject obj=new JSONObject();
		obj.put("name","hacker");
		obj.put("email","hackerking@gmail.com");
		obj.put("gender","male");
		obj.put("status","active");
		
		request.header("Content-Type","application/json");
		request.body(obj.toJSONString());
		
		Response response=request.put("/public/v1/users/1805?access-token=d0e36bae5a06baa6ee8c1065608f74249b328582c3256f9ba7f470a5356a2be0");
		
		System.out.println(response.getBody().asPrettyString());
		
		Assert.assertEquals(response.statusCode(), 200);
		int statusCode=response.statusCode();
		System.out.println(statusCode);
		
		
	}
}
