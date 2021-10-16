package HW2;

public enum Days {
        MONDAY (" thứ Hai"),
        TUESDAY (" thứ Ba") , 
        WEDNESDAY ("thứ Tư") , 
        THURSDAY ("thứ Năm") , 
        FRIDAY (" thứ Sáu") ,  
        SATURDAY ("thứ Bảy"),
        SUNDAY ("Chủ Nhật");

    
      String value ;

      Days(String value) {
          this.value = value;

      }
    public String getValue(){
        return value;
    }
   
}
