package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Arrays");

        //1
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        for(int i = 0; i < arr.length; i++){
            arr[i] = i + 11;
            System.out.print(arr[i]+ " ");
        }
        System.out.println();

        //2
        double[] arr2 = {1.25,2.44,13.09,44.22,10.1};
        for(int i = 0; i < arr2.length; i++){
            System.out.print(arr2[i]+ " ");
        }
        System.out.println();

        //3
        byte a1 = 1;
        int a2 = 23;
        long a3 = 12;

        //int[] massive = {a1,a2,a3};

        //4
        int[][] arr2_2 = {
                {1,2,3,4,5},
                {5,4,3,2,1}
        };
        for(int i = 0; i < 2; i++) {
            for (int x = 0; x < 5; x++) {
                System.out.print(arr2_2[i][x]+" ");
                if (x == 4){
                    System.out.println();
                }
            }
        }


        System.out.println("\nStrings");

        //1
        String str1 = "Res: ";
        for (int i = 0; i < arr.length;i++){
            str1 += arr[i] + "; ";
        }
        System.out.println(str1);

        //2
        String str2 = "Мама мила раму";
        String[] str22 = str2.split(" ");
        for (int i = 0; i< str22.length;i++ ){
            System.out.print(str22[i]+ " \n");
        }

        //3
        String str3 = "Я хочу перенесення рядків.";
        str3 =str3.replaceAll(" ","-");
        System.out.println(str3);


        System.out.println("\nStrings + Arrays");

        //1
        String  hello = "Hello world!";

        System.out.println(hello.charAt(0));

        System.out.println(hello.charAt(hello.length()-1));
        String[] temp = hello.split(" ");
        char[] world = temp[0].toCharArray();
        //System.out.println(world);
        for (int i = 0; i< world.length;i++ ){
            System.out.print(world[i]+ " ");
        }
        System.out.print("\n");

        System.out.println(hello.charAt(hello.length()-2));

    }
}