package org.example.ArrayListEx;

import java.util.ArrayList;

public class ArrayListGenericMain {
    static void main() {
        ArrayList<String> todolist = new ArrayList<>();

        todolist.add("Dishes");
        todolist.add("wash dog");
        todolist.add("take out trash");

        String action1 = (String) todolist.get(0);
//         won't work without doing ArrayList<String>
         String action2 = todolist.get(1);
    }
}
