package CYCLESECURITYSYSTEM;
public class Morstoenglish {
	
	public String tran(String N){
		String English="";
		int index = 0;
		String []cut;
		cut=N.split("/");
		for(;index<cut.length;index++){
			switch(cut[index]){
			case "":
				English=English+"";
				break;			
			case ".-":
				English=English+"a"; 
				break;
			case "-...":
				English=English+"b"; 
				break;
			case "-.-.":
				English=English+"c"; 
				break;
			case "-..":
				English=English+"d"; 
				break;
			case ".":
				English=English+"e"; 
				break;
			case "..-.":
				English=English+"f"; 
				break;
			case "--.":
				English=English+"g"; 
				break;
			case "....":
				English=English+"h"; 
				break;
			case "..":
				English=English+"i"; 
				break;
			case ".---":
				English=English+"j"; 
				break;
			case "-.-":
				English=English+"k"; 
				break;
			case ".-..":
				English=English+"l"; 
				break;
			case "--":
				English=English+"m"; 
				break;
			case "-.":
				English=English+"n"; 
				break;
			case "---":
				English=English+"o"; 
				break;
			case ".--.":
				English=English+"p"; 
				break;
			case "--.-":
				English=English+"q"; 
				break;
			case ".-.":
				English=English+"r"; 
				break;
			case "...":
				English=English+"s"; 
				break;
			case "-":
				English=English+"t"; 
				break;
			case "..-":
				English=English+"u"; 
				break;
			case "...-":
				English=English+"v"; 
				break;
			case ".--":
				English=English+"w"; 
				break;
			case "-..-":
				English=English+"x"; 
				break;
			case "-.--":
				English=English+"y"; 
				break;
			case "--..":
				English=English+"z"; 
				break;				
			case "`_":
				English=English+"A"; 
				break;
			case "_```":
				English=English+"B"; 
				break;
			case "_`_`":
				English=English+"C"; 
				break;
			case "_``":
				English=English+"D"; 
				break;
			case "`":
				English=English+"E"; 
				break;
			case "``_`":
				English=English+"F"; 
				break;
			case "__`":
				English=English+"G"; 
				break;
			case "````":
				English=English+"H"; 
				break;
			case "``":
				English=English+"I"; 
				break;
			case "`___":
				English=English+"J"; 
				break;
			case "_`_":
				English=English+"K"; 
				break;
			case "`_``":
				English=English+"L"; 
				break;
			case "__":
				English=English+"M"; 
				break;
			case "_`":
				English=English+"N"; 
				break;
			case "___":
				English=English+"O"; 
				break;
			case "`__`":
				English=English+"P"; 
				break;
			case "__`_":
				English=English+"Q"; 
				break;
			case "`_`":
				English=English+"R"; 
				break;
			case "```":
				English=English+"S"; 
				break;
			case "_":
				English=English+"T"; 
				break;
			case "``_":
				English=English+"U"; 
				break;
			case "```_":
				English=English+"V"; 
				break;
			case "`__":
				English=English+"W"; 
				break;
			case "_``_":
				English=English+"X"; 
				break;
			case "_`__":
				English=English+"Y"; 
				break;
			case "__``":
				English=English+"Z";

				break;			
			case "-----":
				English=English+"0"; 
				break;
			case ".----":
				English=English+"1"; 
				break;
			case "..---":
				English=English+"2"; 
				break;
			case "...--":
				English=English+"3"; 
				break;
			case "....-":
				English=English+"4"; 
				break;
			case ".....":
				English=English+"5"; 
				break;
			case "-....":
				English=English+"6"; 
				break;
			case "--...":
				English=English+"7"; 
				break;
			case "---..":
				English=English+"8"; 
				break;
			case "----.":
				English=English+"9"; 
				break;
			case "------.":
				English=English+"~"; 
				break;
			case "-.-.--":
				English=English+"!"; 
				break;
			case ".--.-.":
				English=English+"@"; 
				break;
			case "-...--":
				English=English+"#"; 
				break;
			case "...-..-":
				English=English+"$"; 
				break;
			case "-..-.-":
				English=English+"%"; 
				break;
			case "-.----.":
				English=English+"^"; 
				break;
			case ".-...":
				English=English+"&"; 
				break;
			case "----":
				English=English+"*"; 
				break;
			case "-.--.":
				English=English+"("; 
				break;
			case "-.--.-":
				English=English+")"; 
				break;
			case "..--.-":
				English=English+"_"; 
				break;
			case ".-.-.":
				English=English+"+"; 
				break;
			case "----.--":
				English=English+"{"; 
				break;
			case "-----.-":
				English=English+"}"; 
				break;
			case "-----..":
				English=English+"|"; 
				break;
			case "---...":
				English=English+":"; 
				break;
			case ".-..-.":
				English=English+"\""; 
				break;
			case "----..":
				English=English+"<"; 
				break;
			case "-----.":
				English=English+">"; 
				break;
			case "..--..":
				English=English+"?"; 
				break;
			case "--.....":
				English=English+"`"; 
				break;
			case "-....-":
				English=English+"-"; 
				break;
			case "-...-":
				English=English+"="; 
				break;
			case "-.--.--":
				English=English+"["; 
				break;
			case "-.---.-":
				English=English+"]"; 
				break;
			case "-.---..":
				English=English+"\\"; 
				break;
			case "-.-.-.":
				English=English+";"; 
				break;
			case ".----.":
				English=English+"\'"; 
				break;
			case "--..--":
				English=English+","; 
				break;
			case ".-.-.-":
				English=English+"."; 
				break;
			case "-..-.":
				English=English+"/"; 
				break;
			default:English=English+cut[index];
			break;
			}
		}
		return English;
	}
}