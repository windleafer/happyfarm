package prototype;

public class FishOrder implements Cloneable, Order {
	private String Uname;
	private int num;
	private Product product;
 
	public FishOrder(String Uname) {
		this.Uname = Uname;
		product = new Product();
	}
 
	public void setNum(int num) {
		this.num = num;
	}
 
	public int getNum() {
		return num;
	}
 
	private FishOrder(Product product) throws CloneNotSupportedException {
		this.product = (Product) product.Clone();
	}
 
	public void setProduct(int Pid, String Pname) {
		product.setId(Pid);
		product.setName(Pname);
	}
 
	public void display() {
		System.out.print("�ͻ���:" + Uname + " ");
		System.out.println("������Ŀ:" + num);
		System.out.println("��Ʒ��" + product.getId() + " ��Ʒ��" + product.getName());
		
		 Order fishorder = new FishOrder(Uname);
	     OrderFolds.ChickenOrderList.add(fishorder);
	     System.out.println(" Successfully create A fishorder!");
	}
 
	public Object Clone() throws CloneNotSupportedException {
		FishOrder obj = new FishOrder(this.product);
		obj.Uname = this.Uname;
		obj.num = this.num;
		return obj;
	}
}
