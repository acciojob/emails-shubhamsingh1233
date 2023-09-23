package com.driver;

public class Email {

    private String emailId;
    private String password;

    public Email(String emailId){
        this.emailId = emailId;
        this.password = "Accio@123";
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    public void changePassword(String oldPassword, String newPassword){
        //Change password only if the oldPassword is equal to current password and the new password meets all of the following:
        // 1. It contains at least 8 characters
        // 2. It contains at least one uppercase letter
        // 3. It contains at least one lowercase letter
        // 4. It contains at least one digit
        // 5. It contains at least one special character. Any character apart from alphabets and digits is a special character
        if(newPassword.length()>=8)
        {
            int u=0, l=0, d=0, s=0;
            for(int i=0;i<newPassword.length();i++)
            {
                char ch=newPassword.charAt(i);
                if(ch>='A' && ch<='Z')
                    u++;
                else if(ch>='a' && ch<='z')
                    l++;
                else if(ch>='0' && ch<='9')
                    d++;
                else
                    s++;

                if(u>0 && l>0 && d>0 && s>0)
                {
                    if(oldPassword.equals(this.password))
                        password=newPassword;
                }
            }
        }
    }
}
