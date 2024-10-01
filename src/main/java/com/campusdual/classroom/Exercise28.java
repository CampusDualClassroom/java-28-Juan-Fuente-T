package com.campusdual.classroom;

public class Exercise28 {
    public static void main(String[] args) {
        throwsException();
        throwsArithmeticException();
    }

    public static void throwsException() throws ArrayIndexOutOfBoundsException {
        int[] myArray = new int[]{1, 2, 3};
        int num = myArray[5];
    }
    public static void throwsArithmeticException(){
        try{
            int errorDivision = 50 / 0;
        }catch (ArithmeticException e){
            System.out.println("ArithmeticException: \n" + e);
        }
    }

}
