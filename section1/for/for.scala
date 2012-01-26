for (s <- args)
   System.out.println(s)

System.out.println("********************")

for (i <- 1 to 6;    // generator
	 if (i % 2) == 0;
	 j <- 1 to 6;	 // generator
	 if (j % 2) == 0;
	 if ((i * j) % 2) == 0)
{
   System.out.println("i = " + i +
	   " j = " + j +
	   " i * j = " + (i&j) );
}