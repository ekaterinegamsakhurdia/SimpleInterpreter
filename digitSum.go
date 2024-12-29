package main

import (
	"fmt"
)

func main() {
	var x = 0
	fmt.Println("Enter a number")
	fmt.Scanln(&x)
	var sum = 0
	for x != 0 {
		sum = sum + x%10
		x = x / 10
	}
	fmt.Println("The sum of digits is ")
	fmt.Println(sum)
}
