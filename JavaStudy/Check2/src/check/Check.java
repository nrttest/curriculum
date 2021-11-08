package check;

import constants.Constants;

public class Check {
    
    private String firstName;
    private  String lastName;
    
    public Check(String fn,String ln) {
        this.firstName=fn;
        this.lastName=ln;    
    }
    
    private void printName() {
        System.out.println("printNameメソッド→"+this.firstName+this.lastName);        
    }
    
    
    
    public static void main(String[] args) {
        
        Check check=new Check("石賀","成人");
        check.printName();
        
        Pet pet=new Pet(Constants.CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE);
        pet.introduce();
        
        RobotPet robotPet=new RobotPet(Constants.CHECK_CLASS_LUKE,Constants.CHECK_CLASS_R2D2);
        robotPet.introduce();
        
    }

}
