package stringgs;
//wa method which will remove any given char from string
public class App{

    //converting string to charArray
    static void remove(String str){
        char removed_char = 'o';
        char ch[] = str.toCharArray();
        for(char s : ch){
            if(s == removed_char){
                continue;
            }
            System.out.println(s);
        }
        
        
    }

    //by using charAt() method
    static void removeChar(String str){
        char to_be_removed = 'o';
        String new_String = "";
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == to_be_removed){
                continue; 
            }
            new_String += str.charAt(i);
        }
        System.out.println("2nd method:  "+new_String);

    }

    
    public static void main(String[] args){
        String str = "wo hello";
        remove(str);
        removeChar(str);
        
    }
}
