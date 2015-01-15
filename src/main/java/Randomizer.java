import java.util.ArrayList;
import java.util.Random;

/**
 * Created by dipesh on 1/12/15.
 */
public class Randomizer {
    private Random generator = new Random(System.currentTimeMillis());
    private int dataSize = 0;
    int randomGenerator() {
        return generator.nextInt(dataSize);
    }
    public Randomizer(ArrayList<String> data,long rd){

        dataSize = data.size();
        ArrayList<String> accepted_data= new ArrayList();
        ArrayList<String> unaccepted_data= new ArrayList();

        while (true) {
            String random = data.get(randomGenerator());
            // if randomItem satisfies given condition and accepted list is not complete
            // add it to accepted list
            // else if it doesn't satisfy the condition and rejected list isn't complete
            // add it to rejected list
            // else
            // break;
            if (random.startsWith("a")) {
                if (accepted_data.size() < rd) {
                    accepted_data.add(random);
                }
            } else {
                if (unaccepted_data.size() < rd) {
                    unaccepted_data.add(random);
                }
            }
            if (accepted_data.size() == rd && unaccepted_data.size() == rd)
                break;
        }
        System.out.println("accepted data:");
        System.out.println(accepted_data.toString());
        System.out.println("unaccepted data:");
        System.out.println(unaccepted_data.toString());

//        ArrayList<String> required_data= new ArrayList();
//        ArrayList<String> unrequired_data= new ArrayList();
//
//        for (String aData : data) {
//            if (aData.startsWith("a"))
//                required_data.add(aData);
//            else
//                unrequired_data.add(aData);
//        }
//
//        System.out.println(required_data.size());
//        System.out.println(unrequired_data.size());
//
//        System.out.println("Required_data................................");
//        for (int i = 0; i < rd; i++) {
//            long currenttime= Calendar.getInstance().getTimeInMillis();
//            int td =required_data.size();
//            int x= (int) (currenttime%td);
//            System.out.println(x);
//            //required_data.remove(x);
//        }
//
//        System.out.println("Unrequired_data................................");
//        for (int i = 0; i < rd; i++) {
//            long currenttime= Calendar.getInstance().getTimeInMillis();
//            int td =unrequired_data.size();
//            int x= (int) (currenttime%td);
//            System.out.println(unrequired_data.get(x));
//            //unrequired_data.remove(x);
//        }

    }
}
