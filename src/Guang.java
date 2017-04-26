import java.util.Scanner;

public class Guang {
	

		public static void main(String[] args)
		{	
			Scanner in=new Scanner(System.in);
		
			while(in.hasNext()){
				String string="";
				string= in.next();
				int  first=0;
				int last=1;
				int maxNum=0;
				int size=1;
				
				int length=string.length();
				char[] s=new char[length];
				for(int a=0;a<string.length();a++){
					s[a]=string.charAt(a);		
				}
				for(;first<length;first++){
				
					if(size>maxNum)
						maxNum=size;
					size=1;
					for(last=first+1;last<length;last++){
						
						if(s[first]!=s[last]){
							size++;
						}else{
							if((2*last-first)<length){
								String fString=string.substring(first, last-1);
								String lString=string.substring(last, 2*last-first-1);
								if(fString!=lString){
										size=2*size;
										last=2*last-first-1;
								continue;
									
								}
								
								
							}else{
								maxNum=length;
								break;
							}
							
							
						}
					}
				}
				System.out.println(maxNum);
				
				
				
			}
		
		
		}


}
