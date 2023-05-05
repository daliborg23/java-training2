package Classroom;

public class Classroom {
    private Teacher teacher;
    private Student[] students;
    private int currentNumberOfStudents;
    //region GETTERANDSETER
    public Teacher getTeacher() {
        return teacher;
    }
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    public Student[] getStudents() {
        return students;
    }
    public void setStudents(Student[] students) {
        this.students = students;
    }
    public int getCurrentNumberOfStudents() {
        return currentNumberOfStudents;
    }
    public void setCurrentNumberOfStudents(int currentNumberOfStudents) {
        this.currentNumberOfStudents = currentNumberOfStudents;
    }
    //endregion
    public Classroom(int maxStudents) {
        setStudents(new Student[maxStudents]);
    }
    public Boolean addStudent(Student student) {
        if (students.length == getCurrentNumberOfStudents()) {
            System.out.println("Trida je plna, nelze pridat dalsiho studenta. " + student.getFirstName() + " " + student.getLastName());
            return false;
        }
        else {
            students[currentNumberOfStudents++] = student;
            System.out.println("Pridan student " + student.getFirstName() + " " + student.getLastName());
            return true;
        }
        // pridani studenta vzdy na konec asi ok
    }
    public Boolean removeStudent(Student student) {
        if (getStudents().length == 0) {
            System.out.println("Trida je prazdna, nelze odebrat dalsiho studenta. " + student.getFirstName() + " " + student.getLastName());
            return false;
        }
        else {
            System.out.println("Odebran student " + student.getFirstName() + " " + student.getLastName());
            for (int i = 0; i < getCurrentNumberOfStudents(); i++) {
                if (students[i] != null && students[i].equals(student)) {
                    students[i] = null;
                    break;
                }
            }
            for (int i = 0; i < students.length - 1; i++) {
                for (int j = 1; j < students.length - 1; j++) {
                    if (students[i] == null) {
                        students[i] = students[i + 1];
                        students[i + 1] = null;
                    }
                }
            }
            currentNumberOfStudents -= 1;
            return true;
        }
        // pri odebrani studenta nekde uprostred se musi cele pole setrepat
        // List > pole...
    }
    public Boolean addTeacher(Teacher teacher) {
        if (getTeacher() != null) {
            System.out.println("Trida uz tridniho ucitele ma.");
            return false;
        }
        else {
            setTeacher(teacher);
            System.out.println("Novy tridni ucitel " + teacher.getFullName() + " prirazen do tridy.");
            return true;
        }
    }
    public Boolean removeTeacher(Teacher teacher) {
        if (teacher == null) {
            System.out.println("Trida zadneho tridniho ucitele nema.");
            return false;
        }
        else {
            System.out.println("Tridni ucitel " + teacher.getFullName() + " odebran ze tridy.");
            this.teacher = null; // ?
            return true;
        }
    }
    @Override
    public String toString() {
        String s = "------------------------------------------------------\n";
        s += "| Tridni ucitel: " + teacher.getFullName() + "                         |\n";
        //s += Teacher.ToString();
        s += "------------------------------------------------------\n";
        s += "| Seznam zaku:                            celkem: " + String.format("%2d",currentNumberOfStudents) + " |\n";
        s += "------------------------------------------------------\n";
        for (Student student : students) {
            if (student != null) {
                s += student.toString() + "\n";
            }
        }
        s += "------------------------------------------------------\n";
        return s;
    }

}
