package peaksoft;

import lombok.*;

import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ZooShop {
    private List<Bird> birds;
    private String name;
    private int age;

    public void getBirdInfo(){
        System.out.println("name :" + getName());
        System.out.println("age :" + getAge());
        for (Bird bird : birds) {
            bird.getInfo();

        }
    }

    @Override
    public String toString() {
        return "\nPetShop :" +
                "\nbirds : " + birds +
                "\n name : " + name +
                "\n age : " + age +
                " ";

    }
}
