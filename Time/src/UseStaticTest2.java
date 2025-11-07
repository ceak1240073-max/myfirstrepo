public class UseStaticTest2{
public static void main(String[] args){ //↓ｽﾀﾃｨｯｸﾒｿｯﾄﾞで時刻を文字列化
System.out.println("起床: " + Time.toString(6,45,0));
Time t1 = new Time(); //Timeクラスのオブジェクトを生成
Time t2 = new Time(); //Timeクラスのオブジェクトを生成
t1.setTime(7, 31, 30); //t1に7時31分30秒をセット
t2.setTime(8, 17, 00); //t2に8時17分00秒をセット
System.out.println("出発: " + t1.toString()); //t1をｲﾝｽﾀﾝｽﾒｿｯﾄﾞで文字列化*4
System.out.println("到着: " + t2.toString()); //t2をｲﾝｽﾀﾝｽﾒｿｯﾄﾞで文字列化
}
}
