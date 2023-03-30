/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ahmetkaska
 */
public class Adder<T, U> {
    public Integer add(T a, T b) {
        if (a instanceof Integer && b instanceof Integer) {
            // If both a and b are Doubles, perform floating-point addition
            return (Integer) a + (Integer) b;
        } else {
            // If the types are incompatible, throw an exception
            throw new IllegalArgumentException("Incompatible types");
        }
    }
}
