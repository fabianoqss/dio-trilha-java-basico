public class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException() {
        super("Parâmetros inválidos: parametroUm deve ser menor ou igual a parametroDois.");
    }
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }
}
