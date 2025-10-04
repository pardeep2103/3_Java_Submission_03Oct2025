package demo;


public class car_main_2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Carv2 audi = new Carv2();

        audi.brand_name = "audi";
        audi.musicsystem_brand = "boat";
        audi.accelerate();
        audi.lock_using_remote();

        System.out.println("audi.brand name : " + audi.brand_name +
                           "\n audi.musicsystem brand : " + audi.musicsystem_brand);
    }
}

