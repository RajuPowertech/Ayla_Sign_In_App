import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.*;

public class ayla {

	public static void main(String[] args) throws JSONException {
		// TODO Auto-generated method stub
		HashMap<String, String> map = new HashMap<String, String>();
		  map.put("email", "aylatest@outlook.com");
		  map.put("password", "uuaaa992");
		  map.put("app_id", "app5d-id");
		  map.put("app_secret", "app5d-UJBxHF1yTP9jYOQhEhcNbQE2ud0");
		  convertMapToJson(map);
		 }
		 /*
		  * convert Map to Json
		  */
		 public static void convertMapToJson(Map map)throws JSONException{
		  
		  JSONObject obj = new JSONObject();
		  JSONObject main = new JSONObject();
		  Set set = map.keySet();
		  
		  Iterator iter = set.iterator();

		     while (iter.hasNext()) {
		      String key = (String) iter.next();
		   obj.accumulate(key, map.get(key));
		     }
		     main.accumulate("data",obj);
		     
		     System.out.println("JSON : "+main.toString());


	}

}
