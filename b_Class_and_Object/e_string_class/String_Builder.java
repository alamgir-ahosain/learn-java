package b_Class_and_Object.e_string_class;

public class String_Builder {

    String name = "Alamgir";
    String Dept = "CSE";
    int id = 12;

    @Override
        public String toString(){
            StringBuilder str=new StringBuilder("Info{");

            str.append(" Name:").append(name);
            str.append(", Dept:").append(Dept);
            str.append(", ID:").append(id);
            str.append(" }");
            return str.toString();
        }

    public static void main(String[] args) {
        String_Builder sb=new String_Builder();
        System.out.println(sb.toString());

    }
}
