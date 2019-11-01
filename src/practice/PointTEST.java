package practice;

class PointTEST {
	public static void main(String[] args) {
		Point3D p3 = new Point3D(1,2,3);
		System.out.println(p3.getLocation());
	}
}

class Point{
	int x, y;
	
	Point (int x, int y){
		this.x = x;
		this.y = y;
	}
	String getLocation() {
		return "x :"+x+", y :"+y;
	}
}

class Point3D extends Point{
	int z;
	
	Point3D(int x, int y, int z){
		super(x, y);	// 조상클래스 멤버 변수는 조상생성자에 의해 초기화되도록해야함
		//this.x = x;
		//this.y = y;
		this.z = z;
	}
	String getLocation() {	// 오버라이딩
		return "x :"+x+", y :"+y+", z :"+z;
	}
}