class Solution {
public boolean checkIfPangram(String sentence) {

    for(char i='a'; i<='z'; i++){ // char 'a' se start kaarro till 'z' 
        if(!sentence.contains(String.valueOf(i))){ // if given string does not contain value of i then return
            return false;
        }
    }
    return true;  // else all letters from a to z alphabets are present in given string
}
}