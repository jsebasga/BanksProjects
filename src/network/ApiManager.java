package network;

import banksprojects.DeleteProjectRequest;
import banksprojects.DeleteUserRequest;
import banksprojects.Project;
import banksprojects.UpdateUserRequest;
import banksprojects.User;
import com.google.gson.Gson;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author sebas
 */
public class ApiManager {

    private static String apiURL = "https://api.steinhq.com/v1/storages/63644dfbeced9b09e9a351e4/";

    //Crear usuario
    public void createUser(User user) {

        //Inicia el proceso de creacion
        System.out.println("Creando Usuario");

        User users[] = new User[1];
        users[0] = user;

        // 1. Transformar User to JSON
        Gson gson = new Gson();
        String userJSON = gson.toJson(users);
        System.out.println(userJSON);

        // 2. Enviar JSON to API
        try {

            // Crear el requests y ejecutarlo
            URL url = new URL(apiURL + "users");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setConnectTimeout(5000);
            conn.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
            conn.setDoOutput(true);
            conn.setDoInput(true);
            conn.setRequestMethod("POST");

            OutputStream os = conn.getOutputStream();
            os.write(userJSON.getBytes("UTF-8"));
            os.close();

            // read the response
            printRequestResponse(conn);

            conn.disconnect();

        } catch (IOException e) {

            System.out.println(e);
        }
    }

    // Crear Proyectos
    
    public void createProject(Project project) {

        //Inicia el proceso de creacion
        System.out.println("Creando Project");

        Project comments[] = new Project[1];
        comments[0] = project;

        // 1. Transformar User to JSON
        Gson gson = new Gson();
        String projectJSON = gson.toJson(comments);
        System.out.println(projectJSON);

        // 2. Enviar JSON to API
        try {

            // Crear el requests y ejecutarlo
            URL url = new URL(apiURL + "projects");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setConnectTimeout(5000);
            conn.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
            conn.setDoOutput(true);
            conn.setDoInput(true);
            conn.setRequestMethod("POST");

            OutputStream os = conn.getOutputStream();
            os.write(projectJSON.getBytes("UTF-8"));
            os.close();

            // read the response
            printRequestResponse(conn);

            conn.disconnect();

        } catch (IOException e) {

            System.out.println(e);
        }
    }

    // Leer Proyectos
    public ArrayList<Project> readProjects() {

        ArrayList<Project> projectsList = new ArrayList<Project>();

        System.out.println("Validacion Proyecto");

        try {

            URL url = new URL(apiURL + "projects");

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();

            //Getting the response code
            int responsecode = conn.getResponseCode();

            if (responsecode != 200) {
                throw new RuntimeException("HttpResponseCode: " + responsecode);
            } else {

                String inline = "";
                Scanner scanner = new Scanner(url.openStream());

                //Write all the JSON data into a string using a scanner
                while (scanner.hasNext()) {
                    inline += scanner.nextLine();
                }

                //Close the scanner
                scanner.close();

                //Using the JSON simple library parse the string into a json object
                JSONParser parse = new JSONParser();
                JSONArray arr = (JSONArray) parse.parse(inline);

                for (int i = 0; i < arr.size(); i++) {

                    JSONObject projectResponse = (JSONObject) arr.get(i);

                    Gson gson = new Gson();

                    Project project = gson.fromJson(projectResponse.toString(), Project.class);
                    projectsList.add(project);

                    System.out.println(projectResponse);

                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return projectsList;
    }

    // Eliminar Proyectos
    
    public void deleteProject(Project project) {

        //Inicia el proceso de eliminacion
        System.out.println("Eliminando Project");

        DeleteProjectRequest deleteRequest = new DeleteProjectRequest();
        deleteRequest.setCondition(project);

        // 1. Transformar User to JSON
        Gson gson = new Gson();
        String deleteRequestJSON = gson.toJson(deleteRequest);
        System.out.println(deleteRequestJSON);

        // 2. Enviar JSON to API
        try {

            // Crear el requests y ejecutarlo
            URL url = new URL(apiURL + "projects");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setDoOutput(true);
            conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            conn.setRequestMethod("DELETE");
            conn.connect();

            OutputStream os = conn.getOutputStream();
            os.write(deleteRequestJSON.getBytes("UTF-8"));
            os.close();

            // read the response
            printRequestResponse(conn);

            conn.disconnect();

        } catch (IOException e) {

            System.out.println(e);
        }
    }

    // Actualizar usuario
    public void updateUser(User currentUser, User newUser) {
        
        //Inicia el proceso de actualizacion de datos
        System.out.println("Actualizando datos");

        UpdateUserRequest updateRequest = new UpdateUserRequest();
        updateRequest.setCondition(currentUser);
        updateRequest.setSet(newUser);
        
        // 1. Transformar User to JSON
        Gson gson = new Gson();
        String updateRequestJSON = gson.toJson(updateRequest);
        System.out.println(updateRequestJSON);

        // 2. Enviar JSON to API
        try {

            // Crear el requests y ejecutarlo
            URL url = new URL(apiURL + "users");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setDoOutput(true);
            conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            conn.setRequestMethod("PUT");
            conn.connect();

            OutputStream os = conn.getOutputStream();
            os.write(updateRequestJSON.getBytes("UTF-8"));
            os.close();

            // read the response
            printRequestResponse(conn);

            conn.disconnect();

        } catch (IOException e) {

            System.out.println(e);
        }
    }

    // Leer usuario
    public User readUser(User user) {

        User userResponse = new User();

        System.out.println("Validacion Login");

        try {

            URL url = new URL(apiURL + "users?search={\"email\":\"" + user.getEmail() + "\"}");

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();

            //Getting the response code
            int responsecode = conn.getResponseCode();

            if (responsecode != 200) {
                throw new RuntimeException("HttpResponseCode: " + responsecode);
            } else {

                String inline = "";
                Scanner scanner = new Scanner(url.openStream());

                //Write all the JSON data into a string using a scanner
                while (scanner.hasNext()) {
                    inline += scanner.nextLine();
                }

                //Close the scanner
                scanner.close();

                //Using the JSON simple library parse the string into a json object
                JSONParser parse = new JSONParser();
                JSONArray arr = (JSONArray) parse.parse(inline);

                for (int i = 0; i < arr.size(); i++) {

                    JSONObject new_obj = (JSONObject) arr.get(i);

                    Gson gson = new Gson();

                    userResponse = gson.fromJson(new_obj.toString(), User.class);
                    System.out.println(userResponse);

                    System.out.println(new_obj);

                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return userResponse;
    }

    // Eliminar usuario
    public void deleteUser(User user) {

        //Inicia el proceso de eliminacion de cuenta
        System.out.println("Eliminando User");

        DeleteUserRequest userRequest = new DeleteUserRequest();
        userRequest.setCondition(user);

        // 1. Transformar User to JSON
        Gson gson = new Gson();
        String userRequestJSON = gson.toJson(userRequest);
        System.out.println(userRequestJSON);

        // 2. Enviar JSON to API
        try {

            // Crear el requests y ejecutarlo
            URL url = new URL(apiURL + "users");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setDoOutput(true);
            conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            conn.setRequestMethod("DELETE");
            conn.connect();

            OutputStream os = conn.getOutputStream();
            os.write(userRequestJSON.getBytes("UTF-8"));
            os.close();

            // read the response
            printRequestResponse(conn);

            conn.disconnect();

        } catch (IOException e) {

            System.out.println(e);
        }
    }

    private void printRequestResponse(HttpURLConnection conn) throws IOException {

        // read the response
        InputStream in = new BufferedInputStream(conn.getInputStream());
        String result = org.apache.commons.io.IOUtils.toString(in, "UTF-8");
        System.out.println(result);

        in.close();
    }
}
