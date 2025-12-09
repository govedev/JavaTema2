public class egrtuioysdrgh {

    public static int[] creaBomboNumeros(int numBolas) {

		int array[] = new int[numBolas];

		for (int i = 0; i < numBolas; i++){

			array[i] = i;

		}

		return array;
	}

    public static void main(String[] args) {

        int j = 0;
        int algo[] = creaBomboNumeros(99999);

        for (int n : algo) {
            
            System.out.println(algo[n]);
            j++;
        }

        System.out.println(algo[0]);
        System.out.println(j);


        
    }
    
}
