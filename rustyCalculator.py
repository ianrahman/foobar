def answer(str):

    rpn=''
    stack = []

    for c in str:
        if c=='+':
            while len(stack)>0 and stack[len(stack)-1]=='*':
                rpn+=stack.pop()
            stack.append(c)
        elif c=='*':
            stack.append(c)
        else:
            rpn+=(c)
    while len(stack)>0:
        rpn+=stack.pop()
    return rpn

print answer("2+3*2")
print answer("2*4*3+9*3+5")