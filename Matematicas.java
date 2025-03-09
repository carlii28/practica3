package mates;
import java.util.function.Supplier;
import java.util.stream.LongStream;

public class Matematicas {

    public static double generarNumeroPiLambda(long pasos) {
        Supplier<Boolean> dentroDelCirculo = () -> {
            double x = Math.random();
            double y = Math.random();
            return x * x + y * y <= 1;
        };

        long puntos = LongStream.range(0, pasos)
            .parallel()
            .mapToObj(i -> dentroDelCirculo.get())
            .filter(Boolean::booleanValue)
            .count();
        
        return 4.0 * puntos / pasos;
    }
}
