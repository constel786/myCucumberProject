package base_urls;

import io.cucumber.java.Before;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class MedunnaBaseUrl {
    public static RequestSpecification spec;

    public static void setSpec(){
         spec = new RequestSpecBuilder()
                .setBaseUri("https://medunna.com")
                .setContentType(ContentType.JSON)
                .addHeader("Authorization", "Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJtYXJrX3R3YWluIiwiYXV0aCI6IlJPTEVfQURNSU4iLCJleHAiOjE2OTI5NjA1OTh9.wdvbha_BUoEHLZ54npLVntVTCuvAL40OuMs4tezkk8c3eTLoE4WxuOn5_JYVHVOW4_SOtM7vCUPXhy_uZD_91Q")
                .build();
    }
}
