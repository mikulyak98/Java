package lab1;

public class Lab1 {

	public double distance(double x1,double x2) {
		return Math.abs(x2 - x1);
		}

	public int Zam(int Num) {
		int n3 = Num % 10;
		Num = Num / 10;
		int n2 = Num % 10;
		int n1 = Num / 10;
		Num = n1*100 + n3*10 + n2;
		return Num;
	}
	
	public double[]  Variable(double A, double B, double C){
		double [] Arr = new double [3];
		if((A<B)&&(B<C)) {
			Arr[0] = A*2;
			Arr[1] = B*2;
			Arr[2] = C*2;
		}
		else {
			Arr[0] = A * (-1);
			Arr[1] = B * (-1);
			Arr[2] = C * (-1);
		}
		return Arr;
	}

	public String Years(int yo){
		String yos = String.valueOf(yo);
        if (yos.length() == 2) {
            String ret;
            switch (yos.charAt(0)) {
                case '2':
                    ret = "Twenty";
                    break;
                case '3':
                    ret = "Thirty";
                    break;
                case '4':
                    ret = "Forty";
                    break;
                case '5':
                    ret = "Fifty";
                    break;
                case '6':
                    ret = "Sixty";
                    break;
                case '7':
                    ret = "Seventy";
                    break;
                case '8':
                    ret = "Eighty";
                    break;
                case '9':
                    ret = "Ninety";
                    break;
                default:
                    ret = "";
            }
            switch (yos.charAt(1)) {
                case '0':
                    ret += " years";
                    break;
                case '1':
                    ret += "-one year";
                    break;
                case '2':
                    ret += " two years";
                    break;
                case '3':
                    ret += " three years";
                    break;
                case '4':
                    ret += " four years old";
                    break;
                case '5':
                    ret += " five years old";
                    break;
                case '6':
                    ret += "-six years";
                    break;
                case '7':
                    ret += " seven years old";
                    break;
                case '8':
                    ret += "-eight years";
                    break;
                case '9':
                    ret += " nine years old";
                    break;
            }
            return ret;
        }
        return "";
	}
	
	public boolean audit(int num) {
		if((num>9)&&(num%2 == 0)) {
			return true;
		}
		else {
			return false;
		}
	}

	public double Sport(double P) {
		double S = 10;
		int K = 1;
		P = P/100;
		do {
			S = S + P*S;
			K++;
		}while(S <= 200);
		return K;
	}
	
	public double [] cycle(double A, int N) {
		double [] a = new double [N];
		for (int i = 1; i <= N; i++) {
			a[i-1] = Math.pow(A, i);
		}
		return a;
	}
	
	public int Arr (double [] mas) {
		int index = 0;
		for (int i = 1; i<=mas.length-1; i++) {
			if((mas[i]>mas[i-1])&&(mas[i]>mas[i+1])) {
				index = i;
				break;
			}
			else {
				i++;
			}
		}
		return index;
	}
	
	public int [][] Matrix(int [][] arr, int k) 
	{
		int [][] arr1 = new int [arr.length][arr[0].length-1];
		for (int i=0;i<arr.length;i++)
		{
            for(int j=0;j<k;j++)
            {
            		arr1[i][j]=arr[i][j];
            		
            }
            for(int j = k; j<arr[0].length-1; j++)
            {
            	arr1[i][j] = arr[i][j+1];
            }
		}
		return arr1;
	}
}
