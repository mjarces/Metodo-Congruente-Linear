public class Solucao {
    
    public static float[] geradorCongruenteLinear(int x0, int a, int m, int c){
        float congruenteLinear[] = new float[1000];
        float uniformamenteDistribuido[] = new float[1000];

        //atribui a semente
        congruenteLinear[0] = x0;
        uniformamenteDistribuido[0] = x0;

        for (int i=1;i<999;i++){
            congruenteLinear[i] = ((congruenteLinear[i - 1] * a) +c) % m;
            uniformamenteDistribuido[i] = ((congruenteLinear[i]/m));
        }
        return uniformamenteDistribuido;
    }

    public static void main(String[] args) {
        int x0 = 7;
        int a = 4;
        int m = 9;
        int c = 4;

        float numerosGerados[] = geradorCongruenteLinear(x0, a, m, c);

        for(int i=0; i<999;i++){
            System.out.println(String.format("%.5f", numerosGerados[i])+ "\n");
        }
    }
}