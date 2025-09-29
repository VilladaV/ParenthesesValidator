/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nodost;

/**
 *
 * 
 *
 * Author:      Johan Andrés Villada
 * Date:        2025-09-27
 * Version:     1.0
 * 
 */


/**
 * Excepcion de runtime que se lanza al intentar extraer o consultar
 * el tope de una pila que esta vacía
 */
public class EmptyStackException extends RuntimeException {
    public EmptyStackException() { super(); }
    public EmptyStackException(String message) { super(message); }
}

