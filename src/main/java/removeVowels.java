public class removeVowels {
    public static String removeVowels(String str){
        StringBuilder builder = new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(!isVowel(str.charAt(i))){
               builder.append(str.charAt(i));
            }
        }
        return builder.toString();
    }
    public static boolean isVowel(Character character){
        if(character=='a'||character=='e'||character=='i'||character=='o'||character=='u'){
            return true;
        }else{
            return false;
        }

    }
}
