/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.testproject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Liza
 */
public class Main {
    static Scanner scanner = new Scanner(System.in, "Cp866");
    static public void main(String[] args) throws ClassNotFoundException, Exception{    
        while(true){
            System.out.println(Constants.TASK);
            try{
                smth(scanner.nextInt());
            }catch(Exception e){
                System.out.println(Constants.INVALID);
                scanner.nextLine();
            }
        }
    };
    static public void smth(int args) throws IOException, ClassNotFoundException, Exception{
         try{
            switch (args) {
                case 1:
                    System.out.println(Constants.TASK_1);
                    if (scanner.nextInt()>7){
                        System.out.println(Constants.TASK_1_ANSWER_1);
                    } else System.out.println(Constants.TASK_1_ANSWER_2);                  
                    break;
                case 2:
                    System.out.println(Constants.TASK_2);
                    String name = Constants.TASK_2_NAME;
                    String check = scanner.next().trim();
                    if (check.equals(name)){                      
                        System.out.println(Constants.TASK_2_ANSWER_1);                            
                    }
                     else System.out.println(Constants.TASK_2_ANSWER_2);
                    break;
                case 3:              
                    System.out.println(Constants.TASK_3);
                    ArrayList<Integer> array = new ArrayList<>(5);
                    ArrayList<Integer> multiple = new ArrayList<>();
                    for (int i = 0; i < 5; i++) {
                        System.out.println(Constants.TASK_3_DO + (i+1));
                        array.add(scanner.nextInt());
                        if (array.get(i) % 3 == 0){
                            multiple.add(array.get(i));
                        } 
                    }          
                    System.out.println(Constants.TASK_3_DATA + array);
                    if (multiple.isEmpty()){
                        System.out.println(Constants.TASK_3_ANSWER_1);
                    } else System.out.println(Constants.TASK_3_ANSWER_2 + multiple);
                    break;
                case 4:
                    System.out.println(Constants.TASK_4_ANSWER);
                    break;
                default:
                    System.out.println(Constants.INVALID);
                    break;
            }          
        } catch(NullPointerException | NumberFormatException e){
            System.out.println(e);
        }
    }
}
