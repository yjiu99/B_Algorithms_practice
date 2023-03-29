import java.util.Arrays;

public class B1152 {
    public static void main(String[] args) {
//        String s = "";
//        StringBuilder sb = new StringBuilder();
//백준 문제 아님
//        1000 / 2000 / 3000 / 4000 부터 100000만원까지
//        int a = 1000;
//        int result = 0;
//        for (int i = 1; i<=50;i++){
//            result = result + (a * i) ;
//        }
//        System.out.println(result);
//


        class MyArr{

            private String[] array;
            private int size;
            public MyArr(int n){
                array =  new String[n];
                size = 0;
            }

            public boolean contains(String word) {
                boolean flag = false;
                for( int i =0; i< array.length; i++){
                    flag = array[i].equals(word);
                    if(flag){
                        break;
                    }
                }
                return flag;
            }

        }
        MyArr arr = new MyArr(2);
        String a = "ab";
        arr.array[0] = "b";
        arr.array[1] = "b";
        System.out.println(arr.contains(a));

//        boolean flag = arr.array[1].equals(a);
//        System.out.println(flag);


//        String[] arr = new String[]{"1", "2", "3"};
//        String stringToSearch = "32";
//        boolean status = false;
//        for (int i = 0; i < arr.length; i++) {
//            status = arr[i].equals(stringToSearch);
//            if (status) break;
//        }
//        System.out.println(status);

        //arr.contains(a);
        //System.out.println(arr.contains(a));


    }


}
