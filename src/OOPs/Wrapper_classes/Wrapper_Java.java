package OOPs.Wrapper_classes;

public class Wrapper_Java {
    public static void main(String[] args) {
        Mobile iphone = new Mobile(1 , "iphone 16" , 80000);
        Mobile Motorola = new Mobile(2, "motorola Edge 50" , 30000);

        iphone.setPrice(100000);
        System.out.println(iphone.getPrice());

        iphone.display();
        Motorola.display();

    }
}

class Mobile{
    private Integer phone;
    private Integer name;
    private Integer price;

    Mobile(int phone, String s, int price){
        System.out.println("DC");
    }

    public Mobile(Integer phone, String name, Double price) {
        this.phone = phone;
//        this.name = name;
//        this.price = price;
    }

    void display(){
        System.out.println(this.name + this.phone + this.price);
    }


    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public Integer getName() {
        return name;
    }

    public void setName(Integer name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
