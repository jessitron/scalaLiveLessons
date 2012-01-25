if (args.length > 0)
{
   System.out.println("We got arguments!")
   for (s <- args)
      System.out.println("We received: " + s)
}
else 
   System.out.println("No arguments. Boo.")

val message =
   if (args.length > 0) "We got arguments"
   else "Nope, nothing!"
System.out.println(message)