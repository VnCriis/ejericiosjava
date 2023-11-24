public class Materias {
    public String students;
    public String subjects;
    public double grades;
    public double average;
    public Materias(String marca, String modelo, String year, int cilindraje) {
        this.students = students;
        this.subjects = subjects;
        this.grades = grades;
        this.average = average;
    }

    public Materias(String students, String subjects, double grades, double average) {
        this.students = students;
        this.subjects = subjects;
        this.grades = grades;
        this.average = average;
    }

    public String getStudents() {
        return students;
    }

    public String getSubjects() {
        return subjects;
    }

    public double getGrades() {
        return grades;
    }

    public double getAverage() {
        return average;
    }

    public void setStudents(String students) {
        this.students = students;
    }

    public void setSubjects(String subjects) {
        this.subjects = subjects;
    }

    public void setGrades(double grades) {
        this.grades = grades;
    }

    public void setAverage(double average) {
        this.average = average;
    }
}
