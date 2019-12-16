package Program_two_BinarySearchTree;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;
import sun.awt.SunHints;


import java.security.Key;
import java.security.KeyPair;
import java.util.HashMap;
import java.util.Map;

/**
 * create a class to use as a generic type for our linked list in binary tree
 * each piece of data has its own private string, and associated index
 *
 */
public class MSUCOURSES<T> {
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
        crn = data[3];
        seats = data[4];
        days = data[15];
        location = data[16];
        if(data[14].charAt(1) == 'a') {
            return false;
        }

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


    public String getKey(){
        //System.out.println("key");
        return String.format("%s-%s", days, location);
        // "    " + days + "  " + location;
    }//Left justify characters


    /**
     * formated get value method to return the value for the trees key value pair
     * @return
     */
    public String getValue(){
        courseSection();
//        System.out.println(String.format("%s%s%s%s", newCourseNumber, sectionNumber, seats, courseName));
        return (String.format("\t%s\t%s\t%s\t%s\t", newCourseNumber, sectionNumber, seats, courseName));
//"    " + newCourseNumber + "   " + sectionNumber + "       " + seats + "   " + courseName + "    ";
    }

    /**
     * toString method override to return the data
     * @return
     */
    public String toString(){
        courseSection();
        return String.format("%-10s %-3s %-3s %-30s %-27s",newCourseNumber , sectionNumber , seats , courseName , getKey());
                //"        " + newCourseNumber + "\t" + sectionNumber + "\t" + seats + "\t" + courseName + "\t" + getKey();
    }

    public void putEm() {
            bin.put(this.getKey() , this.getValue());

    }
}
