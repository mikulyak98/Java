package test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import lab1.Lab1;

public class NewTest {
  @Test(dataProvider = "distanceProvider")
  public void distanceTest(double x1, double x2, double res) {
	  assertEquals(new Lab1().distance(x1, x2), res);
  }
  @DataProvider
  public Object[][] distanceProvider(){
	  return new Object [][]{
		  {0,1,1},
		  {-5,5,10},
		  {10,-7,17}
	  };
  }
  
  @Test(dataProvider = "ZamProvider")
  public void ZamTest(int Num, int res) {
	  assertEquals(new Lab1().Zam(Num),res);
  }
  @DataProvider
  public Object[][] ZamProvider() {
	  return new Object [][] {
			  {132,123},
			  {225,252}
	  };
  }
  
  @Test(dataProvider = "VariableProvider")
  public void VariableTest(double A,double B,double C, double [] Arr) {
	  assertEquals(new Lab1().Variable(A, B, C), Arr);
  }
  @DataProvider
  public Object [][] VariableProvider(){
	  return new Object [][] {
		  {1,2,3, new double[] {2.0, 4.0, 6.0}},
		  {5,-3,7, new double[] {-5.0, 3.0, -7.0}}
	  };
  }
  
  @Test(dataProvider = "YearsProvider")
  public void YearsTest(int yo, String ret) {
	  assertEquals(new Lab1().Years(yo),ret);
  }
  @DataProvider
  public Object [][] YearsProvider(){
	  return new Object [][] {
		  {23, "Twenty" + " three years"},
		  {54, "Fifty" + " four years old"},
		  {41, "Forty" + "-one year"},
		  {60, "Sixty" + " years"}
	  };
  }
  
  @Test(dataProvider = "auditProvider")
  public void auditTest(int num, boolean expected) {
	  assertEquals(new Lab1().audit(num),expected);
  }
  @DataProvider
  public Object [][] auditProvider(){
	  return new Object [][] {
		  {45, false},
		  {8, false},
		  {22, true}
	  };
  }
  
  @Test(dataProvider = "SportProvider")
  public void SportTest(double P, double res) {
	  assertEquals(new Lab1().Sport(P),res);
  }
  @DataProvider
  public Object [][] SportProvider(){
	  return new Object [][] {
		  {40, 10},
		  {20, 18}
	  };
  }
  
  @Test(dataProvider = "cycleProvider")
  public void cycleTest(double A, int N, double [] a) {
	  assertEquals(new Lab1().cycle(A, N),a);
  }
  @DataProvider
  public Object [][] cycleProvider(){
	  return new Object [][] {
		  {2, 3, new double[] {2,4,8}},
		  {2, 6, new double[] {2,4,8,16,32,64}},
		  {8, 8, new double[] {8, 64, 512, 4096, 32768, 262144, 2097152, 16777216}}
	  };
  }
  
  @Test(dataProvider = "ArrProvider")
  public void ArrayTest(double [] mas, int index) {
	  assertEquals(new Lab1().Arr(mas), index);
  }
  @DataProvider
  public Object [][] ArrProvider(){
	  return new Object [][] {
		  {new double [] {1,2,3,4,5,6,3,1}, 5},
	  };
  }
  
  @Test(dataProvider = "MatrixProvider")
  public void MatrixTest(int [][] arr, int k,  int [][]arr1) {
	  assertEquals(new Lab1().Matrix(arr, k), arr1);
	  //assertEquals(new Lab1().Matrix(arr, k), arr1);
  }
  @DataProvider
  public Object [][] MatrixProvider(){
	  return new Object [][] {
		  {new int [][] {{1,2,3},{4,5,6},{7,8,9}}, 1,  new int [][] {{1,3},{4,6},{7,9}}}
	  };
  }
}
