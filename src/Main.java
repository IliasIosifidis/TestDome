import java.util.HashMap;
import java.util.Map;

public class Main {

  static Object getAppSettings(boolean detailed){
    if (detailed){
      Map<String, String > map = new HashMap<>();
      map.put("os", System.getProperty("os.name"));
      map.put("machine", System.getProperty("device.name"));
      map.put("user", System.getProperty("user.name"));
      return map;
    }
    return System.getProperty("device.name");
  }

  static void main() {
    Object appSettings = getAppSettings(true);
//    System.out.println(appSettings.get("os"));
  }
}
