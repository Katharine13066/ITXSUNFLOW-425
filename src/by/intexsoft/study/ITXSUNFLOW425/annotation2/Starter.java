package by.intexsoft.study.ITXSUNFLOW425.annotation2;

import by.intexsoft.study.ITXSUNFLOW425.annotation2.model.CarType;

import java.lang.reflect.Method;

public class Starter {

    @CarType(model = "ferrari")
    public void drive(){}

    public static void main(String[] args) {
        try {
            Method workMethod = Starter.class.getMethod("drive",null);
            if(workMethod.isAnnotationPresent(CarType.class)){
                CarType car = workMethod.getAnnotation(CarType.class);
                System.out.println(car);
                System.out.println("Model: "+car.model());
                System.out.println("ColorType: "+car.colors());
            }

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
