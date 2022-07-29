
public class Model {
    private String first_name;
    private String last_name;
    private String gender;
    private String meals;
    private String leaving_from;
    private String going_to;
    

    public Model(String first_name, String last_name, String gender, String meals, String leaving_from,String going_to) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.gender = gender;
        this.meals = meals;
        this.leaving_from = leaving_from;
        this.going_to = going_to;
        
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender =  gender;
    }

    public String getMeals() {
        return meals;
    }

    public void setMeals(String meals) {
        this.meals = meals;
    }

    public String getLeaving_from() {
        return leaving_from;
    }

    public void setLeaving_from(String leaving_from) {
        this.leaving_from = leaving_from;
    }

    public String getGoing_to() {
        return going_to;
    }

    public void setGoing_to(String going_to) {
        this.going_to = going_to;
    }

   

    
    
    
}
