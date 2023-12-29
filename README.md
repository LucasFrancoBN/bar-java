# Desafio: Bar

Proposto pelo curso DevSuperior, o desafio tem como propósito a leitura e análise dos dados de uma conta de bar. A seguir, encontram-se as regras do desafio:

1. **Preços:**
   - Sexo: R$10,00 para homens e R$8,00 para mulheres.
   - Cerveja: R$5,00
   - Refrigerante: R$3,00
   - Espetinho: R$7,00
   - Couver artístico: R$4,00 se o valor da conta for inferior a R$30,00

2. **Relatório:**
   - Exibir o relatório dos valores a serem cobrados
   
3. **Diagrama de classe UML:**
   - Seguir exatamente o diagrama de classe a seguir:

   ![Diagrama de classe](https://github.com/LucasFrancoBN/bar-java/blob/master/img/diagrama_classe.png)

   

## Exemplo
```plaintext
Sexo: F
Quantidade de cervejas: 3
Quantidade de refrigerantes: 0
Quantidade de espetinhos: 1
RELATÓRIO:
Consumo = R$ 22.00
Couvert = R$ 4.00
Ingresso = R$ 8.00
Valor a pagar = R$ 34.00
```

## Ferramentas
Desafio desenvolvido utilizando a linguagem Java e a IDE Intellij Community.


## Instruções de Uso
Antes de prosseguir com as instruções de uso, é requerido que você tenha em sua máquina o Java 20 e o git.

### Instalação
Antes de tudo, recomendo que você, pelo terminal, navegue até o diretório Desktop e rode o comando
```bash
# Clone o repositório
git clone https://github.com/LucasFrancoBN/bar-java.git

# Acesse o diretório da classe Program
cd bar-java/src/application
```
Agora basta você digitar no seu terminal
```bash
# Compile o projeto
javac Program.java ../entities/Bill.java
```
Retroceda ao diretório src e compile o programa
```
# Retrocedendo ao diretório src
cd ../

# Execute o programa
java application.Program
```
