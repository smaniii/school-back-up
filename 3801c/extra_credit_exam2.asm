.data 
new_string: .asciiz "\n"
#out put string
.text
li $t0, 0
#set reg t0 to 0
li $t2, 70
li $t3, 0
li $t1, 101
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
move $t0, $t3 
li $v0, 1
la $a0, ($t0) 
syscall
#syscall
li $v0, 4
#set output for string 
la $a0, new_string
#output string 
syscall
li $v0, 35
la $a0, ($t0) 
syscall
li $v0, 4
#set output for string 
la $a0, new_string
#output string 
syscall
andi $t1, $t0 ,0x55
xori $t2,$t1,0x20
li $v0, 1
la $a0, ($t2) 
syscall
li $v0, 4
#set output for string 
la $a0, new_string
#output string 
syscall
li $v0, 10
#exit file
syscall 
#syscall
