import java.util.*;
public class linkedlist1 {
    public static void main(String[] args) {
        System.out.println("hello world");

        //create an object of the class linked list
        LinkedList<String> name = new LinkedList<String>();

        //add elements to the linked list
        name.add("Patrick");
        name.add("john");
        name.add("jack");
        name.add(3,"NEW");
        name.add("shawn");

        System.out.println(name);
        //for loop
        for(int i = 0 ; i <name.size(); i++){
            System.out.print(name.get(i)+" ");
        }
        System.out.print("-------------------------");
        //for each
        for (String str: name){
            System.out.print(str);
        }


        /*
        So key functions:
        add a element: linkedlistname   .add
        remove a element:   linkedlistname .remove
        */
         


    }

}