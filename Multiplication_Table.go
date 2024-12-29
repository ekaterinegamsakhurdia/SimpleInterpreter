package main


import (
	"fmt"
)


func main() {
   var n = 0
   fmt.Println("Enter integer N");
   fmt.Scanln(&n)

   var temp = 1
   var result = 0;
   fmt.Println("Multiplication table ")
   for temp <= n {
   result= temp * n
    fmt.Println(result)
    temp = temp + 1
   }

}