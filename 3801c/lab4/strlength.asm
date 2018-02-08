.data
str: .asciiz "ThiS is A !@# Weird StrinG."
.text
 # Load address of string into a0
la $t2, str #load the string on a reg 
strlen:
 li $t0, 0 # initialize the count to zero 
loop:
lb $t1, 0($t2) # load the next character into t1
beqz $t1, exit # check for the null character
addi $t0,$t0,1 #add one to count 
addi $t2, $t2, 1 #add one to reg number 
j loop #jump back to loop 
exit:#exit label if condition is true 
 li $v0, 1 #load reg for int output 
 move $a0, $t0 #move to output reg 
 syscall
 li $v0, 10#load reg for close program 
 syscall
