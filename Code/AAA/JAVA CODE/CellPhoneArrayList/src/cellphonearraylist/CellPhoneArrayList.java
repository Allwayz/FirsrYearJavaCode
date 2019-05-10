package cellphonearraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class CellPhoneArrayList {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<CellPhone>list = new ArrayList<>();
        list.add(new CellPhone("123456789","AAA"));
        list.add(new CellPhone("999999999","BBB"));
        list.add(new CellPhone("888888888","CCC"));
        list.add(new CellPhone("777777777","DDD"));
    }
    
}
