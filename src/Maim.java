public class Main {
    public static void main(String[] args) {

        JobApplication job1 =
            new JobApplication("Google", "Software Engineer", "Applied");

        JobApplication job2 =
            new JobApplication("Amazon", "Java Developer", "Interview");

        job1.displayJob();
        job2.displayJob();
    }
}