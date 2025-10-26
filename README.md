## 🧠 Estruturas Condicionais em Java

Exercícios e exemplos práticos desenvolvidos para estudar e aplicar estruturas condicionais (if, else if, else) em Java.
O objetivo deste repositório é consolidar o aprendizado sobre tomadas de decisão dentro dos programas, utilizando situações do mundo real.

## Conceito

As estruturas condicionais permitem que um programa tome decisões com base em condições verdadeiras ou falsas.
Elas são fundamentais para o controle de fluxo em qualquer linguagem de programação.

Em Java, as principais estruturas são:
```
if (condicao) {
    // executa se a condição for verdadeira
} else if (outraCondicao) {
    // executa se a primeira for falsa e essa for verdadeira
} else {
    // executa se todas as condições anteriores forem falsas
}
```
## 🧩 Exemplo: Cálculo de Média com Condição
```
import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class Exemp01 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // VARIÁVEIS
        String aluno, matricula;
        double nota1, nota2, nota3;
        int peso1 = 5, peso2 = 3, peso3 = 3;
        double resultadoFinal;

        // ENTRADA DE DADOS
        aluno = JOptionPane.showInputDialog("Digite o nome do aluno: ");
        matricula = JOptionPane.showInputDialog("Digite o número da matrícula: ");
        System.out.print("Digite a PRIMEIRA NOTA do aluno: ");
        nota1 = sc.nextDouble();
        System.out.print("Digite a SEGUNDA NOTA do aluno: ");
        nota2 = sc.nextDouble();
        System.out.print("Digite a TERCEIRA NOTA do aluno: ");
        nota3 = sc.nextDouble();

        // CÁLCULO
        resultadoFinal = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);

        // CONDIÇÕES
        if (resultadoFinal >= 7){
            System.out.println("O aluno foi aprovado!");
        } else if (resultadoFinal >= 4){
            System.out.println("O aluno está em recuperação!");
        } else {
            System.out.println("O aluno foi reprovado!");
        }

        sc.close();
    }
}
```
## ⚙️ Objetivos do Repositório

- ✅ Aplicar a lógica de programação com estruturas condicionais
- ✅ Praticar a utilização de entradas e saídas de dados (Scanner e JOptionPane)
- ✅ Desenvolver programas que tomam decisões com base em critérios definidos
- ✅ Criar uma base sólida para futuros estudos com switch case, loops e estruturas aninhadas

## Aprendizado e Evolução

Cada pasta contém exercícios comentados, permitindo fácil compreensão e acompanhamento do aprendizado.

## 💻 Tecnologias Utilizadas

- Java 17+
- JDK / JRE
- IDE: IntelliJ IDEA, Eclipse ou VS Code
- Bibliotecas: java.util.Scanner, javax.swing.JOptionPane, java.util.Locale;

---

📌 **Autor:** Juan Pablo de Santana Ramos  
📌 **LinkedIn:** https://www.linkedin.com/in/juanpablose/

🚀 **Vamos codar e evoluir juntos!**
