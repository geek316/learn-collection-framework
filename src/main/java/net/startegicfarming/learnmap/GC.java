package net.startegicfarming.learnmap;

import java.lang.ref.WeakReference;

public class GC {
    static void main() {
        Phone phone1 = new Phone("Apple", "17 ProMax");
        System.out.println(phone1);
        phone1 = null;
//        System.gc();
        System.out.println(phone1);

        WeakReference<Phone> phoneWeakreference = new WeakReference<>(new Phone("Nokia", "1100"));
        System.out.println(phoneWeakreference.get());
        System.gc();
        try {
            Thread.sleep(10000);
        } catch (Exception e) {
            System.out.println("Exception : " + e);
        }
        System.out.println(phoneWeakreference.get());
    }
}

class Phone {

    String brand;
    String model;

    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
