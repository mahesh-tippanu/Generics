package generics;

public class MaxOf3Parameters
{
            public static  <E extends Comparable> E getMaximum(E a, E b, E c){
            E max=a;
            if(b.compareTo(a)>0 && b.compareTo(c)>0)
            {
                max=b;
            }
            else if(c.compareTo(max)>0)
            {
                max=c;
            }
            return max;
        }
        public static void main(String[] args) {
            System.out.println("Welcome to Test Maximum Program");
            int num1=196,num2=156,num3=659;
            System.out.println(getMaximum(num1,num2,num3));
            float a=76.7f,b=26.6f,c=98.5f;
            System.out.println(getMaximum(a,b,c));
            String s1="future",s2="century",s3="generation";
            System.out.println(getMaximum(s1,s2,s3));
        }
    }

