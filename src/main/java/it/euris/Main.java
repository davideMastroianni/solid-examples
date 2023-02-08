package it.euris;

import it.euris.pojo.Circle;
import it.euris.pojo.Square;
import it.euris.service.AreaCalculator;
import it.euris.service.AreaCalculatorPrinter;
import java.util.Collection;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Collection<Object> shapes = Set.of(
            new Circle(2),
            new Square(5),
            new Square(6)
        );
        AreaCalculatorPrinter printer = new AreaCalculatorPrinter();

        System.out.println(printer.printHtml(shapes));
        System.out.println(printer.printJson(shapes));
    }
}