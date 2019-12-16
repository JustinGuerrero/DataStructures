package Project_Three_GraphSearch;

import Program_two_BinarySearchTree.BinarySearchTree;
import Program_two_BinarySearchTree.Queue;

/**
 * create a class to use as a generic type for our linked list in binary tree
 * each piece of data has its own private string, and associated index
 *
 */
public class MSUCOURSES<T> {
    ClassData c = new ClassData();
    static BinarySearchTree bin = new BinarySearchTree();
    static Queue q = new Queue();
    private String openSeats;
    private String instructor;
    private String courseLength;
    private String department;
    private String type;
    private String crn;
    private String credits;
    private String length;
    /*
    variables in use
     */
    private static String sectionNumber;
    private static String courseNumber;
    private static String courseName;
    private static String seats;
    private static String days;
    private static String location;
    private String newCourseNumber;
    private String labOrLecture;


    /**
     * constructor
     *
     */
    public MSUCOURSES(){

    }

    /**
     * function to parse the data
     * @param row
     */
    public boolean dataSplit(String row){
        String[] data = row.split(",");
        courseNumber = data[1];
        courseName = data[2];
        instructor =  data[7] + data[8];
        return true;

    }

    /**
     * splits the course number and section
     */
    public void courseSection(){
        sectionNumber = (courseNumber.split("-"))[1];
        newCourseNumber = (courseNumber.split("-")[0]);
    }

    /**
     *  formated get key method to return the value for the trees key value pair
     * @return
     */


    public String getKey(int j, ClassData[] arr) {
        courseSection();
        //System.out.println(newCourseNumber + instructor);
       // System.out.println(instructor);
        arr[j].setClass(newCourseNumber);
        arr[j].setTeacherName(instructor);
       // System.out.println(arr[j].toString());
        //System.out.println(newCourseNumber + " " + instructor);
        return String.format("%s-%s", newCourseNumber, instructor);
    }

    public String getTeacher(){ return instructor; }

    public boolean compareString(String name, String name2){
        if (name.length() == name2.length()){
            for (int i = 0; i < name.length(); i++) {
                if (name.charAt(i) == name2.charAt(i)){
                   // System.out.println(name);
                    continue;
                }
                else {
                    return false;
                }
            }
        }
        return true;
    }

    public String getClassNumber(){
        courseSection();
        return newCourseNumber; }
}


