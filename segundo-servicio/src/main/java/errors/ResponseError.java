package errors;
//En caso de error controlado por mi, enviaré este objeto.
public record ResponseError(
        String error
) {
}
