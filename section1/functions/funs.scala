def print (s : String) =
   System.out.println(s)

def print (i : Int) =
   System.out.println("It's an int: " + i)

print("Hello")
print(5)
print(if (args.length > 0) args(0) else "from Scala!")

def countTo(n : Int) = 
{
	def count(i : Int) : Unit =
	{
		if (i <= n) {
			System.out.println(i)
			count(i + 1)
		}
	}
	count(1)
}

countTo(5)