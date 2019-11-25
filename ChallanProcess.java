import java.util.*;
public class ChallanProcess{
	public static void main(String args[]){

    LinkedList<String> object =new LinkedList<String>();
        object.add("Shummi");
        object.add("ALi");
        object.add("Sana");
        object.add("MOTUU");
      	 object.add("Muskan");
      	 object.add("Haris");
      
    //  for(String elum1 : object){
      System.out.println(" Names of the students from software department" +object);      //printing the students name
 // }


    int arr[]={1002,1003,1004,4400};
	int search=1003;


	String arr1[]={"software","chemical","telecom"};   //shows the departments
	for(String elum : arr1 ){
	System.out.println("  Challan paid by those departments  "+ elum);  //print the departments
     }
	System.out.println("Your Challan number is " +search+ " paid " +ChallanProcess(arr,search));
	}

public static int ChallanProcess(int arr[],int search){
	for(int i=0; i<arr.length;  i++){
		if(arr[i]==search){
			return i;
		}
	}
		return-1;
}	
}


