public class EventBO {
	//Your code here
	static int currentPeopleCount;
	
	public static void processEvent(String enterType) {
		String[] splits = enterType.split("\\s");

		for (String item : splits) {
			synchronized(EventBO.class){
				if (item.equals("Entry")) {
					currentPeopleCount++;
				}
				if (item.equals("Exit")) {
					currentPeopleCount--;
				}
			}
		}
	}
}
