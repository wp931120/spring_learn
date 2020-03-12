package Enum;

public enum  Weekday {
  MONDAY("周一",1), TUSDAY("周二",2), WENSDAY("周三",3);

  private String name;
  private int index;

  private Weekday(String name,int index){
    this.name = name;
    this.index = index;
  }

  public String GetName(){
    return name;
  }
}


class Test{
  public static void main(String[] args){
    Weekday monday = Weekday.MONDAY;
    System.out.println(monday.GetName());

  }

}
