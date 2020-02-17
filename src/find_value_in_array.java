//

import java.lang.*;
import java.util.*;

public class find_value_in_array {

    public void check_name(String input, String[] array) {
        boolean exists = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(input)) {
                System.out.println(input + " co trong danh sach sinh vien");
                return;
            }
        }
        System.out.println(input + " khong co trong danh sach sinh vien");

    }

    public static void main(String[] args) {
        String input_name;
        Scanner input = new Scanner(System.in);
        String[] student_list = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        System.out.println("nhap ten sinh vien");
        input_name = input.nextLine();
        find_value_in_array object_find = new find_value_in_array();
        object_find.check_name(input_name, student_list);
    }

}
