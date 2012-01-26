for (s <- args)
   System.out.println(s)

System.out.println("********************")

def even(n : Int) = (n % 2) == 0

System.out.println(even(1))
System.out.println(even(2))

for (i <- 1 to 6;    // generator
	 if even(i);
	 j <- 1 to 6;	 // generator
	 if even(j);
	 if even(i*j))
{
   System.out.println("i = " + i +
	   " j = " + j +
	   " i * j = " + (i&j) );
}