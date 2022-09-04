public class Palavra implements Comparable<Palavra>
{
    private String texto;

    public Palavra (String texto) throws Exception
    {
        if (texto != null && texto != "") {
            this.texto = texto;
        }
        else {
            throw new Exception("[ERRO] Texto não declarado");
        }
		// verifica se o texto recebido � nulo ou ent�o vazio,
		// ou seja, sem nenhum caractere, lan�ando exce��o.
		// armazena o texto recebido em this.texto. FEITO
    }

    public int getQuantidade (char letra)
    {
        int qtdLetra = 0;
        for (int k = 0; k<this.texto.length(); k++) {
            if (letra == this.texto.charAt(k)) {
                qtdLetra ++;
            }
        }
        return qtdLetra;
        // percorre o String this.texto, conta e retorna
        // quantas letras existem nele iguais a letra fornecida 
    } 

    public int getPosicaoDaIezimaOcorrencia (int i, char letra) throws Exception
    {
        int qtdLetra = getQuantidade(letra);
        if (i >= qtdLetra) {
            throw new Exception("Posição Inválida");
        }
        int contador = 0;
        for (int k = 0; k<this.texto.length(); k++) {

            if (letra == this.texto.charAt(k)) {
                
                if (contador == i) {
                    
                    contador++;
                    return this.texto.indexOf(letra);
                }
            }
        }
        return i;
    }
        // ERRO AQUI NÃO SEI O QUE RETORNAR 

        // se i==0, retorna a posicao em que ocorre a primeira
        // aparicao de letra fornecida em this.texto;
        // se i==1, retorna a posicao em que ocorre a segunda
        // aparicao de letra fornecida em this.texto;
        // se i==2, retorna a posicao em que ocorre a terceira
        // aparicao de letra fornecida em this.texto;
        // e assim por diante.
        // lan�ar excecao caso nao encontre em this.texto
        // a I�zima apari��o da letra fornecida.

    public int getTamanho ()
    {
        return this.texto.length();
    }

    public String toString ()
    {
        return this.texto;
    }

    public boolean equals (Object obj)
    {
        // verificar se this e obj possuem o mesmo conte�do, retornando
        // true no caso afirmativo ou false no caso negativo
        return true;
    }

    public int hashCode ()
    {
        // calcular e retornar o hashcode de this
        return 8;
    }

    public int compareTo (Palavra palavra)
    {
        return this.texto.compareTo(palavra.texto);
    }
}