package CYCLESECURITYSYSTEM;

public class preTranslate {
	static char MARKBASE[]=new char[127];

	public void build(){
		for(int i=33;i<127;i++){
			MARKBASE[i]=(char)i;
		}
	}

	public String pretranslate(String sentences,int key){
		String temp="";
		int counter=0;
		int point;
		for(int index=0;index<sentences.length();index++)
		{
			if(sentences.charAt(index)=='\r'||sentences.charAt(index)=='\n'||sentences.charAt(index)=='\t'){
				temp+=sentences.charAt(index);
				continue;
			}
			if(sentences.charAt(index)==' '){
				temp+=sentences.charAt(index);
				continue;
			}
			if((int)sentences.charAt(index)>126||(int)sentences.charAt(index)<0){
				temp+=sentences.charAt(index);
				continue;
			}
			if(index%2!=0){
				for(point=(int)sentences.charAt(index);counter<key;){
					if(point+1==127){
						point=33;
						counter++;
						continue;
					}
					point++;
					counter++;		
				}
				counter=0;
				temp+=MARKBASE[point];
			}
			if(index%2==0){
				for(point=(int)sentences.charAt(index);counter<key;){
					if(point-1==32){
						point=126;
						counter++;
						continue;
					}
					point--;
					counter++;		
				}
				counter=0;
				temp+=MARKBASE[point];
			}
		}
		sentences=temp;
		return sentences;
	}

	public String retranslate(String sentences,int key){
		String temp="";
		int counter=0;
		int point;
		for(int index=0;index<sentences.length();index++){
			if(sentences.charAt(index)=='\r'||sentences.charAt(index)=='\n'||sentences.charAt(index)=='\t'){
				temp+=sentences.charAt(index);
				continue;
			}
			if(sentences.charAt(index)==' '){
				temp+=sentences.charAt(index);
				continue;
			}
			if((int)sentences.charAt(index)>126||(int)sentences.charAt(index)<0){
				temp+=sentences.charAt(index);
				continue;
			}			
			if(index%2!=0){
			for(point=(int)sentences.charAt(index);counter<key;){
				if(point-1==32){
					point=126;
					counter++;
					continue;
				}
				point--;
				counter++;		
			}
			counter=0;
			temp+=MARKBASE[point];
			}
			if(index%2==0){
				for(point=(int)sentences.charAt(index);counter<key;){
					if(point+1==127){
						point=33;
						counter++;
						continue;
					}
					point++;
					counter++;		
				}
				counter=0;
				temp+=MARKBASE[point];
			}	
		}
		sentences=temp;
		return sentences;
	}
}