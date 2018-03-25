package cn.tju.scs;

public class Triangle {

	 private int a;
	 private int b;
	 private int c;
	public Triangle(){
		
	}
	
	public int ifTriangle(int i,int j,int p){
		//等边三角形返回1
		if(i == j && j == p){
			System.out.println(i);
			System.out.println(j);
			System.out.println(p);
			return 1;
		}
		//等腰三角形返回2
		else if(i == j || j == p || i == p){
			System.out.println(i);
			System.out.println(j);
			System.out.println(p);
			return 2;
		}
		//斜边三角形返回3
		else
			return 3;
	}

}
