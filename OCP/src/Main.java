
public class Main {
    public static void main(String[] args) {
      Operation opeartion=new Addition();
      System.out.println(opeartion.execute(String.valueOf(20),String.valueOf(25)));
      System.out.println(opeartion.execute(String.valueOf(20.5),String.valueOf(20)));
      System.out.println(opeartion.execute(String.valueOf(20.45),String.valueOf(10.6)));

        }

}