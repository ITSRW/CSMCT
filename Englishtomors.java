package CYCLESECURITYSYSTEM;
class Englishtomors {

	public String tran(String Nn){
		//预处理文本标记所有大写字符
		String mors="";
		int length=Nn.length();
		char read = 0;
		String a="/.-";
		String b="/-...";
		String c="/-.-.";
		String d="/-..";
		String e="/.";
		String f="/..-.";
		String g="/--.";
		String h="/....";
		String i="/..";
		String j="/.---";
		String k="/-.-";
		String l="/.-..";
		String m="/--";
		String n="/-.";
		String o="/---";
		String p="/.--.";
		String q="/--.-";
		String r="/.-.";
		String s="/...";
		String t="/-";
		String u="/..-";
		String v="/...-";
		String w="/.--";
		String x="/-..-";
		String y="/-.--";
		String z="/--..";
		String A="/`_";
		String B="/_```";
		String C="/_`_`";
		String D="/_``";
		String E="/`";
		String F="/``_`";
		String G="/__`";
		String H="/````";
		String I="/``";
		String J="/`___";
		String K="/_`_";
		String L="/`_``";
		String M="/__";
		String N="/_`";
		String O="/___";
		String P="/`__`";
		String Q="/__`_";
		String R="/`_`";
		String S="/```";
		String T="/_";
		String U="/``_";
		String V="/```_";
		String W="/`__";
		String X="/_``_";
		String Y="/_`__";
		String Z="/__``";


		for(int index=0;index<length;index++){
			read=Nn.charAt(index);
			switch (read){
			case 'A':
				mors=mors+A;
				break;
			case 'a':
				mors=mors+a;
				break;
			case 'B':
				mors=mors+B;
				break;
			case 'b':
				mors=mors+b;
				break;
			case 'C':
				mors=mors+C;
				break;
			case 'c':
				mors=mors+c;
				break;
			case 'D':
				mors=mors+D;
				break;
			case 'd':
				mors=mors+d;
				break;
			case 'E':
				mors=mors+E;
				break;
			case 'e':
				mors=mors+e;
				break;
			case 'F':
				mors=mors+F;
				break;
			case 'f':
				mors=mors+f;
				break;
			case 'G':
				mors=mors+G;
				break;
			case 'g':
				mors=mors+g;
				break;
			case 'H':
				mors=mors+H;
				break;
			case 'h':
				mors=mors+h;
				break;
			case 'I':
				mors=mors+I;
				break;
			case 'i':
				mors=mors+i;
				break;
			case 'J':
				mors=mors+J;
				break;
			case 'j':
				mors=mors+j;
				break;
			case 'K':
				mors=mors+K;
				break;
			case 'k':
				mors=mors+k;
				break;
			case 'L':
				mors=mors+L;
				break;				
			case 'l':
				mors=mors+l;
				break;
			case 'M':
				mors=mors+M;
				break;
			case 'm':
				mors=mors+m;
				break;
			case 'N':
				mors=mors+N;
				break;
			case 'n':
				mors=mors+n;
				break;
			case 'O':
				mors=mors+O;
				break;
			case 'o':
				mors=mors+o;
				break;
			case 'P':
				mors=mors+P;
				break;
			case 'p':
				mors=mors+p;
				break;
			case 'Q':
				mors=mors+Q;
				break;
			case 'q':
				mors=mors+q;
				break;
			case 'R':
				mors=mors+R;
				break;
			case 'r':
				mors=mors+r;
				break;
			case 'S':
				mors=mors+S;
				break;
			case 's':
				mors=mors+s;
				break;
			case 'T':
				mors=mors+T;
				break;
			case 't':
				mors=mors+t;
				break;
			case 'U':
				mors=mors+U;
				break;
			case 'u':
				mors=mors+u;
				break;
			case 'V':
				mors=mors+V;
				break;
			case 'v':
				mors=mors+v;
				break;
			case 'W':
				mors=mors+W;
				break;
			case 'w':
				mors=mors+w;
				break;
			case 'X':
				mors=mors+X;
				break;
			case 'x':
				mors=mors+x;
				break;
			case 'Y':
				mors=mors+Y;
				break;
			case 'y':
				mors=mors+y;
				break;
			case 'Z':
				mors=mors+Z;
				break;
			case 'z':
				mors=mors+z;
				break;
			case '0':
				mors=mors+"/-----";
				break;
			case '1':
				mors=mors+"/.----";
				break;
			case '2':
				mors=mors+"/..---";
				break;
			case '3':
				mors=mors+"/...--";
				break;
			case '4':
				mors=mors+"/....-";
				break;
			case '5':
				mors=mors+"/.....";
				break;
			case '6':
				mors=mors+"/-....";
				break;
			case '7':
				mors=mors+"/--...";
				break;
			case '8':
				mors=mors+"/---..";
				break;
			case '9':
				mors=mors+"/----.";
				break;
			case ' ':
				mors=mors+"/ ";
				break;
			case '\r':
			case '\n':
				mors=mors+'/'+read;
				break;
			case '~':
				mors=mors+"/------.";
				break;
			case '!':
				mors=mors+"/-.-.--";
				break;
			case '@':
				mors=mors+"/.--.-.";
				break;
			case '#':
				mors=mors+"/-...--";
				break;
			case '$':
				mors=mors+"/...-..-";
				break;
			case '%':
				mors=mors+"/-..-.-";
				break;
			case '^':
				mors=mors+"/-.----.";
				break;
			case '&':
				mors=mors+"/.-...";
				break;
			case '*':
				mors=mors+"/----";
				break;
			case '(':
				mors=mors+"/-.--.";
				break;
			case ')':
				mors=mors+"/-.--.-";
				break;
			case '_':
				mors=mors+"/..--.-";
				break;
			case '+':
				mors=mors+"/.-.-.";
				break;
			case '{':
				mors=mors+"/----.--";
				break;
			case '}':
				mors=mors+"/-----.-";
				break;
			case '|':
				mors=mors+"/-----..";
				break;
			case ':':
				mors=mors+"/---...";
				break;
			case '"':
				mors=mors+"/.-..-.";
				break;
			case '<':
				mors=mors+"/----..";
				break;
			case '>':
				mors=mors+"/-----.";
				break;
			case '?':
				mors=mors+"/..--..";
				break;
			case '`':
				mors=mors+"/--.....";
				break;
			case '-':
				mors=mors+"/-....-";
				break;
			case '=':
				mors=mors+"/-...-";
				break;
			case '[':
				mors=mors+"/-.--.--";
				break;
			case ']':
				mors=mors+"/-.---.-";
				break;
			case '\\':
				mors=mors+"/-.---..";
				break;
			case ';':
				mors=mors+"/-.-.-.";
				break;
			case '\'':
				mors=mors+"/.----.";
				break;
			case ',':
				mors=mors+"/--..--";
				break;
			case '.':
				mors=mors+"/.-.-.-";
				break;
			case '/':
				mors=mors+"/-..-.";
				break;
			default:mors=mors+"/"+read;//非上述所有情况，加"/"直接输出。}
			break;
			}
		}
		if(mors!=""){//非空结果加分隔符
			mors=mors+"/";
		}
		return mors;
	}
}