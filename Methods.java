package learnmethods;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Methods 
{
    public static void welcome()
    {
        System.out.println("Lap trinh Java 2021");
    }
    public static void chuoi(String s)
    {
        System.out.println(s);
    }
    public static void b3()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap n: ");
        int n=sc.nextInt();
        while(n<0){
            System.out.print("nhap n > 0: ");
            n=sc.nextInt();
        }
        System.out.print("nhap chuoi: ");
        String a=sc.nextLine();
        for(int i=0; i<n; i++){
            chuoi(a);
        }
    }
    public static void ptb1(double a, double b){
        double c = 0;
        if(a==0)
        {
           if(b==0)
           {
               System.out.println("pt vo so nghiem");
           }
           else
           {
               System.out.println("pt vo nghiem");
           }
       }else
        {
           c =(double)(-b/a);
           System.out.println("nghiem cua pt: " + c);
       }
    }
    public static void ptb2(double a, double b, double c)
    {
        double delta, x1, x2;
        if(a==0)
        {
            ptb1(b,c);
        }
        else
        {
            delta = b*b - 4*a*c;
            if(delta > 0) 
            {
            x1 = (-b+Math.sqrt(delta))/(2*a);
            x2 = (-b-Math.sqrt(delta))/(2*a);
            System.out.println("nghiem 1: " + x1 + "\n" + "nghiem 2: " + x2);
            }
            else if(delta == 0)
            {
                System.out.println("pt co nghiem kep: "+(-b/(2*a)));
            }
            else
            {
                System.out.println("pt vo nghiem");
            }
         }
    }
    public static void choose()
    {
        int d;
        double a,b,c;
        System.out.println("nhap so 1 de chon giai ptb1");
        System.out.println("nhap so 2 de chon giai ptb2");
        System.out.print("choose: ");
        Scanner s=new Scanner(System.in);
        d=s.nextInt();
        if(d==1 || d==2)
        {
            System.out.print("nhap a: ");
            a=s.nextDouble();
            System.out.print("nhap b: ");
            b=s.nextDouble();
            if(d==1)
            {
                ptb1(a,b);
            }
            else if(d==2)
            {
                System.out.print("nhap c: ");
                c=s.nextDouble();
                ptb2(a,b,c);
            }
        }
        
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double a;
        choose();
        System.out.println("Nhap 0 de dung ");
        System.out.println("Nhap 1 de tiep tuc");
        System.out.print("Choose: ");
        a = sc.nextInt();  
    }
}