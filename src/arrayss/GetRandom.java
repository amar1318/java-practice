package arrayss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GetRandom {
    public static void main(String[] args) {
        List<Integer> questions = new ArrayList<>();
        for(int i=1; i<6; i++){
            questions.add(i);
        }

        System.out.println(questions);

        Collections.shuffle(questions);

        System.out.println(questions);
    }
}







/* 
tables---
1. questions    --Question --opt1  --opt2  --opt3  --opt4  --ans
2. user         --id      --password
3. score        --id      --score

classes --
1. user---private String username, private String password
2. Question -- private String question, private string opt1, private string opt2, private string opt3, private string opt4, private String ans
3. conn
4. adding user to the database  method--addUser, getUser
5. adding and geting question from databse 
6. main class -- 
    a. give test
    b. check score
    c. 

Amit---create tables, conn class, questions-10-->questions
aniket---utility class(user, questions), create class --userDb methods --save user, getuser
Anirudha---create class QuestionDb -- 


enter username--
enter password--
ready to take a test(y/n)--y
what is java?
1. fdg
2. programming language
3. 
4.

enter input:2; score++-->database..
*/




















        // int arr[] = new int[6];
        // int pos = 0;
        // while(true){
        //     int random = (int) (Math.random()*(5));
        //     boolean flag = true;
        //     for(int i=0; i<arr.length && i<pos; i++){
        //         if(arr[i] == random){
        //             flag = false;
        //         }
        //     }
        //     if(flag){
        //         arr[pos] = random;
        //         pos++;
        //     }

        //     if(pos == 5) break;
        // }

        // List<Integer> llist = new ArrayList<>();
        // for(int i=0; i<arr.length; i++){
        //     llist.add(questions.get(arr[i]-1));
        // }
        // System.out.println(llist);
