
import org.json.simple.JSONObject;

public class JsonDemo {
	public static void main(String[] args) {
		JSONObject jo = new JSONObject();
		
		jo.put("name", "vuhuan1234");
		jo.put("password", "huan1234");
		System.out.println(jo);
		System.out.println("Name : "+ jo.get("name"));
		System.out.print("Password : " + jo.get("password"));
	}
}