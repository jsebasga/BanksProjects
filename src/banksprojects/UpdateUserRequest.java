package banksprojects;

/**
 *
 * @author sebas
 */
public class UpdateUserRequest {

    private User condition;
    private User set;

    public User getCondition() {
        return condition;
    }

    public void setCondition(User condition) {
        this.condition = condition;
    }

    public User getSet() {
        return set;
    }

    public void setSet(User set) {
        this.set = set;
    }

}
