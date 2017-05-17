public class kakkostepe {
   public String say() {
      
       String sana = new String("jou");
   
       return sana;
   }

    public void tee()
    {
        System.out.println(" teessa ollaan");
    }

    public kakkostepe()
    {

        System.out.println(" rakentaja");
    
        this.tee();
    }


   public static void main(String[] args) {

       kakkostepe olio = new kakkostepe();
       //olio.say();
   }
}
