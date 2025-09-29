/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nodost;

/**
 * Author:      Johan Andrés Villada
 * Date:        2025-09-26
 * Version:     1.0
 */


/**
 * con método estático isBalanced(String) que valida
 * el balanceo de paréntesis () [] {}
 * 
 *  - Recorre la cadena con un unico for O(n) tiempo
 *  - Ignora caracteres que no son paréntesis
 *  - Devuelve true si está balanceado y false si no
 */


public class ParenthesesValidator {

    /**
     * Devuelve true si la expresion está balanceada respecot a los parentesis
     * Usa un solo For y la pila implementada.
     */
    public static boolean isBalanced(String expr) {
        MyStack<Character> stack = new MyStack<>();

        for (int i = 0; i < expr.length(); i++) {             // -- SOLO ESTE FOR
            char c = expr.charAt(i);

            // si es parentesis de apertura lo apilamos
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } 
            // si es de cierre miramos si coincide con el tope
            else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) return false; // cierre sin apertura
                char top = stack.pop();
                if (!matches(top, c)) return false; // tipo distinto
            }
            // si no es paréntesis ignoramos
        }

        // si al final la pila está vacía deberia estar balanceado
        return stack.isEmpty();
    }

    private static boolean matches(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '[' && close == ']') ||
               (open == '{' && close == '}');
    }

    // Test
    public static void main(String[] args) {
        String[] tests = {
            "(a + b) * (c - d)",
            "([{}])",
            "((a)",
            "a + b)",
            "{ [ ( ) ] }",
            "{ [ ( ] ) }",
            "((()))[]{}",
            "[(])"   // inválido
        };

        for (String t : tests) {
            System.out.printf("\"%s\" -> %b%n", t, isBalanced(t));
        }
    }
}

