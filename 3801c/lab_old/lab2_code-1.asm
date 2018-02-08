.data 
#data to be saved 
out_string3: .asciiz "S_two = " 
#out put string
out_string: .asciiz "\Enter your 6 digits of your PID for A, B, C, D, E, and F respectively:\n"
#out put string
out_string1: .asciiz "S_ten = "
#out put string
out_string2: .asciiz "\n"
#out put string
.text
#End of text data 
li $v0, 4
#set reg for output 
la $a0, out_string
#output string 
syscall
#syscall
li $v0, 5
#set to input int
syscall
#sys call
move $t1, $v0
#move the value to reg t1
li $v0, 5
#set reg for output
syscall
#syscall
move $t2, $v0
#move the value to reg t2
la $t3, 0
#set reg t3 to 0
la $t0,0
#set reg t0 to 0
L1: bge $t0, $t2, EXIT
#run loop until reg t0 equalls reg t2
addi $t0, $t0, 1
# add 1 to reg t0
add $t3, $t3,$t1 
#add reg t3 and t1 to reg t3
j L1
#re loop
EXIT:
#exit 
move $t0,$t3
#move vale from reg t3 to t0 
li $v0, 5
#set reg for output
syscall
#syscall
move $t1, $v0
#move reg val v0 to t1
la $t3, 0
#set reg t3 to 0 
la $t4,0
#set reg t4 to 0
L2: bge $t4, 18, EXIT2
#loop untill reg t4 equall 18
addi $t4, $t4, 1
#add 1 to t4
add $t3, $t3,$t1
#add t3 and t1 to t3 
j L2
#re loop 
EXIT2:
#exit 
move $t1,$t3
#move reg t3 to t1
add $t0, $t0, $t1
# add t0 and t1 to t0
li $v0, 5
#set reg for input 
syscall
#syscall
move $t1, $v0
#move val v0 to t1
la $t3, 0
#set t3 to 0
la $t4,0
#set t4 to 0
L3: bge $t4, 9, EXIT3
#loop till t4 equalls 9
addi $t4, $t4, 1 
#add 1 to t4
sub $t3, $t3,$t1
#sub t1 and t3 from t3 
j L3
#re loop
EXIT3:
#exit 
move $t1,$t3
#move t3 to t1
add $t0, $t0, $t1
#add t1 and t0 to t0
li $v0, 5
#set system for int input 
syscall
#syscall
move $t1, $v0
#move input to t1
li $v0, 5
#set input for int 
syscall
#syscall
move $t2, $v0
#move input to t2
la $t3, 0
#set t3 to 0
la $t4,0
#set t4 to 0
L4: bge $t4, $t2, EXIT4
#loop until t4 equals t2
addi $t4, $t4, 1
#add a to t4
sub $t3, $t3,$t1
#sub t1 from t3 
j L4
# reloop
EXIT4:
#exit 
move $t1,$t3
# move t3 to t1
add $t0, $t0, $t1
# add t1 to t0
li $v0, 4
#set output string 
la $a0, out_string1
#output the string 
syscall
#syscall
li $v0, 1
#set output for int 
la $a0,($t0)
#output int
syscall
#syscall
li $v0, 4
#set output for string
la $a0, out_string2
#output string 
syscall
#syscall
li $v0, 4
#set output for string 
la $a0, out_string3
#output string 
syscall
#syscall
li $v0, 35
#set output as binary int 
la $a0, ($t0)
#output binary 
syscall
#syscall
li $v0, 10
#exit file
syscall 
#syscall
