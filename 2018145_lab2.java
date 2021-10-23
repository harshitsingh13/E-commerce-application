import java.util.ArrayList;
import java.util.Scanner;
interface search_cat{
	public void searchforcat1(ArrayList<material> arr);
	public void searchfordisp(ArrayList<material> arr,int q);
	
}
class material{
	private int unique_code;
	private String item_name;
	private int item_price;
	private int available_quantity;
	private String offer;
	private String category;
	private int bought_amount;
	private int bought_quantity;
	private String merch_name;
	material(int unique_code,String item_name,String merch_name,int item_price,int available_quantity,String offer,String category){
		this.unique_code=unique_code;
		this.item_name=item_name;
		this.merch_name=merch_name;
		this.item_price=item_price;
		this.available_quantity=available_quantity;
		this.offer=offer;
		this.category=category;
	}
	material(String item_name,int bought_quantity,int bought_amount,String merch_name){
		this.item_name=item_name;
		this.bought_quantity=bought_quantity;
		this.bought_amount=bought_amount;
		this.merch_name=merch_name;
	}
	public void set_boughtquantity(int bought_quantity) {
		this.bought_quantity=bought_quantity;
	}
	public void set_boughtamount(int bought_amount) {
		this.bought_amount=bought_amount;
	}
	public void set_merchname(String merch_name) {
		this.merch_name=merch_name;
	}
	public void set_uniquecode(int unique_code) {
		this.unique_code=1;
	}
	public void set_itemname(String item_name) {
		this.item_name=item_name;
	}
	public void set_itemprice(int item_price) {
		this.item_price=item_price;
	}
	public void set_availablequantity(int available_quantity) {
		this.available_quantity=available_quantity;
	}
	public void set_offer(String offer) {
		this.offer=offer;
	}
	public void set_category(String category) {
		this.category=category;
	}
	public int get_uniquecode() {
		return this.unique_code;
	}
	public String get_itemname() {
		return this.item_name;
	}
	public int get_itemprice() {
		return this.item_price;
	}
	public int get_availablequantity() {
		return this.available_quantity;
	}
	public String get_offer() {
		return this.offer;
	}
	public String get_category() {
		return this.category;
	}
	public int get_boughtquantity() {
		return this.bought_quantity;
	}
	public int get_boughtamount() {
		return this.bought_amount;
	}
	public String get_merchname() {
		return this.merch_name;
	}
}
///////////////////////////////////////////////////////////////////
class customer{
	private int customer_id;
	private String customer_name;
	private String customer_address;
	private int no_order_placed;
	private int customer_account;
	private int reward_account;
	customer(int customer_id,String customer_name,String customer_address,int no_order_placed,int customer_account,int reward_account){
		this.customer_id=customer_id;
		this.customer_name=customer_name;
		this.customer_address=customer_address;
		this.no_order_placed=no_order_placed;
		this.customer_account=customer_account;
		this.reward_account=reward_account;
	}
	public void searchforcat1(ArrayList<material> arr) {
		for(int i=0;i<arr.size();i++)
			System.out.println(arr.get(i).get_uniquecode()+" "+arr.get(i).get_category());
		
	}
	public void searchfordisp(ArrayList<material> arr,int q) {
		for(int j=0;j<arr.size();j++)
			System.out.println(arr.get(j).get_uniquecode()+" "+arr.get(j).get_itemname()+" "+arr.get(j).get_itemprice()+" "+arr.get(j).get_availablequantity()+" "+arr.get(j).get_offer()+" "+arr.get(j).get_category());
	}
	public void set_address(String address) {
		this.customer_address=customer_address;
	}
	public void set_customeraccount(int customer_account) {
		this.customer_account=customer_account;
	}
	public void set_rewardaccount(int reward_account) {
		this.reward_account=reward_account;
	}
	public void set_orderplace(int no_order_placed) {
		this.no_order_placed=no_order_placed;
	}
	public void set_customerid(int customer_id) {
		this.customer_id=customer_id;
	}
	public void set_customername(String customer_name) {
		this.customer_name=customer_name;
	}
	public int get_customerid() {
		return this.customer_id;
	}
	public String get_customername() {
		return this.customer_name;
	}
	public int get_orderplaced() {
		return this.no_order_placed;
		}
	public int get_customeraccount() {
		return this.customer_account;}
	public int get_rewardaccount() {
		return this.reward_account;}
	public String get_address() {
		return this.customer_address;
	}
}

//////////////////////////////////////////////////////////////////
class merchant implements search_cat{
	private int merchant_id;
	private String merchant_name;
	private String merchant_address;
	private double merchant_account;
	merchant(int merchant_id,String merchant_name,String merchant_address,double merchant_account){
		this.merchant_id=merchant_id;
		this.merchant_name=merchant_name;
		this.merchant_address=merchant_address;
		this.merchant_account=merchant_account;
	}
	public void set_merchantaccount(double merchant_account) {
		this.merchant_account=merchant_account;
	}
	public void set_merchantid(int merchant_id) {
		this.merchant_id=merchant_id;
	}
	public void set_merchantname(String merchant_name) {
		this.merchant_name=merchant_name;
	}
	public int get_merchantid() {
		return this.merchant_id;
	}
	public String get_merchantname() {
		return this.merchant_name;
	}
	public double get_merchantaccount() {
		return this.merchant_account;
	}
///////////////////////////////////////////////////////////////////////////////////
	public void searchforcat1(ArrayList<material> arr) {
		for(int i=0;i<arr.size();i++)
			System.out.println((i+1)+" "+arr.get(i).get_category());
			
	}
	public void searchfordisp(ArrayList<material> arr,int q) {
		for(int i=0;i<arr.size();i++) {
			if(arr.get(i).get_category().contentEquals(arr.get(q-1).get_category())) {
				System.out.println(arr.get(i).get_uniquecode()+" "+arr.get(i).get_itemname()+" "+arr.get(i).get_itemprice()+" "+arr.get(i).get_availablequantity()+" "+arr.get(i).get_offer()+" "+arr.get(i).get_category());
			}
		}
		
	}
	
}
//////////////////////////////////////////////////////////////////
public class labnew{
	//static float company_balance=0;
	static material mt;
	static customer cs;
	static merchant mc;
	static Scanner s=new Scanner(System.in);
	////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		int i=0;
		int i1=0;
		double company_balance=0;
		int slot=2;
		//System.out.println();
		//System.out.println(company_balance);
		ArrayList<material> arr1 = new ArrayList<material>();
		ArrayList<customer> arr2 = new ArrayList<customer>();
		ArrayList<merchant> arr3 = new ArrayList<merchant>();
		ArrayList<material> item_bought = new ArrayList<material>();
		ArrayList<material> add_to_cart = new ArrayList<material>();
		//////////////////////////////////////////////////////////////
		/*mt=new material(1,"chips",10,5,"none","lays");
		arr1.add(mt);
		mt=new material(2,"almond milk",40,10,"none","milk");
		arr1.add(mt);
		mt=new material(3,"rose soap",20,25,"none","soap");
		arr1.add(mt);
		mt=new material(4,"surf excel",100,15,"none","detergent");
		arr1.add(mt);
		mt=new material(5,"mustard oil",80,20,"none","oil");
		arr1.add(mt);*/
		/////////////////////////////////////////////////////////////
		cs=new customer(1,"Ali","12/a,abc",0,100,0);
		arr2.add(cs);
		cs=new customer(2,"Nobby","12/b,abc",0,100,0);
		arr2.add(cs);
		cs=new customer(3,"Bruno","12/c,abc",0,100,0);
		arr2.add(cs);
		cs=new customer(4,"Borat","12/d,abc",0,100,0);
		arr2.add(cs);
		cs=new customer(5,"Aladeen","12/e,abc",0,100,0);
		arr2.add(cs);
		////////////////////////////////////////////////////////////
		mc=new merchant(1,"Jack","12/a,abc",0);
		arr3.add(mc);
		mc=new merchant(2,"John","12/b,abc",0);
		arr3.add(mc);
		mc=new merchant(3,"James","12/c,abc",0);
		arr3.add(mc);
		mc=new merchant(4,"Jeff","12/d,abc",0);
		arr3.add(mc);
		mc=new merchant(5,"Joseph","12/e,abc",0);
		arr3.add(mc);
		////////////////////////////////////////////////////////////
		
		////////////////////////////////////////////////////////////
		Boolean st0=true;
		while(st0!=false) {
		System.out.println("****WELCOME TO MERCURY****");
		System.out.println("1) ENTER AS A MERCHANT");
		System.out.println("2) ENTER AS A CUSTOMER");
		System.out.println("3) SEE USER DETAILS");
		System.out.println("4) COMPANY ACCOUNT BALANCE");
		System.out.println("5) EXIT");
		int q1=s.nextInt();
		Boolean st1=true;
		if(q1==1&&st1!=false) {
		while(q1==1&&st1!=false) {
			System.out.println("CHOOSE MERCHANT");
			System.out.println(arr3.get(0).get_merchantid()+" "+arr3.get(0).get_merchantname());
			System.out.println(arr3.get(1).get_merchantid()+" "+arr3.get(1).get_merchantname());
			System.out.println(arr3.get(2).get_merchantid()+" "+arr3.get(2).get_merchantname());
			System.out.println(arr3.get(3).get_merchantid()+" "+arr3.get(3).get_merchantname());
			System.out.println(arr3.get(4).get_merchantid()+" "+arr3.get(4).get_merchantname());
			int q2=s.nextInt();
			Boolean st2=true;
			while(st2!=false) {
				System.out.println("WELCOME"+" "+arr3.get(q2-1).get_merchantname());
				System.out.println("MERCHANT MENU");
				System.out.println("1) ADD ITEM");
				System.out.println("2) EDIT ITEM");
				System.out.println("3) SEARCH BY CATEGORY");
				System.out.println("4) ADD OFFERS");
				System.out.println("5) REWARD WON");
				System.out.println("6) EXIT");
				int q3=s.nextInt();
				Boolean st3=true;
				Boolean st4=true;
				Boolean st5=true;
				Boolean st6=true;
				Boolean st7=true;
				if(q3==1&&st3!=false&&slot!=0) {
				while(q3==1&&st3!=false&&slot!=0) {
					System.out.println("ENTER ITEM DETAILS");
					System.out.println("ITEM NAME:");
					String i_name=s.next();
					System.out.println("ITEM PRICE:");
					int price=s.nextInt();
					System.out.println("ITEM QUANTITY:");
					int quantity=s.nextInt();
					System.out.println("ITEM CATEGORY:");
					String category=s.next();
					i+=1;
					mt=new material(i,i_name,arr3.get(q2-1).get_merchantname(),price,quantity,"none",category);
					arr1.add(mt);
					System.out.println(arr1.get(i1).get_uniquecode()+" "+arr1.get(i1).get_itemname()+" "+arr1.get(i1).get_itemprice()+" "+arr1.get(i1).get_availablequantity()+" "+arr1.get(i1).get_offer()+" "+arr1.get(i1).get_category());
					i1+=1;
					st3=false;
				}}
				else if(q3==2&&st4!=false) {
					while(q3==2&&st4!=false) {
						System.out.println("CHOOSE ITEM BY CODE");
						for(int j=0;j<arr1.size();j++)
							System.out.println(arr1.get(j).get_uniquecode()+" "+arr1.get(j).get_itemname()+" "+arr1.get(j).get_itemprice()+" "+arr1.get(j).get_availablequantity()+" "+arr1.get(j).get_offer()+" "+arr1.get(j).get_category());
						int q5=s.nextInt();
						System.out.println("ENTER EDIT DETAILS");
						System.out.println("ITEM PRICE:");
						int price=s.nextInt();
						System.out.println("ITEM QUANTITY:");
						int quantity=s.nextInt();
						mt=new material(q5,arr3.get(q2-1).get_merchantname(),arr1.get(q5-1).get_itemname(),price,quantity,arr1.get(q5-1).get_offer(),arr1.get(q5-1).get_category());
						arr1.set(q5-1, mt);
						System.out.println(arr1.get(q5-1).get_uniquecode()+" "+arr1.get(q5-1).get_itemname()+" "+arr1.get(q5-1).get_itemprice()+" "+arr1.get(q5-1).get_availablequantity()+" "+arr1.get(q5-1).get_offer()+" "+arr1.get(q5-1).get_category());
						st4=false;
					}
					
				}
				else if(q3==3&&st5!=false) {
					while(q3==3&&st5!=false) {
						System.out.println("CHOOSE A CATEGORY");
						mc.searchforcat1(arr1);
						int q6=s.nextInt();
						mc.searchfordisp(arr1,q6);
						st5=false;
					}
				}
				else if(q3==4&&st6!=false) {
					while(q3==4&&st6!=false) {
						System.out.println("CHOOSE ITEM BY CATEGORY");
						for(int j=0;j<arr1.size();j++)
							System.out.println(arr1.get(j).get_uniquecode()+" "+arr1.get(j).get_itemname()+" "+arr1.get(j).get_itemprice()+" "+arr1.get(j).get_availablequantity()+" "+arr1.get(j).get_offer()+" "+arr1.get(j).get_category());
						int q7=s.nextInt();
						System.out.println("CHOOSE OFFER");
						System.out.println("1) BY ONE GET ONE FREE");
						System.out.println("2) 25% OFF");
						int q8=s.nextInt();
						if(q8==1&&arr1.get(q7-1).get_availablequantity()==1) {
							System.out.println(arr1.get(q7-1).get_uniquecode()+" "+arr1.get(q7-1).get_itemname()+" "+arr1.get(q7-1)+arr1.get(q7-1).get_itemprice()+" "+arr1.get(q7-1).get_availablequantity()+" "+"none"+" "+arr1.get(q7-1).get_category());
						}
						if(q8==1)
							System.out.println(arr1.get(q7-1).get_uniquecode()+" "+arr1.get(q7-1).get_itemname()+" "+arr1.get(q7-1).get_itemprice()+" "+arr1.get(q7-1).get_availablequantity()+" "+"BY ONE GET ONE FREE"+" "+arr1.get(q7-1).get_category());
						else {
							System.out.println(arr1.get(q7-1).get_uniquecode()+" "+arr1.get(q7-1).get_itemname()+" "+arr1.get(q7-1).get_itemprice()+" "+arr1.get(q7-1).get_availablequantity()+" "+"25% OFF"+" "+arr1.get(q7-1).get_category());
						}
						st6=false;
					}	
				}
				else if(q3==5&&st7!=false) {
					while(q3==5&&st7!=false) {
						if(arr3.get(q2-1).get_merchantaccount()>100) {
							slot=slot+1;
						}
						
						st7=false;
					}
				}
				else if(q3==6) {
					st1=st2=false;
				}
				else {
					System.out.println("YOU ENTER WRONG CHOICE");
					st2=false;
				}
				}
		}
		}
/////////////////////////////////  CUSTOMER  ////////////////////////////////////////////////////////
		Boolean st2=true;
		if(q1==2&&st2!=false) {
			while(q1==2&&st2!=false) {
				System.out.println("CHOOSE CUSTOMER");
				System.out.println(arr2.get(0).get_customerid()+" "+arr2.get(0).get_customername());
				System.out.println(arr2.get(1).get_customerid()+" "+arr2.get(1).get_customername());
				System.out.println(arr2.get(2).get_customerid()+" "+arr2.get(2).get_customername());
				System.out.println(arr2.get(3).get_customerid()+" "+arr2.get(3).get_customername());
				System.out.println(arr2.get(4).get_customerid()+" "+arr2.get(4).get_customername());
				int q2=s.nextInt();
				Boolean st3=true;
				while(st3!=false) {
					System.out.println("WELCOME"+" "+arr2.get(q2-1).get_customername());
					System.out.println("CUSTOMER MENU");
					System.out.println("1) SEARCH ITEM");
					System.out.println("2) CHECKOUT CART");
					System.out.println("3) REWARD WON");
					System.out.println("4) PRINT LATEST ORDERS");
					System.out.println("5) EXIT");
					int q3=s.nextInt();
					Boolean st4=true;
					Boolean st5=true;
					Boolean st6=true;
					Boolean st7=true;
					Boolean st8=true;
					if(q3==1&&st4!=false) {
						while(q3==1&&st4!=false) {
							System.out.println("CHOOSE ITEM BY CATEGORY");
							System.out.println("CHOOSE A CATEGORY");
							cs.searchforcat1(arr1);
							int q4=s.nextInt();
							System.out.println("CHOOSE ITEM BY CODE");
							cs.searchfordisp(arr1,q4);
							System.out.println("ENTER ITEM BY CODE");
							int q5=s.nextInt();
							System.out.println("ENTER ITEM QUANTITY");
							int q6=s.nextInt();
							if(q6<=arr1.get(q5-1).get_availablequantity()) {
								System.out.println("CHOOSE METHOD OF TRANSACTION");
								System.out.println("1) BUY ITEM");
								System.out.println("2) ADD ITEM TO CART");
								System.out.println("3) EXIT");
								int q7=s.nextInt();
								if(q7==1&&st5!=false) {
									while(q7==1&&st5!=false) {
										if(arr1.get(q5-1).get_itemprice()<=arr2.get(q2-1).get_customeraccount()) {
											if(arr1.get(q5-1).get_offer().contentEquals("BY ONE GET ONE FREE")) {
											System.out.println("ITEM SUCCESSFULLY BOUGHT");
											arr2.get(q2-1).set_orderplace(arr2.get(q2-1).get_orderplaced()+1);
											int account=arr2.get(q2-1).get_customeraccount()-(arr1.get(q5-1).get_itemprice()*q6);
											company_balance=company_balance+0.01*account;
											for(int j=0;j<arr3.size();j++)
												if(arr1.get(q5-1).get_merchname().contentEquals(arr3.get(j).get_merchantname()))
													arr3.get(j).set_merchantaccount(arr3.get(j).get_merchantaccount()+account);
											int benefit=arr2.get(q2-1).get_orderplaced()%5;
											arr2.get(q2-1).set_rewardaccount(arr2.get(q2-1).get_rewardaccount()+benefit*10);
											arr1.get(q5-1).set_availablequantity((arr1.get(q5-1).get_availablequantity()-(q6-1)));
											mt=new material(arr1.get(q5-1).get_itemname(),q6,(arr1.get(q5-1).get_itemprice()*q6),arr1.get(q5-1).get_merchname());
											item_bought.add(mt);}
											if(arr1.get(q5-1).get_offer().contentEquals("25% OFF")) {
												System.out.println("ITEM SUCCESSFULLY BOUGHT");
												arr2.get(q2-1).set_orderplace(arr2.get(q2-1).get_orderplaced()+1);
												double account=arr2.get(q2-1).get_customeraccount()-(0.25*(arr1.get(q5-1).get_itemprice()*q6));
												company_balance=company_balance+0.01*account;
												for(int j=0;j<arr3.size();j++)
													if(arr1.get(q5-1).get_merchname().contentEquals(arr3.get(j).get_merchantname()))
														arr3.get(j).set_merchantaccount(arr3.get(j).get_merchantaccount()+account);
												int benefit=arr2.get(q2-1).get_orderplaced()%5;
												arr2.get(q2-1).set_rewardaccount(arr2.get(q2-1).get_rewardaccount()+benefit*10);
												arr1.get(q5-1).set_availablequantity((arr1.get(q5-1).get_availablequantity()-(q6-1)));
												mt=new material(arr1.get(q5-1).get_itemname(),q6,(arr1.get(q5-1).get_itemprice()*q6),arr1.get(q5-1).get_merchname());
												item_bought.add(mt);
											}
											st5=st4=false;
										}
									}
								}
								else if(q7==2&&st6!=false) {
									while(q7==2&&st6!=false) {
										mt=new material(arr1.get(q5-1).get_itemname(),q6,(arr1.get(q5-1).get_itemprice()*q6),arr1.get(q5-1).get_merchname());
										add_to_cart.add(mt);
										
										st4=st5=st6=false;
									}
								}
								else if(q7==3) {
									st4=st5=st6=false;
								}
							}
						}
					}
					if(q3==2&&st4!=false) {
						while(q3==2&&st4!=false) {
							for(int j=0;j<add_to_cart.size();j++) {
								if(add_to_cart.get(j).get_boughtquantity()<=arr1.get(j).get_availablequantity()&&arr2.get(q2-1).get_customeraccount()>=arr1.get(j).get_itemprice()) {
									System.out.println("ITEM SUCCESSFULLY CHECKOUT FROM YOUR CART");
									arr2.get(q2-1).set_orderplace(arr2.get(q2-1).get_orderplaced()+1);
									int account=arr2.get(q2-1).get_customeraccount()-(arr1.get(j).get_itemprice()*add_to_cart.get(j).get_boughtquantity());
									company_balance=company_balance+0.01*account;
									for(int k=0;k<arr3.size();k++)
										if(add_to_cart.get(j).get_merchname().contentEquals(arr3.get(k).get_merchantname()))
											arr3.get(k).set_merchantaccount(arr3.get(k).get_merchantaccount()+account);
									int benefit=arr2.get(q2-1).get_orderplaced()%5;
									arr2.get(q2-1).set_rewardaccount(arr2.get(q2-1).get_rewardaccount()+benefit*10);
									arr1.get(j).set_availablequantity(arr1.get(j).get_availablequantity()-add_to_cart.get(j).get_boughtquantity());
									mt=new material(arr1.get(j).get_itemname(),add_to_cart.get(j).get_boughtquantity(),(arr1.get(j).get_itemprice()*add_to_cart.get(j).get_boughtquantity()),arr1.get(j).get_merchname());
									item_bought.add(mt);
								}
								else if(add_to_cart.get(j).get_boughtquantity()<=arr1.get(j).get_availablequantity()&&arr2.get(q2-1).get_customeraccount()<arr1.get(j).get_itemprice()) {
									System.out.println("INSUFFICIENT BALANCE IN YOUR ACCOUNT");
								}
								else {
									System.out.println("ITEM IS OUT OF STOCK");
								}
							}
							st4=false;
						}
					}
					else if(q3==3&&st4!=false) {
						while(q3==3&&st4!=false) {
							//int benefit=arr2.get(q2-1).get_orderplaced()%5;
							System.out.println("WON REWARD OF RUPEES:"+arr2.get(q2-1).get_rewardaccount());
							st4=false;
						}
					}
					else if(q3==4&&st4!=false) {
						while(q3==4&&st4!=false) {
							for(int j=0;j<item_bought.size();j++)
								System.out.println("BROUGHT ITEM"+" "+item_bought.get(j).get_itemname()+" QUANTITY:"+item_bought.get(j).get_boughtquantity()+" FOR RS "+item_bought.get(j).get_boughtamount()+" FROM MERCHANT "+item_bought.get(j).get_merchname());
							st4=false;
						}
					}
					else if(q3==5&&st4!=false) {
						while(q3==5&&st4!=false) {
							st1=st2=st3=st4=false;
					}}
					
				}
		
	}
			}
		if(q1==3&&st2!=false) {
			while(q1==3&&st2!=false) {
				System.out.println(arr2.get(0).get_customername()+" "+arr2.get(0).get_address()+" "+arr2.get(0).get_orderplaced());
				System.out.println(arr2.get(1).get_customername()+" "+arr2.get(1).get_address()+" "+arr2.get(1).get_orderplaced());
				System.out.println(arr2.get(2).get_customername()+" "+arr2.get(2).get_address()+" "+arr2.get(2).get_orderplaced());
				System.out.println(arr2.get(3).get_customername()+" "+arr2.get(3).get_address()+" "+arr2.get(3).get_orderplaced());
				System.out.println(arr2.get(4).get_customername()+" "+arr2.get(4).get_address()+" "+arr2.get(4).get_orderplaced());
				st2=st1=false;
			}
		}
		if(q1==4&&st2!=false) {
			while(q1==4&&st2!=false) {
				System.out.println("CURRENT COMPANY ACCOUNT BALANCE IS:"+company_balance);
				st2=st1=false;
			}
		}
		if(q1==5&&st2!=false) {
			st2=st1=st0=false;
		}
		}
}
}

