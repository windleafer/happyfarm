package prototype;



public class ChickenOrder implements Cloneable, Order {
	private String Uname;
	private int num;
	private Product product;
 
	public ChickenOrder(String Uname) {
		this.Uname = Uname;
		product = new Product();
	}
 
	public void setNum(int num) {
		this.num = num;
	}
 
	public int getNum() {
		return num;
	}
 
	private ChickenOrder(Product product) throws CloneNotSupportedException {
		this.product = (Product) product.Clone();
	}
 
	public void setProduct(int Pid, String Pname) {
		product.setId(Pid);
		product.setName(Pname);
	}
 
	public void display() {
		System.out.print("�ͻ���:" + Uname + " ");
		System.out.println("������Ŀ:" + num);
		System.out
				.println("��Ʒ��" + product.getId() + " ��Ʒ��" + product.getName());
		
		 Order chickenorder = new ChickenOrder(Uname);
	     OrderFolds.ChickenOrderList.add(chickenorder);
	     System.out.println(" Successfully create A chickenorder!");
	     
	}
 
	public Object Clone() throws CloneNotSupportedException {
		ChickenOrder obj = new ChickenOrder(this.product);
		obj.Uname = this.Uname;
		obj.num = this.num;
		return obj;
	}
}

