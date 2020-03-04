package homeWork.hw9;

public class Student {
    String studName;
    String course;
    String group;

    String subj;
    int  score;

    public Student(String subj, int score)
    {
        this.subj = subj;
        this.score = score;
    }
    public Student()
    {
    }


    public String getStudName()
    {
        return studName;
    }
    void setStudName(String studName)
    {
        if(studName == null || studName.isEmpty() || studName.isBlank())
        {
            return; //если прислали фигню, ничего не вносим
        }
        this.studName = studName;
    }

    public String getCourse()
    {
        return course;
    }
    void setCourse(String course)
    {
        if(course == null || course.isEmpty() || course.isBlank())
        {
            return; //если прислали фигню, ничего не вносим
        }
        this.course = course;
    }

    public String getGroup()
    {
        return group;
    }
    void setGroup(String group)
    {
        if(group == null || group.isEmpty() || group.isBlank())
        {
            return; //если прислали фигню, ничего не вносим
        }
        this.group = group;
    }

    @Override
    public String toString() {
        return subj + " = " + score;
    }
}
