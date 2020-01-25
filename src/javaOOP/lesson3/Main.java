package javaOOP.lesson3;

import javaOOP.lesson3.exceptions.NegativeVulueException;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        double a;
        for(;;){

            try{
                a=Double.valueOf(JOptionPane.showInputDialog("Input double number"));
                if (a < 0) {
                    throw new NegativeVulueException(a);
                }
                break;

            }
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null,"Error number format");
            }
            catch(NullPointerException e){
                a=0;
                JOptionPane.showMessageDialog(null,"Cancel");
                break;
            }
            catch (NegativeVulueException e) {
                JOptionPane.showMessageDialog(null,"NegativeVulue " + e.getNumber());
            }

        }
        System.out.println(a);


    }
}
