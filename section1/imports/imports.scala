import System.out._

println("Hello")

{  // import scoped to block
   import java.math.BigInteger

   val bi = new BigInteger("5")
   println(bi)
}


import java.math.{BigInteger => BInt}
import BInt._


def countTo(n : BInt) =
{
	def count(i : BInt) : Unit =
	   if (i.min(n) == i)
	   {
		   println(i)
		   count(i add ONE)
	   }
	count( ONE)
}

countTo(new BInt("5"))
