//package tests;
//
//import api.pojo.responses.all_courses.AllCourses;
//import io.restassured.http.ContentType;
//import org.apache.http.HttpStatus;
//import org.testng.annotations.Test;
//import utilities.api_driver.RequestBuilder;
//import utilities.api_driver.RequestMethod;
//
//public class TestGetAllCourses {
//
//    @Test
//    public void getNumberOfCourses() {
////        AllCourses allCourses =
////                RestAssured.given().expect().defaultParser(Parser.JSON).when().get("https://www.rahulshettyacademy.com/api/course").as(AllCourses.class);
//        AllCourses allCourses =
//                RequestBuilder.performRequest("https://www.rahulshettyacademy.com", null, "/tests/course", null, RequestMethod.GET, null, null, null, null, HttpStatus.SC_OK, true, ContentType.JSON).as(AllCourses.class);
//        System.out.println(allCourses.getCourses());
//    }
//}
