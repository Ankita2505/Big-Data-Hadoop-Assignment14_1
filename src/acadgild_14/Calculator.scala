package acadgild_14
import java.util.Scanner;
class Calculator(num1 : Int, num2 :Int) 
{
  var numerator = 0
  var denominator = 0
  
  //Finding the GCD of the inputs provided.
  
  private def findGCD(a : Int, b : Int) : Int = if (b==0) a else findGCD(b,a%b)
  
  if (num2 != 0)
  {
    val GetGCD = findGCD(num1.abs,num2.abs)
    numerator = num1 /GetGCD
    denominator = num2 /GetGCD
  }
  
  //Auxiliary Constructor
  def this(n : Int) = this(n,1)
  
  //Addition Operations on Rationals and Whole Numbers
  def +(that : Calculator) : Calculator =
    new Calculator(numerator * that.denominator + that.numerator * denominator, denominator * that.denominator)

  def +(i:Int):Calculator =
    new Calculator(numerator + i * denominator,denominator)
  
  //Subtraction Operations on Rationals and Whole Numbers
  def -(that : Calculator) : Calculator =
    new Calculator(numerator * that.denominator - that.numerator * denominator, denominator * that.denominator)

  def -(i:Int):Calculator =
    new Calculator(numerator - i * denominator,denominator)
  
  //Multiplication Operations on Rationals and Whole Numbers
  def *(that : Calculator) : Calculator =
    new Calculator(numerator * that.numerator ,denominator * that.denominator)

  def *(i:Int):Calculator =
    new Calculator(numerator * i, denominator)
  
  //Division Operations on Rationals and Whole Numbers
  def /(that : Calculator) : Calculator =
    new Calculator(numerator * that.denominator ,denominator * that.numerator)

  def /(i:Int):Calculator =
    new Calculator(numerator , denominator *i)
  
  override def toString = numerator + "/" + denominator
  
}


