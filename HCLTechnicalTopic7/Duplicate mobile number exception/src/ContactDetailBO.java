
public class ContactDetailBO {
	public static void validate(String mobileNumber,String alternateMobileNumber) throws DuplicateMobileNumberException
    {
       // fill the code
		if (mobileNumber.equals(alternateMobileNumber)) {
			throw new DuplicateMobileNumberException("DuplicateMobileNumberException");
		}
    }
}
