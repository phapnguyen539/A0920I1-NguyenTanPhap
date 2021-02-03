package th_validate;

public class EmailTest {
    private static EmailExample emailExample;
    public static final String[] validEmail= new String[]{"a@gmail.com", "ab@yahoo.com", "abc@hotmail.com"};
    public static final String[] invalidEmail= new String[] {"@gmail.com", "ab@gmail.", "@#abc@gmail.com" };

    public static void main(String[] args) {
        emailExample = new EmailExample();
        for (String email: validEmail){
            boolean isvalid= emailExample.Validate(email);
            System.out.println("Email:"+ email+"is valid:"+ isvalid );
        }
        for (String email: invalidEmail){
            boolean isvalid= emailExample.Validate(email);
            System.out.println("Email:"+ email+"is valid"+ isvalid);
        }
    }

}
