//Student.java

public class Student {
    private String name;
    private int prn;
    private String branch;
    private String batch;
    private float cgpa;

    public Student(String name, int prn, String branch, String batch, float cgpa) {
        this.name = name;
        this.prn = prn;
        this.branch = branch;
        this.batch = batch;
        this.cgpa = cgpa;
    }

    // Getters
    public String getName() { return name; }
    public int getPRN() { return prn; }
    public String getBranch() { return branch; }
    public String getBatch() { return batch; }
    public float getCGPA() { return cgpa; }

    // Setters
    public void setName(String name) { this.name = name; }
    public void setBranch(String branch) { this.branch = branch; }
    public void setBatch(String batch) { this.batch = batch; }
    public void setCGPA(float cgpa) { this.cgpa = cgpa; }

    public void display() {
        System.out.println("Name: " + name + " | PRN: " + prn + " | Branch: " + branch + " | Batch: " + batch + " | CGPA: " + cgpa);
    }
}
