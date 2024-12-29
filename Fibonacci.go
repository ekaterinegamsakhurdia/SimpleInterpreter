package main


import (
	"fmt"
)


func main() {
// sums upto N
	var index = 0
	fmt.Println("Enter the index");
    fmt.Scanln(&index)
    var x = 0
    var y = 1
    var temp = 3;

	for temp <= index {
	x = x+y;
	y = x+y;
	temp = temp+2;
	}

	if index % 2 == 1 {
	fmt.Println("The Nth number of Fibonacci sequence is ");
	fmt.Println(x);
	}

	if index % 2 == 0 {
	fmt.Println("The Nth number of Fibonacci sequence is ");
	fmt.Println(y)
	}

}