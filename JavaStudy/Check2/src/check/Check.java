package check;

import constants.Constants;

public class Check {
    
    private static String firstName="石賀";
    private static  String lastName="成人";
    
    private static void printName(String fName,String lName) {
        System.out.println("printNameメソッド→"+fName+lName);        
    }
    
    public static void main(String[] args) {
        
        printName(firstName,lastName);
        
        Pet pet=new Pet(Constants.CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE);
        pet.introduce();
        
        RobotPet robotPet=new RobotPet(Constants.CHECK_CLASS_LUKE,Constants.CHECK_CLASS_R2D2);
        robotPet.introduce();
        
    }
}