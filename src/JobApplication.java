public class JobApplication {

    private String company;
    private String role;
    private String status;

    public JobApplication(String company, String role, String status) {
        this.company = company;
        this.role = role;
        this.status = status;
    }

    public void displayJob() {
        System.out.println(
            company + " | " + role + " | " + status
        );
    }
}