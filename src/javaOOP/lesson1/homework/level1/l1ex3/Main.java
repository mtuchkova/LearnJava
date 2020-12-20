package javaOOP.lesson1.homework.level1.l1ex3;

public class Main {

    public static void main(String[] args) {

//        Описать класс «Vector3d» (т. е., он должен описывать вектор в трехмерной,
//        декартовой системе координат). В качестве свойств этого класса возьмите
//        координаты вектора. Для этого класса реализовать методы сложения, скалярного и
//        векторного произведения векторов. Создайте несколько объектов этого класса и
//        протестируйте их.

        Vector3d vectorOne = new Vector3d(3,4,5);
        Vector3d vectorTwo = new Vector3d(6,7,8);
        Vector3d vectorResultVectorAddition = new Vector3d();
        Vector3d vectorResultVectorProduct = new Vector3d();

        System.out.println("vectorOne: " + vectorOne);
        System.out.println("vectorTwo: " + vectorTwo);

        vectorResultVectorAddition = vectorResultVectorAddition.vectorAddition(vectorResultVectorAddition, vectorOne, vectorOne);
        System.out.println("Scalar Addition:" + vectorResultVectorAddition);


        System.out.println("ScalarProduct: " + vectorOne.scalarProduct(vectorTwo));


        vectorResultVectorProduct = vectorResultVectorProduct.vectorAddition(vectorResultVectorProduct, vectorOne, vectorOne);
        System.out.println("Vector Product: " + vectorResultVectorProduct);


    }



}


