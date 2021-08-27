package string;
import java.util.Scanner;
public class StringRunner {
//Getting String Input
public static String getStringInput() {
Scanner sc = new Scanner(System.in);
String str = sc.nextLine();
return str;
}
//Getting IntegerInput
public static int getIntegerInput() {
Scanner in = new Scanner(System.in);
int number = in.nextInt();
return number;
}
public static void main(String[] args) {
System.out.println("Enter the Question No: ");
int questionNo= getIntegerInput();
switch(questionNo) {
case 1:
System.out.println("Enter the String");
String str1 = getStringInput();
System.out.println(StringProgram.findStringLength(str1));
break;
case 2:
System.out.println("Enter the String");
String str2 = getStringInput();
System.out.println(StringProgram.convertToCharacterArray(str2));
break;
case 3:
System.out.println("Enter the String");
String str3 = getStringInput();
System.out.println("Length of the String: "+StringProgram.findStringLength(str3));
System.out.println("Enter the index of the character : ");
int position = getIntegerInput();
System.out.println(StringProgram.findCharacterAtPenultimate(str3,position));
break;
case 4:
System.out.println("Enter the String");
String str4 = getStringInput();
System.out.println("Enter the letter: ");
char letter =getStringInput().charAt(0);
System.out.println(StringProgram.findNumberOfOccurrences(str4,letter));
break;
case 5:
System.out.println("Enter the String");
String str5 = getStringInput();
System.out.println("Enter the letter: ");
char letter1 =getStringInput().charAt(0);
System.out.println(StringProgram.findGreatestPosition(str5,letter1));
break;
case 6:
System.out.println("Enter the String");
String str6 = getStringInput();
System.out.println("Enter the Number of Characters: ");
int numChar=getIntegerInput();
System.out.println(StringProgram.findLastFiveCharacter(str6,numChar));
break;
case 7:
System.out.println("Enter the String");
String str7 = getStringInput();
System.out.println("Enter the Number of Characters: ");
int numChar1=getIntegerInput();
System.out.println(StringProgram.findFirstThreeCharacter(str7,numChar1));
break;
case 8:
System.out.println("Enter the String");
String str8 = getStringInput();
System.out.println("Enter the String to be replaced: ");
String replaceStr= getStringInput();
System.out.println("Enter the start index and end index: ");
int startIndex=getIntegerInput();
int endIndex=getIntegerInput();
System.out.println(StringProgram.replaceString(str8,replaceStr,startIndex,endIndex));
break;
case 9:
System.out.println("Enter the String");
String str9 = getStringInput();
System.out.println("Enter the String to be checked: ");
String checkStr=getStringInput();
System.out.println(StringProgram.checkStartWith(str9,checkStr));
break;
case 10:
System.out.println("Enter the String");
String str10 = getStringInput();
System.out.println("Enter the String to be checked: ");
String checkStr2=getStringInput();
System.out.println(StringProgram.checkEndWith(str10,checkStr2));
break;
case 11:
System.out.println("Enter the String");
String str11 = getStringInput();
System.out.println(StringProgram.stringToUpperCase(str11));
break;
case 12:
System.out.println("Enter the String");
String str12 = getStringInput();
System.out.println(StringProgram.stringToLowerCase(str12));
break;
case 13:
System.out.println("Enter the String");
String str13 = getStringInput();
StringProgram.stringReverse(str13);
break;
case 14:
System.out.println("Enter the String");
String str14 = getStringInput();
System.out.println(str14);
break;
case 15:
System.out.println("Enter the String");
String str15 = getStringInput();
System.out.println(StringProgram.stringConcatenate(str15));
break;
case 16:
System.out.println("Enter the String");
String str16 = getStringInput();
String [] arr16 = StringProgram.stringArray(str16);
System.out.println("String array is:");
for(String arr:arr16) {
 System.out.println(arr);
 }
break;
case 17:
System.out.println("Enter the String");
String str17 = getStringInput();
System.out.println("Enter the replace string: ");
String mergeStr=getStringInput();
System.out.println(StringProgram.stringMerge(str17,mergeStr));
break;
case 18:
System.out.println("Enter the String");
String str18 = getStringInput();
System.out.println("Enter Second String: ");
String secStr= getStringInput();
System.out.println(StringProgram.checkEqual(str18,secStr));
break;
case 19:
System.out.println("Enter the String");
String str19 = getStringInput();
System.out.println("Enter Second String: ");
String secStr2= getStringInput();
System.out.println(StringProgram.checkEqualCaseInsensitive(str19,secStr2));
break;
case 20:
System.out.println("Enter the String");
String str20 = getStringInput();
System.out.println(StringProgram.removeSpace(str20));
break;
default:
System.out.println("Invalid");
}
}

}
