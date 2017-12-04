package acadgild_14

import java.util.Scanner;
object Calculator_Main
{
  //Display options available in the Calculator to the User
  
  private def OperationsList() =
  {
    println("\n************* CALCULATOR **************")
    println("-------------------------------\n")
    println("Pick an operation to perform")
    println("1. Add  Rational Numbers")
    println("2. Subtract  Rational Numbers")
    println("3. Multiply  Rational Numbers")
    println("4. Divide  Rational Numbers")
    println("5. Add   Number")
    println("6. Subtract Number")
    println("7. Multiply Number")
    println("8. Divide Number")
    println("9.Exit")
    println("-------------------------------")
  }
  
  //Get input and call appropriate overloaded method in class based on user choice
  def Compute(rational : Calculator, number:Int):Calculator =
  {
    number match
    {
      case 1 =>
        val n = scala.io.StdIn.readInt()
        val d = scala.io.StdIn.readInt()
        rational.+(new Calculator(n,d))
        
        case 2 =>
        val n = scala.io.StdIn.readInt()
        val d = scala.io.StdIn.readInt()
        rational.-(new Calculator(n,d))
        
        case 3 =>
        val n = scala.io.StdIn.readInt()
        val d = scala.io.StdIn.readInt()
        rational.*(new Calculator(n,d))
        
        case 4 =>
        val n = scala.io.StdIn.readInt()
        val d = scala.io.StdIn.readInt()
        rational./(new Calculator(n,d))
        
        case 5 =>
        val n = scala.io.StdIn.readInt()
        rational.+(new Calculator(n))
        
        case 6 =>
        val n = scala.io.StdIn.readInt()
        rational.-(new Calculator(n))
        
        case 7 =>
        val n = scala.io.StdIn.readInt()
        rational.*(new Calculator(n))
        
        case 8 =>
        val n = scala.io.StdIn.readInt()
        rational./(new Calculator(n))
        
        case _ => rational       
        
    }   
    
  }
  
  //Main Method
  def main (args : Array[String]): Unit =
  {
    //Create instance of class
    var rationalNumber :Calculator =new Calculator(0)
    var input = 0
    
    do
    {
      OperationsList()
      input= scala.io.StdIn.readInt()
      rationalNumber = Compute(rationalNumber,input)
      
      println("*************************")
      //Result of calculation based on operations choosen
      println("OUTPUT IS : " + rationalNumber.toString)
      println("*************************\n\n")
    }while(input != 9)
  }
}