/*
Name: Kaan Montplaisir
UIN: 627003014
Date:
Assignment:
*/

class Mob {
  public static void main(String[] args) {
    PrintWriter out = new PrintWriter("filename.txt");
    String pound = "#";
    String zero = "0000000000000000000";
    String output = "";
    System.out.println(output);
    for(int i = 19; i > 1; --i){
      pound += "#";
      zero = zero.substring(0, zero.length() - 1);
      output = pound.concat(zero);
      out.println(output);

    }
  }
}
