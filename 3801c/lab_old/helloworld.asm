.data
out_string: .asciiz "\nHello, World!\n"
.text
li $v0, 4
la $a0, out_string
syscall
li $v0, 10
syscall