import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class FileUtility{
    List<Client> readFileData(BufferedReader br) throws IOException{
		List<Client> clientList = new ArrayList<>();
		Client client;
		//Fill your code here
		try {
   		 String line;
   		 while ((line = br.readLine()) != null) {
	    		 String[] tokens = line.split(",");
	    		 client = new Client(Integer.parseInt(tokens[0]),tokens[1],tokens[2],tokens[3],tokens[4]);
	    		 clientList.add(client);
   		 }
   		 	br.close();
   		 } catch (IOException ex) {
   			 ex.printStackTrace();
   		 }
		return clientList;
	}
	
	void writeDataToFile(List<Client> clientList) throws IOException{
        //Fill your code here
		FileWriter fw = new FileWriter("output.csv");
		BufferedWriter bw = new BufferedWriter(fw);
		try {
			for(Client client: clientList) {
	    		bw.write(client.toString());
	    	}
	    	bw.flush();
	    	bw.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	
}
	