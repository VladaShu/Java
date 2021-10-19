package Homework6;

public class Teacher {
    String name;
    String subject;
    String marks;

    Teacher(String name, String subject){
        this.name = name;
        this.subject = subject;
    }

    public String evaluate(Student student){
        int mark = 2 + (int)(Math.random() * 5);
        switch (mark) {
            case (2):
                marks = "отлично";
                break;
            case (3):
                marks = "хорошо";
                break;
            case (4):
                marks = "удовлетворительно";
                break;
            case (5):
                marks = "неудовлетворительно";
                break;
        }
        return "Преподаватель " + name + " оценил студента с именем " + student.name
                + " по предмету " + subject + " на оценку " + marks;
    }
}
