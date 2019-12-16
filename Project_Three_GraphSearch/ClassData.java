package Project_Three_GraphSearch;

public class ClassData {
    private String className = "" ;
    private String teacherName = "";

    public ClassData(){}

    public String setClass(String data){
        className = data;
        return className;
    }

    public void setTeacherName(String data){
        teacherName = data;
    }

    public String getClassName(){
        return className;
    }

    public String getTeacherName(){
     return teacherName;
    }
}
