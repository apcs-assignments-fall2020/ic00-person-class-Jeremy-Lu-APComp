public class Person {
    private String first_name;
    private String last_name;
    
    public Person(String first_name, String last_name){
        this.first_name = first_name;
        this.last_name = last_name;
    }
    public Person(){
        this.first_name = "Jeremy";
        this.last_name = "Lu";
    }
    public void doSomething(){
        System.out.println("I am studying for a CompSci Test!");
    }
    public String toString(){
        String str = "First name: " + first_name + ", Last name: " + last_name;
        return str;
    }
    public String getFName(){
        return this.first_name;
    }
    public String getLName(){
        return this.last_name;
    }
    public void setFName(String first_name) {
        // Don't allow blank names
        if (first_name.trim().length() != 0) {
            this.first_name = first_name;
        }
    }
    public void setLName(String last_name) {
        // Don't allow blank names
        if (last_name.trim().length() != 0) {
            this.last_name = last_name;
        }
    }
}













