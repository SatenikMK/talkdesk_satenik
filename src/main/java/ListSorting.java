import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ListSorting {

    public List<String> sort (List<String> list) {
        list.sort(new SortListWithLowerCase());
        return list;
    }

    public class SortListWithLowerCase implements Comparator<String> {
        @Override
        public int compare(String s1, String s2) {
            return s1.toLowerCase().compareTo(s2.toLowerCase());
        }
    }

    public static void main(String[] args) {
        List<String> a = Arrays.asList("January", "February", "Mar", "Apr", "May", "June", "Jul","august", "Sep", "Oct", "nov", "December" );
        ListSorting ls = new ListSorting();
        ls.sort(a);
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }
    }
}
