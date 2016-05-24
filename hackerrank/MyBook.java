class MyBook extends Book{
    int price;
    
    MyBook(String title,String author,int price){
        super(title,author);
        this.price=price;
    }//constructor 
    
   public  void display(){
        System.out.println("Title: "+this.title);
        System.out.println("Author: "+this.author);
        System.out.println("Price: "+this.price);
    }
}//class

