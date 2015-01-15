import java.util.ArrayList;

/**
 * Created by dipesh on 1/12/15.
 */
public class Main {
    public static void main(String[] argas){
//        String[] array={"dipesh", "bipin", "anil", "binod", "Shashwat", "shashi", "yashashvi", "ramesh", "suresh", "ashok", "anita", "aman", "ankita", "aashish"};
//        List<String> arraylist= Arrays.asList(array);

        ArrayList<String> dipesh= new ArrayList();
        dipesh.add("aayushma");
        dipesh.add("aklesh");
        dipesh.add("binod");
        dipesh.add("dinesh");
        dipesh.add("yashashvi");
        dipesh.add("shashwat");
        dipesh.add("dipesh");
        dipesh.add("dear");
        dipesh.add("anil");
        dipesh.add("ankita");
        dipesh.add("anish");
        dipesh.add("amisha");
        dipesh.add("aasha");
        dipesh.add("aastha");


           Randomizer rd = new Randomizer(dipesh, 10);
    }
}
