package main

import (
	"fmt"
)

func main() {
	var a, i int
	fmt.Scan(&a)
	if a%2 == 0 {
		for i = 1; i <= 12; i = i + 2 {
			fmt.Printf("%d\n", a + i)
		}
	} else {
		for i = 0; i <= 10; i = i + 2 {
			fmt.Printf("%d\n", a + i)
		}
	}
}
