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
out_string4: .asciiz "\S is divisible by 2!" 
#out put string
out_string5: .asciiz "\S is divisible by 3!" 
#out put string
out_string6: .asciiz "\S is divisible by 5!" 
#out put string
out_string7: .asciiz "\S is divisible by 7!" 
#out put string
out_string8: .asciiz "Remainder of division by 2 is  " 
#out put string
out_string9: .asciiz "Remainder of division by 3 is  " 
#out put string
out_string10: .asciiz "Remainder of division by 5 is  " 
#out put string
out_string11: .asciiz "Remainder of division by 7 is  " 
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

li $v0, 4
#set output for string
la $a0, out_string2
#output string 
syscall


move $t1, $t0
la $t3 , 0
L5: bge $t3, $t1, EXIT5
#loop until t3 equals t1
sub $t1, $t1,2
#sub 2 from t1 
j L5
# reloop
EXIT5:
#exit
slt $t6, $t1,$t3
#set $t6 truth value
beq $t6, 0, Else
#$if $t6 is false go to else 
add $t1, $t1, 2
#add 2 to $t1
li $v0, 4
#set output for string
la $a0, out_string8
#output string 
syscall
li $v0, 1
#set output for string
la $a0, ($t1)
#output string 
syscall
j Endif
#end 
Else:
#else do this
li $v0, 4
#set output for string
la $a0, out_string4
#output string 
syscall
Endif:
#end



li $v0, 4
#set output for string
la $a0, out_string2
#output string 
syscall

move $t1, $t0
la $t3 , 0
L6: bge $t3, $t1, EXIT6
#loop until t4 equals t3
sub $t1, $t1,3
#sub t4 from t1 
j L6
# reloop
EXIT6:
#exit
slt $t6, $t1,$t3
#set $t6 truth value
beq $t6, 0, Else1
#$if $t6 is false go to else 
add $t1, $t1, 3
#add 3 to $t1
li $v0, 4
#set output for string
la $a0, out_string9
#output string 
syscall
li $v0, 1
#set output for string
la $a0, ($t1)
#output string 
syscall
j Endif1
#end
Else1:
li $v0, 4
#set output for string
la $a0, out_string5
#output string 
syscall
Endif1:
#end
li $v0, 4
#set output for string
la $a0, out_string2
#output string 
syscall


move $t1, $t0
la $t3 , 0
L7: bge $t3, $t1, EXIT7
#loop until t4 equals t3
sub $t1, $t1,5
#sub t4 from t1 
j L7
# reloop
EXIT7:
#exit
slt $t6, $t1,$t3
#set truth value 
beq $t6, 0, Else2
#$if $t6 is false go to else 
add $t1, $t1, 5
li $v0, 4
#set output for string
la $a0, out_string10
#output string 
syscall
li $v0, 1
#set output for string
la $a0, ($t1)
#output string 
syscall
j Endif2
#end
Else2:
#else
li $v0, 4
#set output for string
la $a0, out_string6
#output string 
syscall
Endif2:
#end
li $v0, 4
#set output for string
la $a0, out_string2
#output string 
syscall

move $t1, $t0
la $t3 , 0
L8: bge $t3, $t1, EXIT8
#loop until t4 equals t3
sub $t1, $t1,7
#sub t4 from t1 
j L8
# reloop
EXIT8:
#exit
slt $t6, $t1,$t3
#set truth value
beq $t6, 0, Else3
#$if $t6 is false go to else 
add $t1, $t1, 7
#add 7 to $t1
li $v0, 4
#set output for string
la $a0, out_string11
#output string 
syscall
li $v0, 1
#set output for string
la $a0, ($t1)
#output string 
syscall
j Endif3
#end
Else3:
#else
li $v0, 4
#set output for string
la $a0, out_string7
#output string 
syscall
Endif3:
#end
li $v0, 4
#set output for string
la $a0, out_string2
#output string 
syscall



li $v0, 10
#exit file
syscall 
#syscall
