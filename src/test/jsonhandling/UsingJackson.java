package test.jsonhandling;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
//import org.codehaus.jackson.map.ObjectMapper;
//import org.codehaus.jackson.map.annotate.JsonSerialize;
/**
 *
 * @author steve jin (http://www.doublecloud.org)
 */
public class UsingJackson
{
  private static ObjectMapper mapper = new ObjectMapper();
 
  public static void main(String[] args)
  {
    try {
		parseJson();
		
		saveJson();
		 
	    perfTest();
	
	
    } catch (IOException e) {
		
		System.out.println("IO Exception Occured: " + e);
	}
 
    
  }
 
  public static void parseJson() throws IOException
  {
    String jsonStr = "{ \"author\": \"Steve Jin\", \"title\" : \"vSphere SDK\", \"obj\" : {\"objint\" : {}} }";
 
    // parsing JSON to generic object
    Object obj = mapper.readValue(jsonStr, Object.class);
    System.out.println("obj type: " + obj.getClass().toString()); // java.util.LinkedHashMap
    System.out.println("obj: " + obj);
 
    // parsing JSON to Map object
    Map m = mapper.readValue(jsonStr, Map.class);
    System.out.println("map.size: " + m.size());
    for(Object key: m.keySet())
    {
      System.out.println("key:" + key);
    }
 
    // parsing JSON to concrete Object
    Book book = mapper.readValue(jsonStr, Book.class);
    System.out.println("book: " + book);
    System.out.println("book.author: " + book.author);
    System.out.println("book.obj class: " + book.obj.getClass()); //com.google.gson.internal.LinkedTreeMap
    System.out.println("book.obj: " + book.obj);
    System.out.println("book.title: " + book.title);
    
    
  }
 
  public static void saveJson() throws IOException
  {
    Book1 book = new Book1();
    book.author = "Steve Jin";
    book.title = "VMware vSphere and VI SDK";
   /* book.obj.put("A", "65");
    book.obj.put("B", "67");
    book.obj.put("C", "69");*/
 
    mapper.setSerializationInclusion(Include.NON_NULL);
    String bookJson = mapper.writeValueAsString(book);
    //byte[] bookJson = mapper.writeValueAsBytes(book);
    System.out.println("bookJson: " + bookJson);
    
    String actual = mapper.generateJsonSchema(Book.class).toString();
    System.out.println(actual);
    
    String expected = mapper.generateJsonSchema(book.getClass()).toString();
    System.out.println(expected);
    
    System.out.println(actual.equals(expected));
  }
 
  public static void perfTest() throws IOException
  {
    long start = System.nanoTime();
 
    mapper.readValue(new File(".\\src\\main\\resources\\bigjson.txt"), Map[].class);
 
    long end = System.nanoTime();
    System.out.println("Time taken (nano seconds): " + (end - start));
  }
}
 
class Book
{
  public String author;
  public String title;
  public HashMap obj;
}

class Book1
{
  public String author;
  public String title;
  public Map obj;
}