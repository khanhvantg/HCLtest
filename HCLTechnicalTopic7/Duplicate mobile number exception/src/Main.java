import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws Exception{
		// fill the code
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the contact details");
        String st=br.readLine();
        String[] str=st.split(",");
        
        ContactDetail userInfo=new ContactDetail(str[0],str[1],str[2],str[3],str[4]);
        ContactDetailBO BO=new ContactDetailBO();
        try{
	        BO.validate(str[0], str[1]);
	        System.out.println(userInfo.toString());
        } 
        catch(DuplicateMobileNumberException e) {
        	System.out.println(e.toString());
        }
	}
}
