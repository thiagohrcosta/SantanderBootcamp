
# Exceptions

Exceções são todos os erros que ocorrem durante o processamento de um método que podem ser esperados ou não. Como o termo já diz, "Exceptions" são exceções, falhas que não devem ocorrer rotineiramente no fluxo de um sistema.

**Exemplo de tratamento**

    public static void metodo(){
      try {
        new java.io.FileInputStream("arquivo.txt");
      } catch (java.io.FileNotFoundException e){
        System.out.println("Não foi possível abrir o arquivo para leitura");
      }
    }

![enter image description here](https://res.cloudinary.com/dloadb2bx/image/upload/v1624804690/exception_mhjxhx.png)

## Checked exceptions
São exceções esperadas, cujo fluxo ou método de um sistema foi preparado para receber. Um bom exemplo é uma exceção de negócio, onde se deseja informar um erro caso a exceção esperada ocorra.

## Unchecked Exceptions
São exceções não esperadas para o fluxo ou método de um sistema

## Bloco Try catch
O bloco try catch sempre é utilizado quando no processo que será executado dentro de um método é esperado um erro, então cria-se um bloco "protegido" onde qualquer erro que ocorra dentro do trecho "try" é direcionado para o trecho "catch" e sofrerá o devido tratamento de erro.

## Finally e throw
O **finally** é um bloco de código que pode ou não ser utilizado junto ao try catch, este trecho de código sempre será executado independente se ocorrer erro ou não dentro do fluxo onde existe o try catch. Normalmente o finally é usado para liberar recursos ou para dar continuidade em um fluxo que deve ocorrer independente de erro.

Já o **throws** é a assinatura do método que será retornado caso ocorra erro para o método que fez a chamada, dentro de um fluxo encadeado. O **throw** por sua vezé usado para lançar a exceção desejada, juntamente com a mensagem de erro, para o método que fez a chamada.
