.data
string: .asciiz "ThiS is A !@# Weird StrinG"
newline: .asciiz "\n"
.text
main:
la $t0, string # Load here the string
toLowerCase:
lb $t2, 0($t0) # We do as always, get the first byte pointed by the address
beqz $t2, end # if is equal to zero, the string is terminated
#if (character >= 'A'
blt $t2, 65, continue
upperCaseTest2:
# && character <= 'Z')
blt $t2, 90, isUpperCase
continue:
# Continue the iteration
 addi $t0, $t0, 1 # Increment the address
j toLowerCase
isUpperCase:
# add 32, so it goes lower case
addi $t2,$t2,32
 sb $t2, 0($t0) # store it in the string
 j continue # continue iteration as always
end:
li $v0, 4 # Print the string
la $a0, string
syscall
li $v0, 4 # A nice newline
la $a0, newline
syscall
# We have done, exit the program
li $v0, 10
syscall
