
/**
 *
 * @author Kleber Junio
 * @date 5 de maio de 2018
 */
class Recusividade {

    int calculaFatorial(int num) {
        if (num == 1 || num == 0) {
            return 1;
        }
        System.out.println("fatorial de -> " + num);
        return num * calculaFatorial(num - 1);
    }
    
    boolean eh_Palindromo(String palavra) {
        if (palavra.length() <= 1) {
            return true;
        } else {
            if(palavra.charAt(0)==palavra.charAt(palavra.length()-1)){
                return eh_Palindromo(palavra.substring(1, palavra.length()-1));
            }else{
                return false;
            }
        }
    }

    int x_elevado_y(int base, int expoente) {
        if (expoente == 0) {
            return 1;
        }
        return base * x_elevado_y(base, expoente - 1);
    }

    void metodoRecursivo(int valor) {
        if (valor >= 10) {
            return;
        }
        metodoRecursivo(valor + 1); //chama a funcao novamente - looping
        System.out.println(valor);
    }
}

//classe principal
public class Principal {

    public static void main(String[] args) {
        Recusividade r = new Recusividade();
//        r.metodoRecursivo(0);
//        System.out.println(r.calculaFatorial(5));
//        System.out.println(r.x_elevado_y(2, 4));

        System.out.println(r.eh_Palindromo("carro"));

    }
}
