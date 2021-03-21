package CYCLESECURITYSYSTEM;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JTextArea;

class Export {
	
	public static void output(String path ,JTextArea output) throws IOException{
		FileWriter outputstream = new FileWriter(path);
		outputstream.write(output.getText());
		outputstream.flush();
		outputstream.close();
	}

}

class Inport {
	public static  void insert(String path,JTextArea input) throws IOException  {  
		BufferedReader inputstream= new BufferedReader(new FileReader(path));
		String sentences="";
		String reader=inputstream.readLine();
		for(;reader!=null;){
			sentences=sentences+reader+'\n';
			reader=inputstream.readLine();
		}
		sentences=sentences.substring(0,sentences.length()-1);
		input.setText(sentences);
		inputstream.close();
	}
}
