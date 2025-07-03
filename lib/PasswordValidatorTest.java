package lib;

public class PasswordValidatorTest{
    
    public static void run() {
        System.out.println("--- Running Password Validator Tests ---");
        
        // Test Case 1: รหัสผ่านสั้นจะ INVALID
        String pw = "123";
        PasswordStrength result1 = PasswordValidator.validate(pw);
        if (result1 == PasswordStrength.INVALID) {
            System.out.println("Test Case 1 Passed "+pw+" : Short password is INVALID.");
        } else {
            System.out.println("Test Case 1 FAILED "+pw+": Expected INVALID but got " + result1);
        }

        // Test Case 2: ถ้ารหัสตัวเลขซ้ำกันจะ WEAK
        pw = "1111111111";
        PasswordStrength result2 = PasswordValidator.validate(pw);
        if (result1 == PasswordStrength.INVALID) {
            System.out.println("Test Case 2 Passed "+pw+" :  password is WEAK.");
        } else {
            System.out.println("Test Case 2 FAILED "+pw+": Expected INVALID but got " + result2);
        }


         // Test Case 3: ถ้ารหัสเป็นตัวใหญ่และตัวเล็ก MEDIUM
         pw = "punInwza";
        PasswordStrength result3 = PasswordValidator.validate(pw);
        if (result1 == PasswordStrength.INVALID) {
            System.out.println("Test Case 3 Passed "+pw+" : password is MEDIUM.");
        } else {
            System.out.println("Test Case 3 FAILED "+pw+": Expected INVALID but got " + result3);
        }


         // Test Case 4: ถ้ารหัสผ่านมีทั้งตัวเล็ก ตัวใหญ่ ตัวเลข STRONG
        pw = "Punpun123";
        PasswordStrength result4 = PasswordValidator.validate(pw);
        if (result1 == PasswordStrength.INVALID) {
            System.out.println("Test Case 4 Passed "+pw+" :password is STRONG.");
        } else {
            System.out.println("Test Case 4 FAILED "+pw+": Expected INVALID but got " + result4);
        }




    }
}
