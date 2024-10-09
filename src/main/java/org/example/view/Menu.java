package org.example.view;
import org.example.model.IOperation;
import org.reflections.Reflections;
import java.util.Set;

public class Menu {

    public static void show(){
        Reflections reflections = new Reflections("org.example.model"); // Substitua pelo seu pacote

        // Busca todas as classes que implementam a interface IOperation
        Set<Class<? extends IOperation>> classes = reflections.getSubTypesOf(IOperation.class);

        // Imprime o nome das classes que implementam a interface
        for (Class<? extends IOperation> clazz : classes) {
            System.out.println("Classe que implementa IOperation: " + clazz.getSimpleName());
        }
    }
}
