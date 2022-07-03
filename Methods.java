package DACK_06;

public class Methods {
    public boolean notInput (String input) {
        if(input.length() <= 0){
            return  true;
        }
        else {
            return false;
        }
    }

    public boolean inputWrongPhoneNumber (String input) {
        if(input.length() != 10){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean inputPhoneNumberIsValid (String input) {
        String number = "0123456789";
        String stringInput[] = input.split("");
        boolean flag = true;
        for(int i=0; i<stringInput.length;i++){
            if(!number.contains(stringInput[i])){
                flag = false;
                break;
            }
        }
        return flag;
    }

    public boolean isEmailValid(String input) {
        //Check khoảng trống
        if(input.indexOf(" ")>0){
            return false;
        }
        //Check @
        if(input.indexOf("@") < 0) {
            return false;
        }
        //Check .com
        if(input.indexOf(".com")<0) {
            return false;
        }
        return true;
    }
    public boolean isEmailRegited(String input) {
        String email = "datdat.itsn02@gmail.com";
        //Check khoảng trống
        if(input.indexOf(" ")>0){
            return false;
        }
        //Check @
        if(input.indexOf("@") < 0) {
            return false;
        }
        //Check .com
        if(input.indexOf(".com")<0) {
            return false;
        }
        if(input != email){
            return false;
        }
        return true;
    }

}
