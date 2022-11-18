//
//package network;
//
///**
// *
// * @author sebas
// */
//
//import java.io.BufferedInputStream;
//import java.io.InputStream;
//import java.io.OutputStream;
//import java.net.HttpURLConnection;
//import java.net.URL;
//import java.util.Scanner;
//import org.json.simple.JSONArray;
//import org.json.simple.JSONObject;
//import org.json.simple.parser.JSONParser;
//
//public class MainGet {
//
////    public static void main(String[] args) {
////        HttpClient httpClient = HttpClientBuilder.create().build();
////        try {
////            HttpPost request = new HttpPost("http://yoururl");
////            StringEntity params = new StringEntity("details={\"name\":\"xyz\",\"age\":\"20\"} ");
////            request.addHeader("content-type", "application/x-www-form-urlencoded");
////            request.setEntity(params);
////            HttpResponse response = httpClient.execute(request);
////        } catch (Exception ex) {
////        } finally {
////            // @Deprecated httpClient.getConnectionManager().shutdown(); 
////        }
////    }
//    
//    public static void main3(String[] args) {
//        
//        
//    }
//    
//    public static void main(String[] args) {
//        try {
//
//            URL url = new URL("https://api.steinhq.com/v1/storages/63644dfbeced9b09e9a351e4/users?search={\"name\":\"Merlin\"}");
//
//            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
//            conn.setRequestMethod("GET");
//            conn.connect();
//
//            //Getting the response code
//            int responsecode = conn.getResponseCode();
//
//            if (responsecode != 200) {
//                throw new RuntimeException("HttpResponseCode: " + responsecode);
//            } else {
//
//                String inline = "";
//                Scanner scanner = new Scanner(url.openStream());
//
//                //Write all the JSON data into a string using a scanner
//                while (scanner.hasNext()) {
//                    inline += scanner.nextLine();
//                }
//
//                //Close the scanner
//                scanner.close();
//
//                //Using the JSON simple library parse the string into a json object
//                JSONParser parse = new JSONParser();
//                JSONArray arr = (JSONArray) parse.parse(inline);
//                
//                //System.out.println(data_obj);
//                //Get the required object from the above created object
////                JSONObject obj = (JSONObject) data_obj.get("Global");
////
////                //Get the required data using its key
////                System.out.println(obj.get("TotalRecovered"));
////
////                  JSONArray arr = (JSONArray) data_obj.get("Countries");
////
//                for (int i = 0; i < arr.size(); i++) {
//
//                    JSONObject new_obj = (JSONObject) arr.get(i);
//
//                    System.out.println(new_obj);
////                    if (new_obj.get("Slug").equals("niger")) {
////                        System.out.println("****");
////                        System.out.println("Total Recovered: " + new_obj.get("TotalRecovered"));
////                        break;
////                    }
//                }
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//}
