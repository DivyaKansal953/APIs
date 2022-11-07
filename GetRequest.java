import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetRequest {

	@Test
	void getBooksDetails() {
		//specify base uri
		RestAssured.baseURI = "https://rahulshettyacademy.com/angularAppdemo/";
		
		//Request object
		RequestSpecification httpRequest = RestAssured.given();
	    
		//Response object
		Response response =httpRequest.request(Method.GET,"https://rahulshettyacademy.com/Library/GetBook.php?AuthorName=shetty");
	     
		//print response in console window
		String responseBody = response.getBody().asString();
		System.out.println("Response body is:"+responseBody);
	}
}
