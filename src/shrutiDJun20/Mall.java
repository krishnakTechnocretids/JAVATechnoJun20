/*
 * 1. Create a system (Shop) which maintains each items quantity.

a. Initial stocks of Maggie: 50 Maggie packets 
b. Initial stocks of Dosa : 43 packets 
c. Initial stocks of pouches : 39 oil packets 
d. Initial stocks of panipuri : 43 packets  
e. Initial stocks of masala’s : 73 packets.

Expectation:

1)Only one Customer came for shopping, he picked different items with diffrent quantities.  
2)Print "running of stock" message if a particular item is soldout.
3)Create a method which shows all items with remaining quantities.
4)Create a method which shows only those item which is "Out of stock".
5)Create a method which shows only those item which is "Available in stock".*/
 

package shrutiDJun20;

public class Mall {
	
	int maggie =50  ;
	int dosa = 43 ;
	int pouch =  39;
	int panipuri = 43 ;
	int masala =  73;

	void customerPurchase(int maggie2, int dosa2, int pouch2,int panipuri2,int masala2){
		maggie = maggie - maggie2;
		dosa = dosa - dosa2;
		pouch= pouch - pouch2;
		panipuri = panipuri - panipuri2;
		masala = masala - masala2;
	}
	 void runningOutOfStock(){
		 if(maggie<1){
			 System.out.println( "Maggie is out of stock. Packets left: "+maggie);
		 }
		 if(dosa<1){
			 System.out.println( "dosa is out of stock. Packets left: "+dosa);
		 }
		 if(pouch<1){
			 System.out.println( "pouch is out of stock. Packets left: "+pouch);
		 }
		 if(panipuri<1){
			 System.out.println( "panipuri is out of stock. Packets left: "+panipuri);
		 }
		 if(panipuri<1){
			 System.out.println( "masala is out of stock. Packets left: "+masala);
		 }
		 }
	 

	 
	 public static void main(String[] args) {
		 Mall mall = new Mall();
		 mall.customerPurchase(50, 10, 0, 10, 10);
		 mall.runningOutOfStock();
	}
	}

