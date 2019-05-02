package emailApp;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private int passwordLength = 10;
    private String email;
    private String defaultCompanyName = "anycompany";

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = generatePassword();
        this.email = generateEmail();
        getAllInfo();
    }

    private void getAllInfo() {
        System.out.println("Full name: " + firstName+" " + lastName+
                "\nEmail: " + this.email+
                "\nPassword: " + this.password);
    }

    private String generateEmail() {
        return ""+ firstName.toLowerCase() + "." + lastName.toLowerCase() + "@"+defaultCompanyName+".com";
    }

    private String generatePassword() {
        String passSymbols = "ABCDEFGHIJKLMOPQRSTUWXYZ0123456789";
        String generatedPass= "";
        char [] passArray = passSymbols.toCharArray();

        for(int i=0; i<passwordLength; i++){
            generatedPass += "" + passArray[(int)(Math.random()*34)];
        }
        return generatedPass;
    }
}
