package functional_interface.examples;

public class Optional {
    //O objetivo da classe Optional no Java é fornecer uma abordagem mais segura e expressiva para tratar casos em que um valor pode ser ausente (nulo).

    //of(value): Cria um Optional contendo o valor fornecido. Se o valor for nulo, lançará uma exceção NullPointerException.

     //ofNullable(value): Cria um Optional contendo o valor fornecido, mas permite que o valor seja nulo.

    //empty(): Retorna um Optional vazio (sem valor).

    //isPresent(): Verifica se o Optional contém um valor não nulo.

   //isEmpty() (A partir do Java 11): Verifica se o Optional está vazio (não contém um valor não nulo).

   //get(): Obtém o valor contido no Optional. Se o valor for nulo, lançará uma exceção NoSuchElementException.

   //orElse(defaultValue): Obtém o valor contido no Optional, ou retorna um valor padrão se o Optional estiver vazio

   //orElseGet(supplier): Obtém o valor contido no Optional, ou retorna um valor fornecido por um Supplier se o Optional estiver vazio.

   //orElseThrow(exceptionSupplier): Obtém o valor contido no Optional, ou lança uma exceção fornecida por um Supplier se o Optional estiver vazio.

  //ifPresent(consumer): Executa uma ação fornecida por um Consumer se o Optional contiver um valor.


}
