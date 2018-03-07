package v1;

/**
 *
 * @author Diego
 */
public class Principal {
    public static void main(String[] args) {
        float[] arr1 = new float[]{1, 1};
        float[] arr2 = new float[]{1, 3};
        float[] arr3 = new float[]{3, 2};
        
        Triangulo tri = new Triangulo(arr1, arr2, arr3);
        System.out.println(tri.toString());
    }
}
