
package banksprojects;

/**
 *
 * @author sebas
 */
public class User {
    
    //Private, no se pueden modificar directamente
    
    private String name;
    private String lastName;
    private String rol;
    private String email;
    private String password;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" + "name=" + name + ", lastName=" + lastName + ", rol=" + rol + ", email=" + email + ", password=" + password + ", id=" + id + '}';
    }
    
 
    
}
