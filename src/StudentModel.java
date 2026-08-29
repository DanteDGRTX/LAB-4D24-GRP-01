public class StudentModel {

    private String name;
    private String email;

    public StudentModel(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void showStudent() {
        System.out.println("Estudiante: " + name + " - " + email);
    }
}