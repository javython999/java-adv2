package annotation.basic;

import java.util.Arrays;

public class ElementData1Main {

    public static void main(String[] args) {
        Class<ElementData1> annoClass = ElementData1.class;
        AnnoElement annotation = annoClass.getAnnotation(AnnoElement.class);

        System.out.println("value = " + annotation.value());
        System.out.println("value = " + annotation.count());
        System.out.println("value = " + Arrays.toString(annotation.tags()));
    }
}
