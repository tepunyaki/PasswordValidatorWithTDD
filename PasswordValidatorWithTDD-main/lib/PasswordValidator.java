package lib;

public class PasswordValidator {

    /**
     * คุณจะต้องเขียน Javadoc ที่สมบูรณ์ที่นี่ในอนาคต
     * เพื่ออธิบายกฎการทำงานของเมธอด
     * @param password string ที่ต้องการตรวจสอบ
     * @return PasswordStength INVALID อื่นๆ
     */
    //
    public static PasswordStrength validate(String password) { // Function Type ให้เป็น PasswordStrength 
        int minlength = 8 ;
        int countLower = 0;
        int countUpper = 0 ;
        int countNum = 0 ;

        if(password == null || password.length()< minlength){
            return PasswordStrength.INVALID;
        }
        for (char c : password.toCharArray()){
            if (Character.isLowerCase(c)){countLower++ ;}
            else if (Character.isUpperCase(c)){countUpper++ ;}
            else if (Character.isDigit(c)){countNum++ ;} 
        }

         int count = 0;
         for (char c : password.toCharArray()){
            if (Character.isLowerCase(c))
            count++ ;
         }
        if (count==password.length() || countLower == password.length()){
            return PasswordStrength.WEAK;
        }
        if ((countUpper > 0) && (countLower > 0 ) ){
            return PasswordStrength.MEDIUM;
        }
        return PasswordStrength.STRONG;
        
         
        
       
    }
}