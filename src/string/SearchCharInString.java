package string;

public class SearchCharInString {
    public static void main(String[] args) {

        String str = "Praveen";
        char target = 'a';
        boolean res = searchCharForEach(str, target);
        System.out.println(res);

    }

    private static boolean searchChar(String str, char target) {
        if (str == null) {
            return false;
        }
        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i)==target){
                return true;
            }
        }
        //if char not found return false
        return false;
    }

    private static boolean searchCharForEach(String str, char target) {
        if (str == null) {
            return false;
        }
        for(char ch:str.toCharArray()){
            if (ch==target)
                return true;
        }
        //if char not found return false
        return false;
    }
}
