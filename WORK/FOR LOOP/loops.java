public class loops {    
public static void main(String[] args) {
int i;
int j;  
for (i=1;i<=2;i++)
{
System.out.println(" Outer:"+i );
for (j=1;j<=3;j++)
{
System.out.println("Inner:"+j);
}
}
}
}