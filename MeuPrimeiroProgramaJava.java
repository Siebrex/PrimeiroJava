//nome da classe- java funciona em classe e será case sensitive

class MeuProgramaJava
{
    //módulo principal com a entrada pela linha de comando- será o método principal e será por esse metodo que tudo irá acontecer/ser executado.
   //procedimento será publico e estático 
   //dentro dos parenteses terá os argumentos que sao recebidos como parametros. Nesse exemplo  terá um vetor chamdo entrada do tipo String(conjunto de caracteres), char(apenas um caracter)  

   public static void main (String entrada[ ])   //void significa procedimento, public static      
   {
       //declaraçao de variaveis(tipo primitivo, começa com letra minusculo)
       int inteiro = 24;
       char caracter = 'F';
       double real = 1.55;
       String frase = "Jade Siebra";
       boolean VF = true;
  
       if (VF == true)
       { 
          System.out.println( " Eu sou a" + frase + "tenho" + inteiro + "anos e tenho" + real + "m de altura");  //irá imprimir na tela do usuário
        }

        System.exit(0);  //fechar a execuçao do programa
     } 
} 
