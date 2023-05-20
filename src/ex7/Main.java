package ex7;

public class Main {
    public static void main(String[] args) {
        /*
        sa se construiasca clasa cu numele Car cu proprietatile brand, model,cai putere, combustibil
        sa se introduca 3 obiecte de tipul Car , unul pe benzina si 2 pe motorina
        sa se afiseze doar masinile pe benzina dupa parcurgerea unui for

        */

        Car car1 = new Car("audi", "berlina", 150, "benzina");
        Car car2 = new Car("bmw", "coupe", 170, "motorina");
        Car car3 = new Car("opel", "berlina", 120, "motorina");

        Car carList[] = new Car[3];
        carList[0] = car1;
        carList[1] = car2;
        carList[2] = car3;
        for(int i=0; i<carList.length; i++){
            if(carList[i].getCombustibil().equals("benzina")){
                System.out.println(carList[i]);
            }
    }

    }

}
