package string;
public class StringProgram {
//Length of Array
public static int findStringLength(String str){ 
int length = str.length();
return length;
}
//Convert String into Array 
public static char[] convertToCharacterArray(String str) {
char[] ch=str.toCharArray() ;
return ch;
}
//Print the Character at Penultimate SWAMI:NEED TO MAKE IT GENRIC TO HANDLE Any position#
public static char findCharacterAtPenultimate(String str,int position) {
char letter = str.charAt(str.length()-position);
return letter;
}
//Find the Number of Occurrences of a letter in string
public static int findNumberOfOccurrences(String str,char letter) {
int numberOfTimes=0;
for(int i=0;i<str.length();i++){
if(str.charAt(i)==letter) {
numberOfTimes++;
}
}
return numberOfTimes;
}
//Find Greatest position of a letter in a string

public static int findGreatestPosition(String str,char letterToFind) {
int greatestPosition = str.lastIndexOf(letterToFind);
return greatestPosition;
}
//Print Last five character


public static String findLastFiveCharacter(String str,int numberOfCharacter) {
String str2=null;
if (str.length()>=numberOfCharacter) {
str2=str.substring(str.length()-numberOfCharacter);
}else {
System.out.println("Invalid.String length is less than numberOfCharacter");
}
return str2;
}
//Print first three character 
public static String findFirstThreeCharacter(String str,int numberOfCharacter){
String str3=null;
if(str.length()>=numberOfCharacter) {
str3 = str.substring(0,numberOfCharacter);
}
else{
System.out.println("Invalid.String length is less than numberOfCharacter");
}
return str3;
}
//Replace first three character of String with XYZ  SWAMI: WHY NO LENGTH CHECKING. THIS METHOD SHUD BE GENERIC TO HANDLE any first N charcaters & any replace string
public static String replaceString (String originalStr, String replaceStr,int startIndex,int endIndex){
String str4= null;
System.out.println("Enter the Start index and End index: "); 
if((startIndex<endIndex) && (endIndex-startIndex == replaceStr.length())){
 str4 = originalStr.replace(originalStr.substring(startIndex,endIndex), replaceStr);
} else {
System.out.println("Invalid Input ");
}
return str4;
}
//Check whether the string Starts with ent SWAMI: Handle with one more arg
public static boolean checkStartWith(String str,String checkStr){
return str.startsWith(checkStr);
}
//check whether the string Ends with le SWAMI: Handle with one more arg
public static boolean checkEndWith(String str,String checkStr) {
return (str.endsWith(checkStr));
}
//LowerCase to Upper Case
public static String stringToUpperCase (String str){
String str11 = str.toUpperCase();
return str11;
}
//UpperCase to LowerCase
public static String stringToLowerCase(String str) {
String str12 =str.toLowerCase();
return str12;
}
//Reversing a String
 //SWAMI: WRONG IMPLEMENTATION
 
public static String stringReverse(String str){
int length7=findStringLength(str);
char ch[] = new char[length7];
for(int i=length7-1,j=0;i>=0&j<length7;i--,j++) {
ch[j]=str.charAt(i);
}
String newStr=String.valueOf(ch);
return newStr;
}
//Concatenation of multiple String SWAMI: Can be generic
public static String stringConcatenate(String str){
String[] str15=str.split(" ");
String newStr=str15[0];
for(int i=1;i<str15.length;i++) {
newStr=newStr.concat(str15[i]);
}
return newStr;
}
//Getting multiple string andenclose each String into a String array  SWAMI: Can be generic
public static String[] stringArray(String str) {
String[] str16 = str.split(" ");
return str16;
}
//Getting multiple String ang merge each String with "-"   SWAMI: Can be generic
public static String stringMerge(String str,String replaceStr){
String[] str17 =str.split(" ");
String strMerge=null;
strMerge = strMerge.join(replaceStr, str17);
return strMerge;
}
//Check whether the two given input Strings are equal-case sensitive
public static boolean checkEqual (String str, String checkStr){
boolean check =str.equals(checkStr);
return check;
}
//Check whether the two given input Strings are equal-case insensitive
public static boolean checkEqualCaseInsensitive(String str,String checkStr){
boolean checkInsensitive =str.equalsIgnoreCase(checkStr);
return checkInsensitive;
}
//Removing WhiteSpace " ABINAYA " - 
public static String removeSpace(String str){
String str20=str.trim();
return str20;
 }
}
