public class RemoveDuplicateFromString {
    public static void removeduplicate(String str, StringBuilder newStr,int idx,boolean map[]){
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }
        char current = str.charAt(idx);
        if(map[current-'a']==false){
            map[current-'a']=true;
            removeduplicate(str, newStr.append(current), idx+1, map);
        }else{
            removeduplicate(str, newStr, idx+1, map);
        }
    }
    public static void main(String[] args){
        removeduplicate("sakshi", new StringBuilder(""), 0, new boolean[26]);
    }
}
