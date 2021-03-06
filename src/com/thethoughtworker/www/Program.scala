package com.thethoughtworker.www

object Program extends App {
	println("Problem 1 :" + problem1)
	println("Problem 2 :" + problem2)
	println("Over")

	/*Problem 1
	  If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
	  Find the sum of all the multiples of 3 or 5 below 1000.*/
	def problem1 = Range(1, 1000).filter(p => p % 3 == 0 || p % 5 == 0).sum

	/*Problem 2
	  Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
	  1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
	  By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.*/
	def problem2 = {
		def fibonacciUpToN(n:Int):List[Int]={
			var list = List(1,2)
			while (list.last < n){
				val temp: Int = list.last + list.init.last
				if(temp>=n)
					return list
				list = list :+ temp
			}

			list
		}
		val fibonacci4Million = fibonacciUpToN(4000000)
		fibonacci4Million.filter(p => p % 2 ==0).sum
	}
}
