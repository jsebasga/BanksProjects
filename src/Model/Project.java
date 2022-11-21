package Model;

/**
 *
 * @author sebas
 */
public class Project {
    
    //Private, no se pueden modificar directamente
    private String projectName;
  

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String project) {
        this.projectName = project;
    }

    @Override
    public String toString() {
        return "Projects{" + "project=" + projectName + '}';
    }

}
