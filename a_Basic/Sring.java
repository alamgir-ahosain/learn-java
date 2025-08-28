public class Sring {
    public static void main(String[] args) {

        String name = "Alamgir";
        int age = 22;

        System.out.printf("Name: %s ,Age:%d\n", name, age);
        System.out.printf("Name: %15s ,Age:%d\n", name, age); // right-aligned,width:15
        System.out.printf("Name: %-15s ,Age:%d\n", name, age); // left-aligned,width:15
        System.out.printf("Name: %15S ,Age:%d\n", name, age); // uppercase ,left-aligned,width:15


        //________________________String Builder___________
        /*
         mutable ,store in heap
         */
        StringBuilder str=new StringBuilder("Alamgir");
        str.append("Hosain");
        System.out.println(str.toString());
        



    }
}
