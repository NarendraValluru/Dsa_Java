public class EmpDetails {
    public static void main(String[] args) {
        System.out.println("emp details");
        empdetails(1,"Mano",23344);
        empdetails(2, "Sai",276876);
        empdetails(3, "Manoj", 383837);        
    }
    
    public static void empdetails(int id,String name,double sal){
        System.out.println( "ID: "+id +" Name: "+ name+ " Sal: "+sal );

    }
}
