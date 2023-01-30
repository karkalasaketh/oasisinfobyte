import java.util.Scanner;

public class game{
     
static void guessing(){

  Scanner sc=new Scanner(System.in);
int num;

int k=10;
int guess=(int)(Math.random()*100)+1;
System.out.print("Enter the Number:");
num=sc.nextInt();
while(true){
  
    if(k==0){
        System.out.print("Out of trials\n");
        break;
    }
  
    if(num>guess){
        System.out.print("Your guess is greater than the actual number\n");
       
System.out.print("Enter the Number:");
        num=sc.nextInt();
        k--;


    }
    else if(num<guess){
        System.out.print("Your guess is lesser than the actual number\n");
     
System.out.print("Enter the Number:");
        num=sc.nextInt();
        k--;
    }
    else{
        System.out.print("Yes your guess is right\n");
        System.out.print("Your guess:"+num+"\tRandom Number:"+guess);
        break;

    }
}


}



public static void main(String args[]){
    guessing();
}









}










             