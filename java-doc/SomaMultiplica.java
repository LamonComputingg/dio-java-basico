public class SomaMultiplica {
    public static void main(String[] args) {
        int resultado = somamultiplica(2, 3, "M"); // Exemplo de uso da função
        System.out.println("Resultado: " + resultado);
    }

    public static int somamultiplica(int n, int x, String m) {
        int r = 0; // r é igual ao resultado
        if (m.equals("M")) { // Usar equals para comparar strings em Java
            r = n * x;
        } else {
            // se não, soma mesmo
            r = n + x;
        }
        return r;
    }
}
